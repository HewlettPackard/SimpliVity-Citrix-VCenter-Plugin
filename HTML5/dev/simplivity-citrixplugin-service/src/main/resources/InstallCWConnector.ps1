
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)

Write-Host "================ $vmName CWCCONNECTOR INSTALLATION SCRIPT START==============="
	#*******************************************************#
	#  MethodName : cleanUp              					#
	#  Input      : VM object            					#
	#  Description: Powers off the VM and removes the VM	#
	#*******************************************************#
				   
	function cleanUp{
		param ($vm)
		#***checking whether the VM is powered on*******************
		$vm = Get-VM -Name $vmName
		write-Host "inside cleanUp function 32: "$vm.PowerState
		if($vm.PowerState -ne 'PoweredOff')
		{
			
			#"APPLOG| Powering off the VM '$vmName'" | WriteFile
			Write-Host "Powering off the VM '$vmName'"
			$res = Stop-VM -VM $vm -Confirm:$false
			if((!($res|select PowerState) -Match 'PoweredOff'))
			{
				#"ERRLOG| Unable to power of the VM '$vmName'" | WriteFile
				Write-Host "Unable to power of the VM '$vmName'"
				exit 1
			}
		}
		#"APPLOG| Remove the VM '$vmName'" | WriteFile
		Write-Host "Remove the VM '$vmName'"
		Remove-VM -VM $vm -confirm:$false
		exit 1
	}
	
	filter WriteFile {
	Try {
		"$(Get-Date -Format s)|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII
		}
		Catch{
		Write-Host "Error occured while writing to log file"
		Write-Host "Error: $_.ExceptionItemName $_.Exception.Message"
		} 
	}
	#"APPLOG| Starting script to create VM and install Citrix Cloud connector" | WriteFile
	Write-Host #"APPLOG| Starting script to create VM and install Citrix Cloud connector"

	########## BEGIN INPUT DATA VALIDATION ###########
	if (-NOT (Test-Path $inputfile)) {
		#"ERRLOG| Input Data file is not present in the given path $inputfile" | WriteFile
		Write-Error "Input Data file is not present in the given path $inputfile"
		exit 1
	}

	############### BEGIN READ DATA  #################

	Try {
		$file = Split-Path $inputfile -Leaf
		$base_dir = Split-Path $inputfile -Parent
		Import-LocalizedData -BindingVariable input -BaseDirectory $base_dir -FileName $file

		# Read input for VM Creation
		$vmName = $input.vm.name
		$vmHost = $input.vm.host
		$vmUsername = $input.vm.username
		$vmPassword = $input.vm.password
		
		# Read Active Directory
		$adDomain = $input.ad.domain
		$adUsername  = $input.ad.username
		$adPassword = $input.ad.password
		
		# Citrix details
		$citrixCustomer = $input.citrix.customerName
		$citrixClientId = $input.citrix.clientId
		$citrixClientKey = $input.citrix.clientKey
		$citrixResourceLocation = $input.citrix.resourceLocation
		
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$ovcUsername = $input.ovc.ovcusername
		$ovcPassword = $input.ovc.ovcpassword
		$vcenterHostname = $input.ovc.hostname
		
		# Read the logging file
		$execution_log = $input.logging.execution
		$output_log = $input.logging.output

    }

	Catch {
       #"ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	if (-Not ($vmName -And $vcenterHostname -And $citrixCustomer -And $citrixClientId -And $citrixClientKey -And $citrixResourceLocation -And $ovcUsername -And $ovcPassword) ) {
		#"ERRLOG| Few or all the required parameters are missing" | WriteFile
		Write-Error "NO_REQUIRED_PARAMETERS_INSTALL_CWC"
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for VM $vmName in InstallCWCConnector Script" 
	#"APPLOG| Input parameters successfully read for VM $vmName in InstallCWCConnector Script" | WriteFile
	
	Get-Module -Name VMware* -ListAvailable | Import-Module 
   # Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
    #Connect-viserver -server albanyvc.demo.local -Username $ovcUsername -Password $ovcPassword
	try {
		Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword -ErrorAction Stop
	}
	catch [VMware.VimAutomation.ViCore.Types.V1.ErrorHandling.InvalidLogin]{
		Write-Error "INVALID_LOGIN"
		exit -1
	}
	catch [VMware.VimAutomation.Sdk.Types.V1.ErrorHandling.VimException.ViServerConnectionException]{
		Write-Error "SERVER_CONNECTION_ERROR"
		exit -1
	}
	catch
    {Write-Error "UNABLE_TO_CONNECT_SERVER Other issue"}
	
	$vm = Get-VM -Name $vmName
	
	Write-Host "Creating the security token using Citrix Credentials"
	#"APPLOG| Creating the security token using Citrix Credentials" | WriteFile
	$baseUri  = "https://registry.citrixworkspacesapi.net"
	$body = @{}

	$body.Add("clientId", $citrixClientId)

	$body.Add("clientSecret", $citrixClientKey)
	
	$uri = "https://trust.citrixworkspacesapi.net/" +  $citrixCustomer + "/tokens/clients"
	
	$temp = Convertto-json $body
	$sleep_time = 20
	
	$response = Invoke-RestMethod -Method Post -Body $temp -Uri $uri -ContentType 'application/json'
	$token = $response.token
	
	Write-Host "$vmName Citrix Security token got created"
	#"APPLOG| $vmName Citrix Security token got created" | WriteFile
	
	$headers = @{}
	$headers.Add("Authorization", "CWSAuth bearer=$token")
	$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/resourcelocations"
	$resources =  Invoke-RestMethod -Uri $uri -Method "Get" -ContentType "application/json" -Headers $headers 
	
	foreach($resource in $resources.items) {
		
		if ($resource.name -eq $citrixResourceLocation) {
			$resourceId = $resource.id
			break;
		 }
	}
	
	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)
	$downloadsUri = 'https://downloads.cloud.com/'+$citrixCustomer+'/connector/cwcconnector.exe'
	$params = "/q /CustomerName:$citrixCustomer /ClientId:$citrixClientId /ClientSecret:$citrixClientKey /Location:$resourceId /AcceptTermsOfService:true"
	
	Write-Host "$vmName : Downloading cloud connector on $vmName in the path c:\cwcconnector.exe!!"
	$installscript = @"
	Remove-Item -Force c:\cwcconnector.exe -ErrorAction SilentlyContinue
	[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
	Invoke-WebRequest -Uri '$downloadsUri' -OutFile "C:\Users\Public\cwcconnector.exe"
"@

	$installOutpt = Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds
	if($installOutpt -ne $null)
	{
		Write-Host "CWCConnctor installed successfully for $vmName"
	}
	else
	{
		Write-Error "CWC_INSTALLER_DOWNLOAD_FAILED"
		Write-Error "Error occured during download of cwcconnector.exe for $vmName"
	}

	Start-sleep 30
	Write-Host "$vmName : Starting Cloud connector installation with parameters $params –Wait"
	$installscript = @"
	[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
	Start-Process c:\Users\Public\cwcconnector.exe '$params' -NoNewWindow -Wait
"@
	
	$installOutpt = Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds
	
	if ($installOutpt -ne $null) {
        
         Write-Host "$vmName : Citrix Cloud connector installation completed!!"
	} else {
        
		Write-Error "CWC_INSTALLATION_FAILED"
        Write-Error "$vmName : Failed to install Citrix Cloud connector!!"
		cleanUp $vm
        exit 1
	}
	
	$vm = Get-vm -Name $vmName
	Write-Host "Checking the host of the VM "$vmName
	$hostName = $vm.VMHost.name
	Write-Host "Host of the VM created "$hostName
	Write-Host "Expected host: "$vmHost
	
	$hostName2 = Get-VMHost -VM $vm
	Write-Host "One more way to get host name: "$hostName2.Name
	if($hostName -ne $vmHost)
	{
		write-Host "Migrate the Virtual machine "$vmName" to "$vmHost
		#"APPLOG| Migrate the Virtual machine "+$vmName+" to "+$vmHost  | WriteFile
		
		$vmHost = Get-VMHost -Name $vmHost
		Write-Host "VMHOST FROM INPUT: "$vmHost
		
		start-sleep $sleep_time
		Move-VM -VM $vm -Destination $vmHost -ErrorAction Ignore
		start-sleep $sleep_time
		
		$vm = Get-vm -Name $vmName
		Write-Host "VM  host :" $vm.VMHost.Name
	}   

	##"APPLOG| END -  Citrix Cloud installation completed" | WriteFile
	#Write-Host "END -  Citrix Cloud installation completed"
	Write-Host "================ $vmName CWCCONNECTOR INSTALLATION SCRIPT END==============="