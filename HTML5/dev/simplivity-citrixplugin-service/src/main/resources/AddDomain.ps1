
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
		Write-Host "$vmName Entered pingIP function:"$vmIP
				
		$cmd_disablefirewall ="Set-NetFirewallProfile -Profile Domain,Public,Private -Enabled False"
		$count = 30

		Write-Host "Checking whether the VM is up......"

		While ($count) {
			Start-Sleep -s 5
			Write-Host "VMIP for $vmName::$count---->$vmIP"
			try
			{
				if (Test-Connection -ComputerName  $vmIP -Count 1 -Quiet) {
					##"APPLOG| PingIp function : Able to ping the VM $vmName...." | WriteFile
					Write-Host "PingIp function : Able to ping the VM $vmName...."
					$count = 0
					return $true
					
				}
				Write-Host -NoNewLine "."
				if ($count -eq 12 ){
					Write-Host "Disabling the Firewall fr the VM $vmName"
					##"APPLOG| Disabling the Firewall fr the VM $vmName" | WriteFile
					$firewallOutput = Invoke-VMScript -VM $vm -ScriptText $cmd_disablefirewall -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
				}
				$count = $count - 1
				if ($count -eq 0) {
					#"ERRLOG| Unable to ping the VM $vmName " | WriteFile
					Write-Error "UNABLE_TO_PING_VM"
					Write-Error "Unable to ping the VM $vmName"
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
	Write-Host "Debug: Input file : $inputfile"
	filter WriteFile {
	Try {
		"$(Get-Date -Format s)|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII
		}
		Catch{
		#Write-Host "Error occured while writing to log file"
		#Write-Host "Error: $_.ExceptionItemName $_.Exception.Message"
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
		
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$platform = $input.ovc.platform
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

	if (-Not ($vmName -And $adDomain -And $adUsername -And $vcenterHostname -And $adPassword -And $ovcUsername -And $ovcPassword) ) {
		#"ERRLOG| Few or all the required parameters are missing" | WriteFile
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for Domain Change script: VM $vmName" 
	#"APPLOG| Input parameters successfully read for Domain Change script:  VM $vmName" | WriteFile
	
	Get-Module -Name VMware* -ListAvailable | Import-Module 
    #Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
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
	Write-Host "================ $vmName ADDING VM TO DOMAIN SCRIPT START==============="
	
	$vm = Get-VM -Name $vmName
	$vmIP = ((Get-VM -Name $vmName).Guest.IPAddress[0])
	if( $vmIP -Match "[a-z]")
	{
				#"ERRLOG| Got IPv6 address instead of IPv4 address '$vmIP' for VM $vmName" | WriteFile
				Write-Error "GOT_IPV6_ADDRESS"
				Write-Error "Got IPv6 address instead of IPv4 address '$vmIP' for VM $vmName"
				cleanUp $vm
				exit -1
	}

	$cmd = @"
	`$password = ConvertTo-SecureString '$adPassword' -AsPlainText -Force 
	`$adCreds = New-Object PSCredential('$adUsername', `$password)
	Add-Computer -DomainName '$adDomain' -Credential `$adCreds -Force -Restart
"@

	Write-Host "Command to add VM $vmname to domain "$cmd
	#"APPLOG| ----------Adding '$vmName' to AD domain '$adDomain'------------"  | WriteFile
	Write-Host "----------Adding '$vmName' to AD domain '$adDomain'------------"	  

	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)
	
	$domainResult = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds  -ErrorAction Ignore -WarningAction Ignore
	
	if($domainResult.ScriptOutput)
	{
		Write-Host "Error in adding domain!"
	}
	else
	{
		Write-Host "NoError iin Adding the domain script "
	}

	Start-Sleep -s 20
	Write-Host -NoNewLine "Waiting for reboot of VM $vmName"

	
	$pingResponse = pingIp($vmIP)
	if(!$pingResponse)
	{
			#"ERRLOG| VM $vmName didnt come up after updating domain" | WriteFile
			Write-Error "VM $vmName didnt come up after updating domain"
			exit 1
			
	}
	
	Start-Sleep -s $sleep_time
	Write-Host (Get-VM $vmName).Guest.HostName

	if( !((Get-VM $vmName).Guest.HostName -Match $adDomain))
	{
		Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds  -ErrorAction Ignore -WarningAction Ignore
		#Start-Sleep -s 150
		$pingResponse = pingIp($vmIP)
		if(!$pingResponse)
		{
			#"ERRLOG| VM $vmName didnt come up after domain change" | WriteFile
			Write-Error "VM_DIDNT_COME_UP_POST_DOMAIN_ADDITION"
			Write-Error "VM $vmName didnt come up after domain change"
			exit 1
			
		}
		else
		{
			Write-Host "VM '$vmName' is up after domain change "
		}
		
	}

	Start-Sleep -s $sleep_time
	
	Write-Host "$vmName Computr Name: "(Get-VM $vmName).Guest.HostName

	if( !((Get-VM $vmName).Guest.HostName -Match $adDomain))
	{
		#"ERRLOG| VM $vmName didnt get added to domain" | WriteFile
		Write-Error "VM_NOT_ADDED_TO_DOMAIN"
		Write-Error "VM $vmName didnt get added to domain"
		cleanUp $vm
		exit 1
}
Write-Host "================ $vmName ADDING VM TO DOMAIN SCRIPT END==============="