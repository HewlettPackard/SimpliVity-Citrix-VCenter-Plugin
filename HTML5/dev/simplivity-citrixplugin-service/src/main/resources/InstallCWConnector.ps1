
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)


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
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for VM $vmName in InstallCWCConnector Script" 
	#"APPLOG| Input parameters successfully read for VM $vmName in InstallCWCConnector Script" | WriteFile
	
	Get-Module -Name VMware* -ListAvailable | Import-Module 
    Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
    #Connect-viserver -server albanyvc.demo.local -Username $ovcUsername -Password $ovcPassword
	Write-Host "================ $vmName CWCCONNECTOR INSTALLATION SCRIPT START==============="
	
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
	
	Write-Output "----Step 2:: Installing CWCConnector and adding VM $vmName to the resource location------"
	##"APPLOG| ----Step 2:: Installing CWCConnector and adding VM $vmName to the resource location------" | WriteFile
	$params = "/q /CustomerName:$citrixCustomer /ClientId:$citrixClientId /ClientSecret:$citrixClientKey /Location:$resourceId /AcceptTermsOfService:true"
	$downloadsUri = 'https://downloads.cloud.com/'+$citrixCustomer+'/connector/cwcconnector.exe'
	#Write-Host "DownloadsURI: '$downloadsUri'"
	Write-Host "$vmName PARAMS: "$params
	$installscript = @"
	Set-ExecutionPolicy Unrestricted -Force
	Remove-Item -Force c:\cwcconnector.exe -ErrorAction SilentlyContinue
	[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
	Invoke-WebRequest -Uri '$downloadsUri' -OutFile "C:\cwcconnector.exe"
"@

	##"APPLOG| Starting Citrix Cloud installation on '$vmName'" | WriteFile
	Write-Host "Starting downloading Citrix Cloud installer on '$vmName'"
	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)
	Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds -WarningAction Ignore

	Write-Host "$vmName PARAMS:"$params
	$installscript = @"
	Set-ExecutionPolicy Unrestricted -Force
	[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
	Start-Process c:\cwcconnector.exe '$params' -Wait
"@
	start-sleep $sleep_time
	Write-Host "Starting Citrix Cloud installation on '$vmName'"
	Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds -WarningAction Ignore
	Write-Host "Checking whether the CWConnector is installed on '$vmName' or not"
	#"APPLOG| Checking whether the CWConnector is installed on '$vmName' or not" | WriteFile
	
	start-sleep 30
	$cmd = "Get-ItemProperty HKLM:\Software\Microsoft\Windows\CurrentVersion\Uninstall\* |Select-Object DisplayName"
	$cwcInstallConfirm = Invoke-vmScript -vm $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
	Write-Host "cwcInstallConfirm: "$cwcInstallConfirm.ScriptOutput
	if(! ($cwcInstallConfirm.ScriptOutput -Match "Citrix Cloud Services Connectivity Test Tool"))
	{
		#"ERRLOG| CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create" | WriteFile
		Write-Host "CWCConnector didnt get installed in VM $vmName.  So, trying to install agian on $vmName"
		#cleanUp $vm
		
			$installscript = @"
		Set-ExecutionPolicy Unrestricted -Force
		[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
		Start-Process c:\cwcconnector.exe '$params' -Wait
"@
		start-sleep 30
		Write-Host "Starting Citrix Cloud installation again on '$vmName'"
		Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds -WarningAction Ignore
		
		Write-Host "Checking whether the CWConnector is installed on '$vmName' or not"
		start-sleep 30
		$cmd = "Get-ItemProperty HKLM:\Software\Microsoft\Windows\CurrentVersion\Uninstall\* |Select-Object DisplayName"
		$cwcInstallConfirm = Invoke-vmScript -vm $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
		Write-Host "cwcInstallConfirm2: "$cwcInstallConfirm.ScriptOutput
		if(! ($cwcInstallConfirm.ScriptOutput -Match "Citrix Cloud Services Connectivity Test Tool"))
		{
			#"ERRLOG| CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create" | WriteFile
			Write-Error "CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create"
			#cleanUp $vm
		}
	
	}
	
	
	$vm = Get-vm -Name $vmName
	
	if($vm.VMHost.name -ne $vmHost)
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