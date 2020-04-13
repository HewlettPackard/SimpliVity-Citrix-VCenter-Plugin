
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)

Write-Host "================ $vmName COMPUTER NAME CHANGE SCRIPT START==============="
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
		##"APPLOG| Remove the VM '$vmName'" | WriteFile
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
		$vmUsername = $input.vm.username
		$vmPassword = $input.vm.password
		
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

	if (-Not ($vmName -And $vcenterHostname -And $ovcUsername -And $ovcPassword) ) {
		#"ERRLOG| Few or all the required parameters are missing" | WriteFile
		Write-Error "NO_REQUIRED_PARAMETERS_FOR_CHANGING_COMPUTER_NAME"
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for Computer name change of VM $vmName" 
	#"APPLOG| Input parameters successfully read for Computer name change of VM $vmName" | WriteFile
	
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
	
	$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword)
	
	$vm = Get-VM -Name $vmName
	Write-Host "Changing the computer name to '$vmName'"
	#"APPLOG| Changing the computer name to '$vmName'" | WriteFile
	$cmd = "Rename-Computer -NewName '$vmName' -Restart"
	Invoke-VMScript -VM $vm -ScriptType Powershell -ScriptText $cmd -GuestCredential $localcreds  -ErrorAction Ignore -WarningAction Ignore
	Start-Sleep -s 30
	
	$computerName = (Get-VM -Name $vmName).Guest.HostName
	Write-Host "Post computer name change of $vmName : "$computerName
	if($computerName -ne $vmName)
	{
		Write-Error "COMPUTER_NAME_CHANGE_FAILED"
		Write-Error "Changing the computer name to $vmName failed."
		cleanUp $vm
		exit -1
	}
	Write-Host "================ $vmName COMPUTER NAME CHANGE SCRIPT END==============="