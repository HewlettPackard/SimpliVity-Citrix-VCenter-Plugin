
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)
	
	
	Try {
		$file = Split-Path $inputfile -Leaf
		$base_dir = Split-Path $inputfile -Parent
		Import-LocalizedData -BindingVariable input -BaseDirectory $base_dir -FileName $file
		
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
	
	
if ( $platform -Match $false)
{	
	add-type @"
		using System.Net;
		using System.Security.Cryptography.X509Certificates;
		public class TrustAllCertsPolicy : ICertificatePolicy {
			public bool CheckValidationResult(
				ServicePoint srvPoint, X509Certificate certificate,
				WebRequest request, int certificateProblem) {
				return true;
			}
		}
"@
	[System.Net.ServicePointManager]::CertificatePolicy = New-Object TrustAllCertsPolicy
	
	$BASE_URL = "https://"+$ovcIP+"/api/"
	# Set the username and password.
	$hms_username = $ovcUsername
	$hms_password = $ovcPassword
	
	$base64AuthInfo = [Convert]::ToBase64String([Text.Encoding]::ASCII.GetBytes(("{0}:{1}" -f "simplivity","")))
	$body = @{grant_type='password';username=$hms_username;password=$hms_password}
	$url = $BASE_URL+'oauth/token'
	$header = @{Authorization=("Basic {0}" -f $base64AuthInfo)}
	
	try{
		$response= Invoke-RestMethod -Uri $url -Headers $header -Body $body -Method Post 
		$access_token = $response.access_token;
		Write-Host "RESPONSE: $response"
		Write-Host "ACCESS TOKEN: $access_token"
	}
	catch {
		Write-Error "INVALID_OVC_IP"
		Write-Error "$_.ExceptionItemName. $_.Exception.Message"
	}
}