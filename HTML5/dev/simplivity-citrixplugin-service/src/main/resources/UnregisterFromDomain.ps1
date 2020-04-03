	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputFile,
		
		[string]
		$logFile
	) 


	$TrustUri = "https://trust.citrixworkspacesapi.net"
	$baseUri  = "https://registry.citrixworkspacesapi.net"
	$hostname = $(hostname)
	
	filter WriteFile {
	Try {
		"$(Get-Date -Format s)|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII
		}
		Catch{
		Write-Host "Error occured while writing to log file"
		Write-Host "Error: $_.ExceptionItemName $_.Exception.Message"
		}
	}

	############### END USER VARIABLES ###############

	Write-Host "================ $vmName UNREGISTERING VM FROM DOMAIN SCRIPT START==============="

	########## BEGIN INPUT DATA VALIDATION ##########
	if (-NOT (Test-Path $inputFile)) {
		##"APPLOG Input Data file is not present in the given path $inputFile" | WriteFile
		Write-Error "Input Data file is not present in the given path $inputFile"
		exit 1
	}
	########### END INPUT DATA VALIDATION ############

	############### BEGIN READ DATA  #################

	Try {
		$file = Split-Path $inputFile -Leaf
		$baseDir = Split-Path $inputFile -Parent
		Import-LocalizedData -BindingVariable input -BaseDirectory $baseDir -FileName $file

		# Read input for VM Creation
		$vmName = $input.vm.name
		$vmUsername = $input.vm.username
		$vmPassword = $input.vm.password
		$vmIP = ""
		
		# Read Active Directory
		$adUsername  = $input.ad.username
		$adPassword =  $input.ad.password
		#$pass_word = [System.Text.Encoding]::Unicode.GetString([System.Convert]::FromBase64String($input.svt.password))
		
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$ovcUsername = $input.ovc.ovcusername
		$ovcPassword = $input.ovc.ovcpassword
		$vcenterHostname = $input.ovc.hostname

		# Read the logging file
		$execution_log = $input.logging.execution
		$output_log = $input.logging.output
	} Catch {
		##"APPLOG Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message" |  WriteFile
		Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message"
		exit 1
	}

	if (-Not ($vmName -And $vcenterHostname -And $vmUsername -And $vmPassword -And $adUsername -And $adPassword -And $ovcUsername -And $ovcPassword) ) {
		##"APPLOG Few or all the required parameters are missing" | WriteFile
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
		
	Write-Host "Input parameters successfully read for unregister from damain VM $vmName" 
	##"APPLOG| Input parameters successfully read for unregister from damain VM $vmName" | WriteFile
	set-PowercliConfiguration -InvalidCertificateAction Ignore -Confirm:$false
	Get-Module -Name VMware* -ListAvailable | Import-Module 
	Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
	#Connect-viserver -server albanyvc.demo.local -Username $ovcUsername -Password $ovcPassword	
	
	function cleanUp{
		param ($vm)
		#***checking whether the VM is powered on*******************
		$vm = Get-VM -Name $vmName
		
		if($vm.PowerState -ne 'PoweredOff')
		{
			##"APPLOG| Powering off the VM '$vmName'" | WriteFile
			Write-Host "Powering off the VM '$vmName'"
			
			$res = Stop-VM -VM $vm -Confirm:$false
			if((!($res|select PowerState) -Match 'PoweredOff'))
			{
				##"APPLOG Unable to power of the VM '$vmName'" | WriteFile
				Write-Host "Unable to power of the VM '$vmName'"
				exit 1
			}
		}
		##"APPLOG| Remove the VM '$vmName'" | WriteFile
		Write-Host "Remove the VM '$vmName'"
		Remove-VM -VM $vm -confirm:$false
		exit 1
	}
	
	#"APPLOG| Unjoin $vmName from AD domain $domain" | WriteFile 
	Write-Host "Unjoin $vmName from AD domain $domain"
	
	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)

	$cmd = @"
	`$password = ConvertTo-SecureString '$adPassword' -AsPlainText -Force 
	`$adCreds = New-Object PSCredential('$adUsername', `$password)
	Remove-Computer -UnjoinDomainCredential `$adCreds -Force -Restart
"@
	Write-Host $cmd
	$vm = Get-VM -Name $vmName
	$res = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
	$vmIP =""
	sleep(10)
	$count = 20
	while ($vmIP -eq $null) {
		Start-Sleep -s 10
		Write-Host -NoNewLine "."

		if ($count -eq 0) {
		#"APPLOG VM $vmName doesn't start properly"
		Write-Error "VM $vmName doesn't start properly"
			exit 1
		}
		$count = $count - 1
		#write-Host "Count = "$count
		$vmIP = ((Get-VM -Name $vmName).Guest.IPAddress[0])
		## check pattern match for ipv4
		if( $vmIP -Match "[a-z]")
		{
			#"APPLOG Got IPv6 address instead of IPv4 address '$vmIP'" | WriteFile
			Write-Error "Got IPv6 address instead of IPv4 address '$vmIP'"
			cleanUp $vm
			exit -1
		}
		write-Host "VMIP = "$vmIP
		
	}

	#"APPLOG| Removed '$vmName' entry from Active Directory" | WriteFile 
	Write-Host "Removed '$vmName' entry from Active Directory"

	$defaultDomain = "WORKGROUP"
	if( !(Get-VM $vmName).Guest.HostName -Match $defaultDomain)

	{
		#"APPLOG VM $vmName didnt get unjoined from domain" | WriteFile
		Write-Error "VM $vmName didnt get unjoined from domain"
		cleanUp $vm
		exit 1
	}

	Write-Host "Powering off the VM $vmName "
	Stop-VM -VM $vm -Confirm:$false
	Write-Host "Removing the VM $vmName "
	Remove-VM -VM $vm -Confirm:$false

Write-Host "================ $vmName UNREGISTERING VM FROM DOMAIN SCRIPT END==============="