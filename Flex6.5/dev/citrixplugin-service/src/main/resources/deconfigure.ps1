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

Write-Host "Debug: Input file : $inputFile"
Write-Host "Debug: Log file : $logFile"
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

"APPLOG| Starting cleanup script of Citrix Cloud connector" | WriteFile
Write-host "APPLOG| Starting cleanup script of Citrix Cloud connector"

########## BEGIN INPUT DATA VALIDATION ##########
if (-NOT (Test-Path $inputFile)) {
    "ERRLOG| Input Data file is not present in the given path $inputFile" | WriteFile
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

    # Read the logging file
    $execution_log = $input.logging.execution
    $output_log = $input.logging.output
} Catch {
    "ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message" |  WriteFile
	Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputFile. $_.Exception.Message"
    exit 1
}

	if (-Not ($vmName -And $adUsername -And $adPassword -And $ovcIP -And $ovcUsername -And $ovcPassword) ) {
		"ERRLOG| Few or all the required parameters are missing" | WriteFile
	    Write-Error "Few or all the required parameters are missing"
	    exit 1
	}
	
	Write-Host "Input parameters successfully read" 
	"APPLOG| Input parameters successfully read" | WriteFile
	set-PowercliConfiguration -InvalidCertificateAction Ignore -Confirm:$false
  	Get-Module -Name VMware* -ListAvailable | Import-Module 
   	#Connect-viserver -server localhost -Username $ovcUsername -Password $ovcPassword
   	Connect-viserver -server moscowvc.cloud.local -Username $ovcUsername -Password $ovcPassword
   	
function cleanUp{
	param ($vm)
	#***checking whether the VM is powered on*******************
	$vm = Get-VM -Name $vmName
	
	if($vm.PowerState -ne 'PoweredOff')
	{
		"APPLOG| Powering off the VM '$vmName'" | WriteFile
		Write-Host "Powering off the VM '$vmName'"
		
		$res = Stop-VM -VM $vm -Confirm:$false
		if((!($res|select PowerState) -Match 'PoweredOff'))
		{
			"ERRLOG| Unable to power of the VM '$vmName'" | WriteFile
			Write-Host "Unable to power of the VM '$vmName'"
			exit 1
		}
	}
	"APPLOG| Remove the VM '$vmName'" | WriteFile
	Write-Host "Remove the VM '$vmName'"
	Remove-VM -VM $vm -confirm:$false
	exit 1
}


Write-Host "Vm name : $vmName"

$vm = Get-VM -Name $vmName

if(!$vm)
{
	"ERRLOG| Failed to find VM $vmName $_.ExceptionItemName. $_.Exception.Message" | WriteFile
	Write-Error "Failed to find  VM $vmName $_.ExceptionItemName. $_.Exception.Message"
	exit -1
}

#write-Host "Count = "$count
$vmIP = (($vm).Guest.IPAddress[0])
Write-Host "VM IP is  '$vmIP'"
## check pattern match for ipv4
if( $vmIP -Match "[a-z]")
{
	"ERRLOG| Got IPv6 address instead of IPv4 address '$vmIP'" | WriteFile
	Write-Error "Got IPv6 address instead of IPv4 address '$vmIP'"
	cleanUp $vm
	exit -1
}
#Start-Process c:\cwcconnector.exe  -ArgumentList "/uninstall /q" -Wait
$cmd = 'c:\cwcconnector.exe /uninstall /q'
$uninstallscript = @"
Set-ExecutionPolicy Unrestricted
Out-File -FilePath C:\ConnectorUninstall.cmd -InputObject '$cmd' -Encoding ascii

"@

<#$uninstallscript = @"
Set-ExecutionPolicy Unrestricted
$app = Get-WmiObject Win32_Product | where { $_.name -match "Citrix*" }
"@#>

$vmPassword1 = ConvertTo-SecureString $vmPassword -AsPlainText -Force
$localCreds = New-Object PSCredential($vmUsername, $vmPassword1)

# --working
$uninstallationResult = Invoke-VMScript -VM $vm -ScriptText $uninstallscript -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore

$cmd = "Get-WmiObject -Class Win32_Product -Filter {Name like 'Citrix Cloud Services Connectivity Test Tool'} |Select-Object Name"
$cwcInstallConfirm = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
Write-Host "cwcInstallConfirm: "$cwcInstallConfirm

$tempFile = 'C:\Users\Public\TempFile.txt'
if( $cwcInstallConfirm.ScriptOutput -Match "Citrix Cloud Services Connectivity Test Tool")
{
	"APPLOG| Uninstalling the cwcconnector from $vmName" | WriteFile 
	Write-Host "Uninstalling the cwcconnector from $vmName"
	Write-Host "localCreds "$localCreds 
	Start-Process "C:\Users\Public\PsExec.exe" " /accepteula -nobanner -s \\$vmIP  -u $vmUsername -p $vmPassword c:\ConnectorUninstall.cmd" -RedirectStandardError $logFile -NoNewWindow -Wait
	#$uninstallationResult = Invoke-VMScript -VM $vm -ScriptText $uninstallscript -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
	Write-Host "Exit"$uninstallationResult
}   

#$uninstallationResult = Invoke-VMScript -VM $vm -ScriptText $uninstallscript -GuestCredential $localCreds -WarningAction Ignore

"APPLOG| Unjoin $vmName from AD domain $domain" | WriteFile 
Write-Host "Unjoin $vmName from AD domain $domain"

$cmd = @"
`$password = ConvertTo-SecureString '$adPassword' -AsPlainText -Force 
`$adCreds = New-Object PSCredential('$adUsername', `$password)
Remove-Computer -UnjoinDomainCredential `$adCreds -Force -Restart
"@

$res = Invoke-VMScript -VM $vm -ScriptText $cmd -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
$vmIP =""
sleep(10)
$count = 20
while ($vmIP -eq $null) {
	Start-Sleep -s 10
	Write-Host -NoNewLine "."

	if ($count -eq 0) {
	"ERRLOG| VM $vmName doesn't start properly"
	Write-Error "VM $vmName doesn't start properly"
		exit 1
	}
	$count = $count - 1
	#write-Host "Count = "$count
	$vmIP = ((Get-VM -Name $vm).Guest.IPAddress[0])
	## check pattern match for ipv4
	if( $vmIP -Match "[a-z]")
	{
		"ERRLOG| Got IPv6 address instead of IPv4 address '$vmIP'" | WriteFile
		Write-Error "Got IPv6 address instead of IPv4 address '$vmIP'"
		cleanUp $vm
		exit -1
	}
	write-Host "VMIP = "$vmIP
	
}

"APPLOG| Removed '$vmName' entry from Active Directory" | WriteFile 
Write-Host "Removed '$vmName' entry from Active Directory"

$defaultDomain = "WORKGROUP"
if( !(Get-VM $vmName).Guest.HostName -Match $defaultDomain)

{
	"ERRLOG| VM $vmName didnt get unjoined from domain" | WriteFile
	Write-Error "VM $vmName didnt get unjoined from domain"
	cleanUp $vm
	exit 1
}


Stop-VM -VM $vm -Confirm:$false
Remove-VM -VM $vm -Confirm:$false



