
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)

$sleep_time = 10
	#********************************************************#
	#  MethodName : pingIp              		         #
	#  Input      : VM IP                                    #
	#  Description: At regular interval $vmIp will be pinged #
	#********************************************************#
				   
	function pingIp{

		param ($vmIP)
		$vm = Get-VM -Name $vmName
		Start-Sleep -s $sleep_time
		Write-Host "Paramater to pingIP:"$vmIP
		Write-Host "Log File:"$logFile
		
		$cmd_disablefirewall ="Set-NetFirewallProfile -Profile Domain,Public,Private -Enabled False"
		$count = 30

		Write-Host "Checking whether the VM is up......"

		While ($count) {
			Start-Sleep -s 5
			
			try
			{
				if (Test-Connection -ComputerName  $vmIP -Count 1 -Quiet) {
					#"APPLOG| PingIp function : Able to ping the VM $vmName...." | WriteFile
					Write-Host "PingIp function : Able to ping the VM $vmName...."
					$count = 0
					return $true
					
				}
				Write-Host -NoNewLine "."
				if ($count -eq 12 ){
					Write-Host "Disabling the Firewall fr the VM $vmName"
					#"APPLOG| Disabling the Firewall fr the VM $vmName" | WriteFile
					$firewallOutput = Invoke-VMScript -VM $vm -ScriptText $cmd_disablefirewall -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
				}
				$count = $count - 1
				if ($count -eq 0) {
					#"ERRLOG| Unable to ping the VM $vmName " | WriteFile
					#Write-Error "UNABLE_TO_PING_IP"
					#Write-Error "Unable to ping the VM $vmName"
					#cleanUp $vm
					#exit 1
					return $false 
				}
			}
			Catch
			{
				#"ERRLOG| Test-Connection Failed $_.ExceptionItemName  $_.Exception.Message" | WriteFile
				Write-Error "EXCEPTION_PING_IP"
				Write-Error " $_.ExceptionItemName $_.Exception.Message"
			}
		}
	}

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
		$vmTemplate = $input.vm.template
		$vmNetwork = $input.vm.network
		$vmHost = $input.vm.host
		$vmUsername = $input.vm.username
		$vmPassword = $input.vm.password
		
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$platform = $input.ovc.platform
		$ovcUsername = $input.ovc.ovcusername
		$ovcPassword = $input.ovc.ovcpassword
		$vcenterHostname = $input.ovc.hostname
				
		#Model details
		if( $platform -Match $true)
		{
			$modelName = $input.platform.model
		}
		
		#StaticIPDetails
		$isStatic = $input.vm.isstatic
		if ($isStatic -eq "true")
		{
			$staticIP = $input.vm.ip
			$prefixLength = $input.vm.prefixlength
			$gateway = $input.vm.gateway
			$dnsserver = $input.vm.dnsserver
		}

		# Read the logging file
		$execution_log = $input.logging.execution
		$output_log = $input.logging.output

    }

	Catch {
       #"ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	if (-Not ($vmName -And $vmTemplate -And $vcenterHostname -And $ovcUsername -And $ovcPassword) ) {
		#"ERRLOG| Few or all the required parameters are missing for $vmName" | WriteFile
		Write-Error "NO_REQUIRED_PARAMETERS_FOR_CLONING"
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for $vmName" 
	#"APPLOG| Input parameters successfully read" | WriteFile
	
	#Write-Host "MODEL NAME READ for $vmName: $modelName"
	Get-Module -Name VMware* -ListAvailable | Import-Module 
    #Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
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
	
	Write-Host "================ $vmName CLONING OF VM SCRIPT START==============="
	
	$template = Get-Template -Name $vmTemplate

	if( !$template)
	{
		#"ERRLOG| Failed to get template $template $_.ExceptionItemName. $_.Exception.Message" | WriteFile
		Write-Error "NO_TEMPLATE_FOUND"
		Write-Error "Failed to get template $template $_.ExceptionItemName. $_.Exception.Message"
		exit -1
	} 
	
	if ( $platform -Match $false)
	{
		Write-Host "Entered into Simplivity API $vmName"
		#"APPLOG| Entered into Simplivity API $vmName" | WriteFile
		
		add-type @"
		using System.Net;
		using System.Security.Cryptography.X509Certificates;
		public class TrustAllCertsPolicy : ICertificatePolicy {
			public bool CheckValidationResult(
				ServicePoint srvPoint, X509Certificate certificate,
				WebRequest request, int certificateProblem) {
				return true;
			}
		}
"@
	[System.Net.ServicePointManager]::CertificatePolicy = New-Object TrustAllCertsPolicy
		# Set the base URL for REST API requests.
		$BASE_URL = "https://"+$ovcIP+"/api/"
		# Set the username and password.
		$hms_username = $ovcUsername
		$hms_password = $ovcPassword
		$sleep_time = 10 

		# Create a base64 encoding for HTTP authentication.
		$base64AuthInfo = [Convert]::ToBase64String([Text.Encoding]::ASCII.GetBytes(("{0}:{1}" -f "simplivity","")))
		Write-Host "base64AuthInfo="$base64AuthInfo
		# Create a JSON body with username, password, and grant_type.
		$body = @{grant_type='password';username=$hms_username;password=$hms_password}

		# Authenticate user and generate access token.
		$url = $BASE_URL+'oauth/token'
		Write-Host "$vmName Simplivity Token URL:"$url
		$header = @{Authorization=("Basic {0}" -f $base64AuthInfo)}

		$response= Invoke-RestMethod -Uri $url -Headers $header -Body $body -Method Post 
		$access_token = $response.access_token;
		Write-Host "$vmName Simplivity Token "$access_token

		if(!$access_token)
		{
			Write-Error "ACCESS_TOKEN_CREATION_FAILED"
			Write-Error "SimpliVity Access Token creation failed for $vmName, please make sure that you provide correct credentials of OVC."
		}
		# Add the access_token to the header.
		$header =@{Authorization='Bearer '+$access_token}

		#Write-host "Template Name "$vmTemplate
		$url = $BASE_URL+"/virtual_machines?name="+$vmTemplate
		$vms = Invoke-RestMethod -Header $header -Uri $url
		$templateid = $vms.virtual_machines.id
		Write-Host "TemplateID::"$templateid
		
		if(!$templateid)
		{
			Write-Error "NO_TEMPLATE_FOUND"
			Write-Error "No template found with the name $vmTemplate"
			exit 1
		}

		$body = @{virtual_machine_name=$vmName}
		$body = $body | ConvertTo-Json
		Write-Host "body =="$body
		$url = $BASE_URL + 'virtual_machines/'+$templateid+'/clone';
		Write-Host "$vmName Simplivity Clone URL: "$url
		$response= Invoke-RestMethod -Uri $url -Headers $header -Body $body -Method Post -ContentType 'application/vnd.simplivity.v1+json'
		Write-Host "$vmName Simplivity Clone Response: "$response
		start-sleep $sleep_time
		$vmtemp = Get-Template -Name $vmName
		if(!$vmtemp)
		{
			Write-Error "SIMPLIVITY_CLONE_FAILED"
			Write-Error "VM $vmName creation failed!"
			exit 1
		}
		$vmtemp = Get-Template -Name $vmName | Set-Template -ToVM
		Start-sleep 20
		
		$vmtemp = Get-VM -Name $vmName
		if(!$vmtemp)
		{
			Write-Error "SIMPLIVITY_CLONE_FAILED"
			Write-Error "VM $vmName creation failed!"
			exit 1
		}
		
	}
	else{
		Write-Host "Cloning VM using POWERCLI comands $vmName"
		#"APPLOG| Cloning VM using POWERCLI comands $vmName" | WriteFile
		New-VM -Template $template -Name $vmName -VMHost $vmHost
		Write-Host "Finished Cloning VM using POWERCLI comands $vmName "
		#"APPLOG| Finished Cloning VM using POWERCLI comands $vmName" | WriteFile
	}

	start-sleep $sleep_time
	$vm = Get-vm -Name $vmName
	Write-Host "Getting VM post Sleep $vmName "
	
	if(!$vm)
	{
		Write-Error "VM_CREATION_FAILED"
		Write-Error "VM $vmName creation failed!"
	}
	Start-VM -VM $vm
	write-Host "Powering on new Virtual machine $vmName"
	#"APPLOG| Powering on new Virtual machine $vmName" | WriteFile
	start-sleep 30
	
	write-Host "***************** VM ip address ***************"

	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)

	if ($isStatic -eq "true")
	{
		Write-Host "Assigning staticIP $staticIP to the VM $vmName"
		$cmd = @"
		New-NetIPAddress -IPAddress '$staticIP' -DefaultGateway '$gateway' -PrefixLength '$prefixLength' -InterfaceIndex (Get-NetAdapter).InterfaceIndex
		Set-DNSClientServerAddress -InterfaceIndex (Get-NetAdapter).InterfaceIndex -ServerAddresses '$dnsserver'
"@
		Write-Host "Command for Static IP change"
		Write-Host $cmd
		$ts = 30
		Invoke-VMScript -VM $vm -ScriptType Powershell -ScriptText $cmd -GuestCredential $localcreds #-ErrorAction Ignore -WarningAction Ignore
		start-sleep $ts
		$pingResponse = pingIp($staticIP)
		Write-Host "PING RESPONSE:"$pingResponse
		if(!$pingResponse)
		{
				#"ERRLOG| VM $vmName didnt come up after assigning static IP" | WriteFile
				Write-Error "VM_DIDNT_COMEUP"
				Write-Error "VM $vmName didnt come up after assigning static IP. Please make sure that the static IP given is free"
				
				exit 1
				
		}	
		start-sleep 30
		$vm = Get-VM -Name $vmName
		$newIP = ($vm.Guest.IPAddress[0])
		Write-Host "NEW IP::"$newIP
		Write-Host "STATIC IP::"$staticIP
		if ($newIP -ne $staticIP)
		{
			Write-Error "ERRLOG|Static IP assignment Failed. Please make sure that the static IP given is free"
			Write-Error "STATIC_IP_ASSGIGNMENT_FAILED"
			#"ERRLOG|Static IP assignment Failed. Please make sure that the static IP given is free" | WriteFile
			cleanUp $vm
			exit -1
		}
		$vmIP = $newIP
	}
	else
	{
		
		write-Host -NoNewLine "Waiting for the IP of VM $vmName"
		#"APPLOG| Waiting for the IP of VM $vmName" | WriteFile


		$count = 20
		while ($vmIP -eq $null) {
			Start-Sleep -s 10
			Write-Host -NoNewLine "."

			if ($count -eq 0) {
				#"ERRLOG| VM $vmName doesn't start properly"  | WriteFile
				Write-Error "VM $vmName doesn't start properly"
				exit 1
			}
			$count = $count - 1
			#write-Host "Count = "$count
			$vmIP = ((Get-VM -Name $vmName).Guest.IPAddress[0])
			## check pattern match for ipv4
			if( $vmIP -Match "[a-z]")
			{
				#"ERRLOG| Got IPv6 address instead of IPv4 address '$vmIP' for VM $vmName" | WriteFile
				Write-Error "IPV6_ASSIGNMENT"
				Write-Error "Got IPv6 address instead of IPv4 address '$vmIP' for VM $vmName"
				cleanUp $vm
				exit -1
			}
			write-Host "$vmName VMIP = "$vmIP
		}
		
		Write-Host "Finished IP fetching for VM $vmName : $vmIP"
	}
	
	Write-Host "================ $vmName CLONING OF VM SCRIPT END==============="