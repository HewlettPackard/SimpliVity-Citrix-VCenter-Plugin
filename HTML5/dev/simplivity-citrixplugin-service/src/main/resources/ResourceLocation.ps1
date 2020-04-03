
	param(
		[Parameter(Mandatory=$true)]
		[string]
		$inputfile,
		
		[string]
		$logFile
	) 
	$hostname = $(hostname)


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
		
		# Citrix details
		$citrixCustomer = $input.citrix.customerName
		$citrixClientId = $input.citrix.clientId
		$citrixClientKey = $input.citrix.clientKey
		$citrixResourceLocation = $input.citrix.resourceLocation
		
		#OVC Details
		$ovcIP = $input.ovc.ovcip
		$ovcUsername = $input.ovc.ovcusername
		$ovcPassword = $input.ovc.ovcpassword
		$platform = $input.ovc.platform
		$vcenterHostname = $input.ovc.hostname
		
		#Model details
		if( $platform -Match $true)
		{
			$modelName = $input.platform.model
		}
		
		# Read the logging file
		$execution_log = $input.logging.execution
		$output_log = $input.logging.output

    }

	Catch {
       #"ERRLOG| Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message" | WriteFile
       Write-Error "Failed to read input $_.ExceptionItemName from datafile $inputfile. $_.Exception.Message"
       exit 1
    }

	if (-Not ($vmName -And $vcenterHostname -And $citrixCustomer -And $citrixClientId -And $citrixClientKey -And $citrixResourceLocation -And $ovcUsername -And $ovcPassword) ) {
		#"ERRLOG| Few or all the required parameters are missing" | WriteFile
		Write-Error "Few or all the required parameters are missing"
		exit 1
	}
	
	Write-Host "Input parameters successfully read for ResourceLocation Script VM $vmName" 
	#"APPLOG| Input parameters successfully read for ResourceLocation Script VM $vmName" | WriteFile
	#Write-Host "MODEL NAME READ for $vmName : $modelName"
	
	Get-Module -Name VMware* -ListAvailable | Import-Module 
    Connect-viserver -server $vcenterHostname -Username $ovcUsername -Password $ovcPassword
    #Connect-viserver -server albanyvc.demo.local -Username $ovcUsername -Password $ovcPassword
	Write-Host "================ $vmName RESOURCE LOCATION SCRIPT START==============="
	
	$vm = Get-VM $vmName
	Write-Host "Creating the security token using Citrix Credentials"
	#"APPLOG| Creating the security token using Citrix Credentials" | WriteFile
	$baseUri  = "https://registry.citrixworkspacesapi.net"
	$body = @{}

	$body.Add("clientId", $citrixClientId)

	$body.Add("clientSecret", $citrixClientKey)
	
	$uri = "https://trust.citrixworkspacesapi.net/" +  $citrixCustomer + "/tokens/clients"
	Write-Output $uri
	$temp = Convertto-json $body
	Write-Output $temp
	
	$response = Invoke-RestMethod -Method Post -Body $temp -Uri $uri -ContentType 'application/json'
	$token = $response.token
	
	Write-Host "Citrix Security token got created"
	#"APPLOG| Citrix Security token got created" | WriteFile
	
	$tag = ""
	if ($platform -eq $true) {
		$tag = "HPE_"+$modelName
		Write-Host "Assigning Tag $tag for the resource location for VM $vmName"
		#"APPLOG| Assigning Tag $tag for the resource location for VM $vmName" | WriteFile
	}
	else {
		$tag = "HPE_Simplivity"
		Write-Host "Assigning Tag $tag for the resource location for VM $vmName"
		#"APPLOG| Assigning Tag $tag for the resource location for VM $vmName" | WriteFile
	}

	$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/resourcelocations"

	$headers = @{}
	$headers.Add("Authorization", "CWSAuth bearer=$token")
	
	Write-Host "Checking whether the resource location exists or not"
	#"APPLOG| Checking whether the resource location exists or not" | WriteFile
	$resources =  Invoke-RestMethod -Uri $uri -Method "Get" -ContentType "application/json" -Headers $headers 
	
	foreach($resource in $resources.items) {
		Write-Host " $vmName $resource_location : $($location.id)"
		#"APPLOG| $vmName $resource_location : $($location.id)" | WriteFile
		if ($resource.name -eq $citrixResourceLocation) {
			$resourceId = $resource.id
			break;
		 }
	}
	if( $resourceId) {
		Write-Host "Checking the tag of resource location"
		##"APPLOG| Checking the tag of resource location" | WriteFile
		$tagCheck = $false
		$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/tags/tag/"+$tag+"?Token=&Take=100"
		Write-Host "URI: "$uri
		$tags =  Invoke-RestMethod -Uri $uri -Method "Get" -ContentType "application/json" -Headers $headers 
		foreach($tagItem in $tags.items) {
			Write-Output $tag
			if( $tagItem.taggedObjectId -eq $resourceId)
			{
				$tagCheck = $True
				Write-Host "$vmName : Tag $tag exists for the Resource Location $resourceLocation"
				##"APPLOG| $vmName : Tag $tag exists for the Resource Location $resourceLocation" | WriteFile
				break;
			}
		}
		if(-Not $tagCheck)
		{
			Write-Host "$vmName : Add resource location $resourceLocation to tag $tag"
			##"APPLOG| $vmName : Add resource location $resourceLocation to tag $tag" | WriteFile
			$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/tags/unrestricted"
			$payload = @{}
			$payload.Add("ObjectType", "ResourceLocation")
			$payload.Add("tag", $tag)
			$payload.Add("ObjectId", $resourceId)
			$temp = Convertto-json $payload
			try {
				$response =  Invoke-RestMethod -Uri $uri -Method Post -Body $temp -ContentType "application/json" -Headers $headers 
				Write-Host "RESPONSE POSt UPATION of TAG:"$response
				if( $resourceId -eq $response.taggedObjectId) {
					Write-Host "$vmName : Updated tag $tag for resource location $resourceLocation"
					#"APPLOG| $vmName : Updated tag $tag for resource location $resourceLocation" | WriteFile
				}
				else {
					Write-Error "$vmName : Failed to pdate tag $tag for resource location $resourceLocation"
					#"ERRLOG| $vmName : Failed to updated tag $tag for resource location $resourceLocation" | WriteFile
					#cleanUp $vm
					exit 1
				}
			}
			catch {
					#"ERRLOG| Failed to update the tag $tag for resource location $resourceLocation : $_.ExceptionItemName. $_.Exception.Message" | WriteFile
					Write-Error "Failed to update the tag $tag for resource location $resourceLocation : $_.ExceptionItemName. $_.Exception.Message"
					#cleanUp $vm
					exit 1
			}
		}
	}
	
	#******************Create a resource location if it doesnt exist****************************
	if (-Not $resourceId) {
		Write-Host "Missing resource location '$citrixResourceLocation' in '$citrixCustomer'"
		##"APPLOG| Missing resource location '$citrixResourceLocation' in '$citrixCustomer'"  | WriteFile	
		
		##"APPLOG| Creating new resource location '$citrixResourceLocation'"  | WriteFile
		Write-Host "Creating new resource location '$citrixResourceLocation'" 

		$body = @{'Name'=$citrixResourceLocation}
		$resource = Invoke-RestMethod -Method Post -Body (Convertto-json $body) -Uri $uri -ContentType 'application/json' -Headers $headers
		$resourceId = $resource.id
		Write-Host "$vmName : Add resource location $resourceLocation to tag $tag"
		##"APPLOG| $vmName : Add resource location $resourceLocation to tag $tag" | WriteFile
		$uri = "https://registry.citrixworkspacesapi.net/"+$citrixCustomer+"/tags/unrestricted"
		$payload = @{}
		$payload.Add("ObjectType", "ResourceLocation")
		$payload.Add("tag", $tag)
		$payload.Add("ObjectId", $resourceId)
		$temp = Convertto-json $payload
		try {
			$response =  Invoke-RestMethod -Uri $uri -Method Post -Body $temp -ContentType "application/json" -Headers $headers 
			Write-Host "RESPONSE POSt UPATION of TAG:"$response
			if( $resourceId -eq $response.taggedObjectId) {
				Write-Host "$vmName : Updated tag $tag for resource location $resourceLocation"
				##"APPLOG| $vmName : Updated tag $tag for resource location $resourceLocation" | WriteFile
			}
			else {
				Write-Error "$vmName : Failed to pdate tag $tag for resource location $resourceLocation"
				#"ERRLOG| $vmName : Failed to updated tag $tag for resource location $resourceLocation" | WriteFile
				cleanUp $vm
				exit 1
			}
		}
		catch {
				#"ERRLOG| Failed to update the tag $tag for resource location $resourceLocation : $_.ExceptionItemName. $_.Exception.Message" | WriteFile
				Write-Error "Failed to update the tag $tag for resource location $resourceLocation : $_.ExceptionItemName. $_.Exception.Message"
				cleanUp $vm
				exit 1
		}
	}
	Write-Host $resourceId

	# Check whether thr resource location is created or not
	if( -Not $resourceId)
	{
		#"ERRLOG| Unable to create a Resource Location '$citrixResourceLocation'" | WriteFile
		Write-Host " Unable to create a Resource Location '$citrixResourceLocation'"
		cleanUp $vm
		exit 1
	}
	
	##"APPLOG| -----------------ResourceLocation  Script End,'$citrixResourceLocation' for $vmName--------------"  | WriteFile
	Write-Host "-----------------ResourceLocation  Script End,'$citrixResourceLocation' for $vmName--------------" 