param(
	[Parameter(Mandatory=$true)]
	[string]
	$inputFile,
	
	[string]
	$logFile
)
Write-Host "================ $vmName UNINSTALLING CWCCONNECTOR FROM VM SCRIPT START==============="
$TrustUri = "https://trust.citrixworkspacesapi.net"
$baseUri  = "https://registry.citrixworkspacesapi.net"
$hostname = $(hostname)

filter WriteFile {
Try {
	"$(Get-Date -Format s)|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII
	}
	Catch{
	#Write-Host "Error occured while writing to log file"
	#Write-Host "Error: $_.ExceptionItemName $_.Exception.Message"
	}
}
	########## BEGIN INPUT DATA VALIDATION ##########
	if (-NOT (Test-Path $inputFile)) {
		#"ERRLOG| Input Data file is not present in the given path $inputFile" | WriteFile
		Write-Error "Input Data file is not present in the given path $inputFile"
		exit 1
	}
	
	Write-Host "================ $vmName UNINSTALLING CWCCONNECTOR FROM VM SCRIPT START==============="
	
	########### END INPUT DATA VALIDATION ############

	Try {
		$file = Split-Path $inputFile -Leaf
		$baseDir = Split-Path $inputFile -Parent
		Import-LocalizedData -BindingVariable input -BaseDirectory $baseDir -FileName $file

		# Read input for VM Creation
		$vmName = $input.vm.name
		$vmUsername = $input.vm.username
		$vmPassword = $input.vm.password
		$vmIP = ""
				
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$ovcUsername = $input.ovc.ovcusername
		$ovcPassword = $input.ovc.ovcpassword
		$vcenterHostname = $input.ovc.hostname
		$psexecPath = $input.ovc.psexepath

		# Read the logging file
		$execution_log = $input.logging.execution
		$output_log = $input.logging.output
	} Catch {
		#"ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message" |  WriteFile
		Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message"
		exit 1
	}

	if (-Not ($vmName -And $vcenterHostname -And $vmUsername -And $vmPassword -And $ovcUsername -And $ovcPassword) ) {
		Write-Error "NO_REQUIRED_PARAMETERS_UNINSTALL_CWC"
	    Write-Error "Few or all the required parameters are missing"
	    exit 1
	}
	
	Write-Host "Input parameters successfully read for uninstall CWCConnector from VM $vmName" 
	#"APPLOG| Input parameters successfully read for uninstall CWCConnector from VM $vmName" | WriteFile
	set-PowercliConfiguration -InvalidCertificateAction Ignore -Confirm:$false
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
	$vm = Get-VM -Name $vmName

	if(!$vm)
	{
		Write-Error "FAILED_TO_GET_VM"
		Write-Error "Failed to find  VM $vmName $_.ExceptionItemName. $_.Exception.Message"
		exit -1
	}

	$vmIP = (($vm).Guest.IPAddress[0])
	Write-Host "VM IP is  '$vmIP'"
	#"APPLOG| VM IP is  '$vmIP'" | WriteFile
	## check pattern match for ipv4
	if( $vmIP -Match "[a-z]")
	{
		Write-Error "GOT_IPV6_ADDRESS"
		Write-Error "Got IPv6 address instead of IPv4 address '$vmIP'"
		cleanUp $vm
		exit -1
	}
	
	$cmd = 'C:\Users\Public\cwcconnector.exe /uninstall /q'
	$uninstallscript = @"
	Set-ExecutionPolicy Unrestricted
	Out-File -FilePath C:\Users\Public\ConnectorUninstall.cmd -InputObject '$cmd' -Encoding ascii
"@

	$vmPassword1 = ConvertTo-SecureString $vmPassword -AsPlainText -Force
	$localCreds = New-Object PSCredential($vmUsername, $vmPassword1)

	$logFile = "C:\Users\Public\uninstall_script.log"
	# --working
	Write-Host "Checking whether CWConnector is installed or not"
	#"APPLOG| Checking whether CWConnector is installed or not" | WriteFile
	$uninstallationResult = Invoke-VMScript -VM $vm -ScriptText $uninstallscript -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
	Write-Host "$vmName DECONFIGURE OUTPUT::"$uninstallationResult
	
	if($uninstallationResult -ne $null)
	{
		Write-Host "Uniinstallation completed for $vmName"
	}
	else
	{
		Write-Error "UNINSTALL_FAILED"
		Write-Error "Failed to unistall the CWC connector from VM $vmName"
		exit -1
	}

	Write-Host "Uninstallation of CWConnector on VM $vmName is done"
	##"APPLOG| Uninstallation of CWConnector on VM $vmName is done" | WriteFile	
	Write-Host "================ $vmName UNINSTALLING CWCCONNECTOR FROM VM SCRIPT END==============="