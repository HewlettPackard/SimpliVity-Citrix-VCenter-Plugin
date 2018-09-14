param(
	[Parameter(Mandatory=$true)]
	[string]
	$inputfile,
	
	[string]
	$logFile
) 

$TrustUri = "https://trust.citrixworkspacesapi.net"
$baseUri  = "https://registry.citrixworkspacesapi.net"
$hostname = $(hostname)
$vmIP = $null
#Install-Module -name VMWare.PowerCLI -Scope "CurrentUser" -Confirm:$false
#Get-Module -Name VMware* -ListAvailable | Import-Module 
Connect-VIServer -Server moscowVC.cloud.local

Write-Host "Debug: Input file : $inputfile"
filter WriteFile {
Try {
	"$(Get-Date -Format s)|$hostname|$_" | Out-File -FilePath $logFile -Append -Encoding ASCII
	}
	Catch{
	Write-Host "Error occured while writing to log file"
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
	if(!(($vm | select PowerState) -Match 'PoweredOff'))
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

"APPLOG| Starting script to create VM and install Citrix Cloud connector" | WriteFile

#Set-ExecutionPolicy Unrestricted -Force
############### END USER VARIABLES ###############

########## BEGIN INPUT DATA VALIDATION ###########
if (-NOT (Test-Path $inputfile)) {
	"ERRLOG| Input Data file is not present in the given path $inputfile" | WriteFile
    Write-Error "Input Data file is not present in the given path $inputfile"
    exit 1
}
########### END INPUT DATA VALIDATION ############

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

    # Read Active Directory
    $adDomain = $input.ad.domain
    $adUsername  = $input.ad.username
    $adPassword = $input.ad.password
    
	# Citrix details
	$citrixCustomer = $input.citrix.customerName
    $citrixClientId = $input.citrix.clientId
    $citrixClientKey = $input.citrix.clientKey
    $citrixResourceLocation = $input.citrix.resourceLocation
    
    #OVC Details
    $ovcIP = $input.ovc.ovcip
    $ovcUsername = $input.ovc.ovcusername
    $ovcPassword = $input.ovc.ovcpassword

    # Read the logging file
    $execution_log = $input.logging.execution
    $output_log = $input.logging.output

    }

Catch {
       "ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }


if (-Not ($vmName -And $vmTemplate -And $adDomain -And $adUsername -And $adPassword -And $citrixCustomer -And $citrixClientId -And $citrixClientKey -And $citrixResourceLocation) ) {
	"ERRLOG| Few or all the required parameters are missing" | WriteFile
    Write-Error "Few or all the required parameters are missing"
    exit 1
}

Write-Host "Input parameters successfully read" 
"APPLOG| Input parameters successfully read" | WriteFile

$template = Get-Template -Name $vmTemplate

if( !$template)
{
	"ERRLOG| Failed to get template $template $_.ExceptionItemName. $_.Exception.Message" | WriteFile
	Write-Error "Failed to get template $template $_.ExceptionItemName. $_.Exception.Message"
	exit -1
}

#*******************Creation of New VM*********************
# Allow the use of self signed certificates.
[System.Net.ServicePointManager]::ServerCertificateValidationCallback = { $True }

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
Write-Host $url
$header = @{Authorization=("Basic {0}" -f $base64AuthInfo)}

$response= Invoke-RestMethod -Uri $url -Headers $header -Body $body -Method Post 
$access_token = $response.access_token;
Write-Host $access_token

# Add the access_token to the header.
$header =@{Authorization='Bearer '+$access_token}

$url = $BASE_URL+"/virtual_machines?name="+$vmTemplate
$vms = Invoke-RestMethod -Header $header -Uri $url
$templateid = $vms.virtual_machines.id

$body = @{virtual_machine_name=$vmName}
$body = $body | ConvertTo-Json
Write-Host "body =="$body
$url = $BASE_URL + 'virtual_machines/'+$templateid+'/clone';
Write-Host $url
$response= Invoke-RestMethod -Uri $url -Headers $header -Body $body -Method Post -ContentType 'application/vnd.simplivity.v1+json'
Write-Host $response

start-sleep $sleep_time

$vmtemp = Get-Template -Name $vmName | Set-Template -ToVM 
start-sleep $sleep_time
$vm = Get-vm -Name $vmName
Write-Host "VM name "+$vm

if($vm.VMHost.name -ne $vmHost)
{
	write-Host "Migrate the Virtual machine "+$vmName+" to "+$vmHost
	"APPLOG| Migrate the Virtual machine "+$vmName+" to "+$vmHost  | WriteFile
	
	$vmHost = Get-VMHost -Name $vmHost
	
	Move-VM -VM $vm -Destination $vmHost
	start-sleep $sleep_time
	
	$vm = Get-vm -Name $vmName
	Write-Host "VM  host :" $vm.VMHost.Name
}

#$vm = New-VM -VMHost $vmHost -Template $template -Name $vmName
#***********************************************************

start-sleep 10
Write-Host "Virtual machine of named '$vmName' will be created on '$vmHost'" 
"APPLOG| Virtual machine of named '$vmName' will be created on '$vmHost'" | WriteFile
$vm = Get-VM -Name $vmName

if(!$vm)
{
	"ERRLOG| Failed to create VM $vmName $_.ExceptionItemName. $_.Exception.Message" | WriteFile
	Write-Error "Failed to create VM $vmName $_.ExceptionItemName. $_.Exception.Message"
	exit -1
}

<# $na = Get-NetworkAdapter -VM $vm
write-Host "*************** na ***********"
Write-Output $na #>

#******* For new VM code 
Start-VM -VM $vm
write-Host "Powering on new Virtual machine"
"APPLOG| Powering on new Virtual machine " | WriteFile

write-Host "***************** VM ip address ***************"
write-Host -NoNewLine "Read updated Virtual Machine details from Vsphere"
"APPLOG| Read updated Virtual Machine details from Vsphere" | WriteFile

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
"APPLOG| VM : IP address assigned to the VM  " | WriteFile
Write-Host "VM : IP address assigned to the VM"

#******************Preparing VM credentials*************************
$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
$localCreds = New-Object PSCredential($vmUsername, $vmPassword)
Write-Output "--------------------------------------"
#Write-Output "localCreds="$localCreds

#$Username = $adUsername+"@"+$adDomain
#$Username = $adDomain+"/"+$adUsername

#******************Changing the computer name*************************
"APPLOG| Changing the computer name to '$vmName'"  | WriteFile
Write-Host "Changing the computer name to '$vmName'"
$cmd = "Rename-Computer -NewName '$vmName' -Restart"
Invoke-VMScript -VM $vm -ScriptType Powershell -ScriptText $cmd -GuestCredential $localcreds -ErrorAction Ignore -WarningAction Ignore
Start-Sleep -s 30

$cmd = @"
`$password = ConvertTo-SecureString '$adPassword' -AsPlainText -Force 
`$adCreds = New-Object PSCredential('$adUsername', `$password)
Add-Computer -DomainName '$adDomain' -Credential `$adCreds -Force -Restart

"@

"APPLOG| Adding '$vmName' to AD domain '$adDomain'"  | WriteFile
Write-Host "Adding '$vmName' to AD domain '$adDomain'"

Write-Output "----Step 1:: Adding the VM to domain-------"
#Write-Output "$vm"      

$domainResult = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -ErrorAction Ignore -WarningAction Ignore

Start-Sleep -s 10
Write-Host "After the timeout"

Write-Host -NoNewLine "Waiting for reboot of VM $vmName"
$cmd_disablefirewall ="Set-NetFirewallProfile -Profile Domain,Public,Private -Enabled False"
$count = 10
$delay = 20

Write-Host "Checking whether the VM is up......"

While ($count) {
	Start-Sleep -s 5
	#Write-Output "Step-2::Count--"$count
	try
	{
		if (Test-Connection -ComputerName  $vmIP -Count 1 -Quiet) {
			Write-Host "VM is up...."
			$count = 0
			break;
		}
		Write-Host -NoNewLine "."
		if ($count -eq 6){
			$firewallOutput = Invoke-VMScript -VM $vm -ScriptText $cmd_disablefirewall -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
		}
		$count = $count - 1
		if ($count -eq 0) {
			"ERRLOG| VM $vmName didnt come up after updating domain" | WriteFile
			Write-Error "VM $vmName didnt come up after updating domain"
			cleanUp $vm
			exit 1
		}
	}
	Catch
	{
	   "ERRLOG| Test-Connection Failed $_.ExceptionItemName  $_.Exception.Message" | WriteFile
       Write-Error " $_.ExceptionItemName $_.Exception.Message"
	}
}

# Check whether the VM is added to domain
if( !((Get-VM $vmName).Guest.HostName -Match $adDomain))
{
	"ERRLOG| VM $vmName didnt get added to domain" | WriteFile
	Write-Error "VM $vmName didnt get added to domain"
	cleanUp $vm
	exit 1
}


#******************check for resource location ************************************
$baseUri  = "https://registry.citrixworkspacesapi.net"
$body = @{}
$body.Add("clientId", $citrixClientId)
$body.Add("clientSecret", $citrixClientKey)

$uri = "https://trust.citrixworkspacesapi.net/" +  $citrixCustomer + "/tokens/clients"
Write-Output $uri
Write-Output $body
$response = Invoke-RestMethod -Method Post -Body (Convertto-json $body) -Uri $uri -ContentType 'application/json'
$token = $response.token
$headers = @{}
$headers.Add("Authorization", "CWSAuth bearer=$token")

$uri = $baseUri + "/$citrixCustomer/resourcelocations"
$resources = Invoke-RestMethod -Uri $uri -Method "Get" -ContentType "application/json" -Headers $headers
foreach($resource in $resources.items) {
    #Write-Output $resource
    #Write-Host "$resource_location : $($location.id)"
    if ($resource.name -eq $citrixResourceLocation) {
        $resourceId = $resource.id
        break;
     }
}

#******************Create a resource location if it doesnt exist****************************
if (-Not $resourceId) {
	Write-Host "Missing resource location '$citrixResourceLocation' in '$citrixCustomer'"
	"APPLOG| Missing resource location '$citrixResourceLocation' in '$citrixCustomer'"  | WriteFile	
	
	"APPLOG| Creating new resource location '$citrixResourceLocation'"  | WriteFile
	Write-Host "Creating new resource location '$citrixResourceLocation'" 

    $body = @{'Name'=$citrixResourceLocation}
    $resource = Invoke-RestMethod -Method "POST" -Body (Convertto-json $body) -Uri $uri -ContentType 'application/json' -Headers $headers
    $resourceId = $resource.id
}

# Check whether thr resource location is created or not
if( -Not $resourceId)
{
	"ERRLOG| Unable to create a Resource Location '$citrixResourceLocation'" | WriteFile
	Write-Host " Unable to create a Resource Location '$citrixResourceLocation'"
}

Write-Output "----Step 2:: Installing CWCConnector and adding VM $vmName to the resource location------"
$params = "/q /CustomerName:$citrixCustomer /ClientId:$citrixClientId /ClientSecret:$citrixClientKey /Location:$resourceId /AcceptTermsOfService:true"
$downloadsUri = 'https://downloads.cloud.com/'+$citrixCustomer+'/connector/cwcconnector.exe'
Write-Host "DownloadsURI: '$downloadsUri'"
$installscript = @"
Set-ExecutionPolicy Unrestricted
Remove-Item -Force c:\cwcconnector.exe -ErrorAction SilentlyContinue
Invoke-WebRequest -Uri '$downloadsUri' -OutFile "C:\cwcconnector.exe"
Start-Process c:\cwcconnector.exe '$params' –Wait
"@
#-----Diff compare lines
"APPLOG| Starting Citrix Cloud installation on '$vmName'" | WriteFile
$installationResult = Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds -WarningAction Ignore

write-Host "power on done"

$cmd = "Get-WmiObject -Class Win32_Product -Filter {Name like 'Citrix Cloud Services Connectivity Test Tool'} |Select-Object Name"
$cwcInstallConfirm = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
if(! ($cwcInstallConfirm -Match "Citrix Cloud Services Connectivity Test Tool"))
{
	"ERRLOG| CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create" | WriteFile
	Write-Error "CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create"
	cleanUp $vm
}   

#Write-Output "End"      

"APPLOG| END -  Citrix Cloud installation completed" | WriteFile
Write-Host "END -  Citrix Cloud installation completed"