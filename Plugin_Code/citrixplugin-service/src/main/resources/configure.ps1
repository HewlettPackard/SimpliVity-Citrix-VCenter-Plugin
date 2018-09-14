
param(
	[Parameter(Mandatory=$true)]
	[string]
	$inputfile,
	
	[string]
	$logFile
) 
$hostname = $(hostname)
$vmIP = $null
   Get-Module -Name VMware* -ListAvailable | Import-Module 
   Connect-viserver -server moscowvc.cloud.local

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
"APPLOG| Starting script to create VM and install Citrix Cloud connector" | WriteFile

Set-ExecutionPolicy Unrestricted -Force
############### END USER VARIABLES ###############

########## BEGIN INPUT DATA VALIDATION ###########
if (-NOT (Test-Path $inputfile)) {
	"ERRLOG| Input Data file is not present in the given path $inputfile" | WriteFile
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
	
	#ProxyDetails
	$proxyIP = $input.proxy.proxyip
	$proxyPort = $input.proxy.proxyport
	$proxyUsername = $input.proxy.proxyuername
	$proxyPassword = $input.proxy.proxypassword

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

Write-host "Template Name "$vmTemplate
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
Write-Host "VM name "$vm

Start-VM -VM $vm
write-Host "Powering on new Virtual machine"
#"APPLOG| Powering on new Virtual machine " | WriteFile

write-Host "***************** VM ip address ***************"
write-Host -NoNewLine "Read updated Virtual Machine details from Vsphere"
#"APPLOG| Read updated Virtual Machine details from Vsphere" | WriteFile

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

$vmPassword = ConvertTo-SecureString $vmPassword -AsPlainText -Force
$localCreds = New-Object PSCredential($vmUsername, $vmPassword)

Write-Host "Changing the computer name to '$vmName'"
$cmd = "Rename-Computer -NewName '$vmName' -Restart"
Invoke-VMScript -VM $vm -ScriptType Powershell -ScriptText $cmd -GuestCredential $localcreds -ErrorAction Ignore -WarningAction Ignore
Start-Sleep -s 30
Write-Host $localCreds

$cmd = @"
`$password = ConvertTo-SecureString '$adPassword' -AsPlainText -Force 
`$adCreds = New-Object PSCredential('$adUsername', `$password)
Add-Computer -DomainName '$adDomain' -Credential `$adCreds -Force -Restart

"@

Write-Host $cmd
"APPLOG| Adding '$vmName' to AD domain '$adDomain'"  | WriteFile
Write-Host "Adding '$vmName' to AD domain '$adDomain'"

Write-Output "----Step 1:: Adding the VM to domain-------"
      

$domainResult = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -ErrorAction Ignore -WarningAction Ignore

Start-Sleep -s 15
Write-Host "After the timeout"

Write-Host -NoNewLine "Waiting for reboot of VM $vmName"
$cmd_disablefirewall ="Set-NetFirewallProfile -Profile Domain,Public,Private -Enabled False"
$count = 15
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
		Write-Host "Disable Firewall"
			$firewallOutput = Invoke-VMScript -VM $vm -ScriptText $cmd_disablefirewall -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
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

Write-Host "Domain name "
Write-Host (Get-VM $vmName).Guest.HostName
if( !((Get-VM $vmName).Guest.HostName -Match $adDomain))
{
	"ERRLOG| VM $vmName didnt get added to domain" | WriteFile
	Write-Error "VM $vmName didnt get added to domain"
	cleanUp $vm
	exit 1
}

##################PROXY SETTINGS - START#############################

if($proxyIP)
{
	$proxyURL = $proxyIP + ":" + $proxyPort
	"APPLOG| $vmName : Set Proxy URL $proxyURL" | WriteFile
    Write-Host "$vmName : Set Proxy URL $proxyURL"
    
	$cmd = @"
	Set-ExecutionPolicy Unrestricted 
	netsh winhttp set proxy `$proxyURL
	`$Wcl=New-Object System.Net.WebClient
	`$webProxy = New-Object System.Net.WebProxy `$proxyURL
	`$Wcl.Proxy = `$webProxy
"@
	#Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
    
}

if($proxyUsername)
{
	  
	$cmd = @"
	`$proxySafePass = ConvertTo-SecureString `$proxyPassword -AsPlainText -Force
    `$proxyCreds = New-Object PSCredential(`$proxyUsername, `$proxySafePass)
	`$Wcl=New-Object System.Net.WebClient
	 $Wcl.Proxy.Credentials=`$proxyCreds
"@

 #Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore -ErrorAction Ignore
}
##################PROXY SETTINGS- END#############################
$baseUri  = "https://registry.citrixworkspacesapi.net"
$body = @{}

$body.Add("clientId", $citrixClientId)

$body.Add("clientSecret", $citrixClientKey)

$uri = "https://trust.citrixworkspacesapi.net/" +  $citrixCustomer + "/tokens/clients"
Write-Output $uri
$temp = Convertto-json $body
Write-Output $temp
write-Output "Before error"

$response = Invoke-RestMethod -Method Post -Body $temp -Uri $uri -ContentType 'application/json'
$token = $response.token
Write-Output "token 338:"$token 
Write-Output "Response : "$response

#$token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjoiNjgyNTM1MzA1OTQ1ODgwNTQ2MCIsInByaW5jaXBhbCI6InN1cHJlZXRoQGhwZS5jb20iLCJhY2Nlc3NfdG9rZW5fc2NvcGUiOiIiLCJyZWZyZXNoX3Rva2VuIjoiIiwiYWNjZXNzX3Rva2VuIjoiIiwiZGlzcGxheU5hbWUiOiJzdXByZWV0aCBzIiwicmVmcmVzaF9leHBpcmF0aW9uIjoiMTUzNjA4ODYxMDIxMSIsImN1c3RvbWVycyI6Ilt7XCJDdXN0b21lcklkXCI6XCJocGUzODNcIixcIkdlb1wiOlwiVVNcIn1dIiwiZW1haWxfdmVyaWZpZWQiOiJUcnVlIiwiY3R4X2F1dGhfYWxpYXMiOiJmM2I2MWU1NC1iNjk3LTQ1OTQtOTM2Zi02ZDZkMjU5MmE5NTMiLCJuYW1lIjoic3VwcmVldGggcyIsInN1YiI6IjY4MjUzNTMwNTk0NTg4MDU0NjAiLCJlbWFpbCI6InN1cHJlZXRoQGhwZS5jb20iLCJhbXIiOiJbXCJjbGllbnRcIl0iLCJpc3MiOiJjd3MiLCJleHAiOjE1MzYwNDkwMTAsIm5iZiI6MTUzNjA0NTQxMH0.jLg7_cIg403xfi2ODApXKQ72XuFQ93NjynpO5_9SKPeos6gsBVt558_72r26qXxIC39lxOSVyB4gbMLlNl-3lbCaCWhU_gqE03rMGSBx2ThjY4WkEW-8-QCHfqWQKlPhTDHSHJd5wqPaTs3Hvyn6NjLE3ikA0lZAfNo3-yQbLfPgOFPF-G0oGJpC0DACUCfk9mjBuk1v4V3bvay6XVfVqGlvUuKFdjIgltvS0TXmQ-fypwbvAsnAsJwIPRjWrKHddRQGmpn264vM3duPQIhj1cAcYVBX5ggg3dgma6HlcHgdcRKJcKnzyX-Ie4dVrri_P934Q7Le2q2uUCW11PE8Rg"

$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/resourcelocations"

$headers = @{}
$headers.Add("Authorization", "CWSAuth bearer=$token")
Write-Host "URI: "$uri
Write-Host "Headers"$headers
$resources =  Invoke-RestMethod -Uri $uri -Method "Get" -ContentType "application/json" -Headers $headers 
Write-Host "Resources: "$resources
foreach($resource in $resources.items) {
    Write-Output $resource
    Write-Host "$resource_location : $($location.id)"
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
    $resource = Invoke-RestMethod -Method Post -Body (Convertto-json $body) -Uri $uri -ContentType 'application/json' -Headers $headers
    $resourceId = $resource.id
}
Write-Host $resourceId

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
Start-Process c:\cwcconnector.exe '$params' -Wait
"@

Write-Host installscript
#-----Diff compare lines
"APPLOG| Starting Citrix Cloud installation on '$vmName'" | WriteFile
$installationResult = Invoke-VMScript -VM $vm -ScriptText $installscript -GuestCredential $localCreds -WarningAction Ignore


$cmd = "Get-WmiObject -Class Win32_Product -Filter {Name like 'Citrix Cloud Services Connectivity Test Tool'} |Select-Object Name"
$cwcInstallConfirm = Invoke-VMScript -VM $vm -ScriptText $cmd -ScriptType powershell -GuestCredential $localCreds -WarningAction Ignore
if(! ($cwcInstallConfirm -Match "Citrix Cloud Services Connectivity Test Tool"))
{
	"ERRLOG| CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create" | WriteFile
	Write-Error "CWCConnector didnt get installed in VM $vmName.  So, deleteing the VM $vmName create"
	cleanUp $vm
}   

$vm = Get-vm -Name $vmName
Write-Host "VM name "$vm
if($vm.VMHost.name -ne $vmHost)
{
	write-Host "Migrate the Virtual machine "$vmName" to "$vmHost
	"APPLOG| Migrate the Virtual machine "+$vmName+" to "+$vmHost  | WriteFile
	
	$vmHost = Get-VMHost -Name $vmHost
	Write-Host "VMHOST FROM INPUT: "$vmHost
	
	start-sleep $sleep_time
	Move-VM -VM $vm -Destination $vmHost -ErrorAction Ignore
	start-sleep $sleep_time
	
	$vm = Get-vm -Name $vmName
	Write-Host "VM  host :" $vm.VMHost.Name
}   

#"APPLOG| END -  Citrix Cloud installation completed" | WriteFile
Write-Host "END -  Citrix Cloud installation completed"