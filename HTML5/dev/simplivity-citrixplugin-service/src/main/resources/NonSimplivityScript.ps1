param(
	[Parameter(Mandatory=$true)]
	[string]
	$inputfile,
	
	[string]
	$logFile
)


filter WriteFile {
	"$(Get-Date -UFormat '%b  %e %T')|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII 
}

#set-PowercliConfiguration -InvalidCertificateAction Ignore -Confirm:$false

Try {

	$file = Split-Path $inputfile -Leaf
    $base_dir = Split-Path $inputfile -Parent
    Import-LocalizedData -BindingVariable input -BaseDirectory $base_dir -FileName $file
	
	# Read input for VM Creation
    $username = $input.platform.username
	$password = $input.platform.password
	$vmHost1 = $input.platform.hostname1
	$count = $input.platform.count
	$vcenterHostname = $input.platform.hostname
	if( $count -eq 2)
	{
		$vmHost2 = $input.platform.hostname2
	}
	$outputFile = $input.platform.platformOutput
}

Catch {
       "ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	Write-Host "Username::"$username
    Write-Host "Password::"$password
	Write-Host "Host1::"$vmHost1
	Write-Host "Host2::"$vmHost2
	Write-Host "Output::"$outputFile
	Write-Host $error
	Try {
		Get-Module -Name VMware* -ListAvailable | Import-Module 
	}
	Catch {
		Write-Error "Failed to import VMWare modules $_.ExceptionItemName$_.Exception.Message"
	}
	
	Write-Host "Module Imported"
	Connect-VIServer -Server $vcenterHostname -Username $username -Password $password
	#Connect-VIServer -Server albanyvc.demo.local -Username $username -Password $password
	
	write-Host "Enetered Non Simplivity Script "
	$hostInfo = Get-view -ViewType HostSystem -Filter @{"Name"=$vmHost1}
	
	
	Write-Host $hostInfo.Hardware.SystemInfo.Vendor+"|"+$hostInfo.Hardware.SystemInfo.Model
	$output = $hostInfo.Hardware.SystemInfo.Vendor+"|"+$hostInfo.Hardware.SystemInfo.Model
	
	Write-Host "OUTPUT:::"$output	
	
	#$hostInfo.Hardware.SystemInfo.Vendor+"||"+$hostInfo.Hardware.SystemInfo.Model| Export-csv  $outputFile
	#$output | Export-csv  $outputFile
	#Set-Content -Path $outputFile -Value $output
	
	if($count -eq 2)
	{
		Write-Host "CAME"
		$hostInfo2 = Get-view -ViewType HostSystem -Filter @{"Name"=$vmHost2}
		$output = $output+"`n"+$hostInfo2.Hardware.SystemInfo.Vendor+"|"+$hostInfo2.Hardware.SystemInfo.Model
		Write-Host "OUTPUT2:::"$output
		
	}
	
	$output | Export-csv  $outputFile
	Set-Content -Path $outputFile -Value $output
	Write-Host "......End of Non Simplivity Script......"