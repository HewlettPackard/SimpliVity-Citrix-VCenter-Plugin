param(
	[Parameter(Mandatory=$true)]
	[string]
	$inputfile,
	
	[string]
	$logFile
)


filter WriteFile {
	#"$(Get-Date -Format G) | $_" | Tee -FilePath $logFile -Append
	"$(Get-Date -UFormat '%b  %e %T')|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII 
}

#set-PowercliConfiguration -InvalidCertificateAction Ignore -Confirm:$false

Try {

	$file = Split-Path $inputfile -Leaf
    $base_dir = Split-Path $inputfile -Parent
    Import-LocalizedData -BindingVariable input -BaseDirectory $base_dir -FileName $file
	
	# Read input for VM Creation
    $username = $input.cluster.username
	$password = $input.cluster.password
	$vcenterHostname = $input.cluster.hostname
	$outputFile = $input.cluster.clusterOutput
}

Catch {
       #"ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	Write-Host "Username=="$username
    Write-Host "Password=="$password
	Write-Host "Output: "$outputFile
	Write-Host "vCenterHostName: "$vcenterHostname
	Get-Module -Name VMware* -ListAvailable | Import-Module 
	Connect-VIServer -Server $vcenterHostname -Username $username -Password $password
	#Connect-viserver -server albanyvc.demo.local -Username $username -Password $password
	write-Host "Enetered Cluster Script "
	Get-vmhost | Select Name, @{N="Cluster";E={Get-Cluster -VMHost $_}} |Export-csv $outputFile
	Write-Host "......End of Cluster Script......"