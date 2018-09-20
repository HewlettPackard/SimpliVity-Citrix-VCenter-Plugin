# HPE SimpliVity Citrix plug-in for VMware vCenter
HPE Simplivity Citrix Plugin is used to configure or de-configure the cloud connectors in the Citrix Cloud.
This Plugin is supported by VMWare vSphere 6.5 flux.
 
## Citrix Cloud Connector:
 
The Citrix Cloud Connector is a Citrix component that serves as a channel for communication between Citrix Cloud and your resource locations, enabling cloud management without requiring any complex networking or infrastructure configuration. This removes all the hassle of managing delivery infrastructure. It enables you to manage and focus on the resources that provide value to your users. This helps in managing the hosts and virtual desktops from the cloud by removing the need for complex solutions and networking. Each resource location is recommended to have more than one cloud connector to provide high availability (HA). However, it is painful to configure or de-configure cloud connector whenever a resource location is created or deleted. 
 
## Requirements:
 
-	Java (>1.6)
-	VMWare vSphere Server ()
-	Citrix Client ID and Key (Refer this doc for more info: https://docs.citrix.com/en-us/citrix-cloud/citrix-cloud-management/identity-access-management.html)
-	VM Template (Windows Server 2016 and should not be joined to AD domain)
 
## Version:
 
Cloud connector installation of SimpliVity vCenter is tested on the following versions:

Product	Component	Version
Simplivity	Omnicube Controller	3.7.0.260
	API Version	1.8
Vcenter 	Client	Windows 2016
	Build	Version 6.5.0 Build 4944578

## Installation of Plugin:
To install the plugin “vsphere-client-sdk-6.5.0-4602587” is needed. This can be downloaded from VMWare website.
The SDK includes a tool to help you register your plug-in as a vCenter server extension. It is available in
html-client-sdk\tools\vCenter plugin registration . The prebuilt directory contains the main script extension-registration which lets you register or unregister an extension with the vCenter server of your choice.
Run extension-registration[sh,bat] from the command line with the required parameters.
## Functionalities:
-	Configure the cloud connector 
-	De-configure the cloud connector.
### Configure:
This requires the Domain information (domain name, domain username, and domain password), Citrix data (Citrix Client ID, key, resource location, and customer name), SimpliVity host information, VM Details.
### De-configure:
This lists the VMs along with cluster and host details which were created using configure part.
Selected VM can be chosen and can be de-configured.
