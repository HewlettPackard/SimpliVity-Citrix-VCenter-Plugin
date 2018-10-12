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
Set-ExecutionPolicy Unrestricted -Force

Try {

	$file = Split-Path $inputfile -Leaf
    $base_dir = Split-Path $inputfile -Parent
    Import-LocalizedData -BindingVariable input -BaseDirectory $base_dir -FileName $file
	
	# Read input for VM Creation
    $vcenterName = $input.cluster.vcenterName
	$outputFile = $input.cluster.clusterOutput
}

Catch {
       "ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	Write-Host "Vcenter=="$vcenterName
	Write-Host "OUtpu: "$outputFile
	#Get-Module -Name VMware* -ListAvailable 
	Write-Host "After listing......"
	#Install-Module -name VMWare.PowerCLI -Scope "CurrentUser" -Confirm:$false
Get-Module -Name VMware* -ListAvailable | Import-Module
Connect-VIServer -Server $vcenterName 
Get-vmhost | Select Name, @{N="Cluster";E={Get-Cluster -VMHost $_}} |Export-csv $outputFile