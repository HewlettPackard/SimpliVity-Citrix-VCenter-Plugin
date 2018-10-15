# Automation for Citrix Cloud on HPE SimpliVity (vSphere)
HPE Simplivity Citrix Plugin is used to configure or de-configure the cloud connectors in the Citrix Cloud.
This Plugin is supported by VMWare vSphere 6.5 flex.

## Release Notes:

This is the first version of HPE SimpliVity plugin for Citrix cloud which installs and configures Citrix cloud connector. Major aspects of this plugin that are covered in this release are:

-	Proxy implementation is a preview feature (beta) in version 1.0
-	Secure SSL/HTTPS enabled on SimpliVity OmniCube controller (OVC) IP address to connect using REST APIs.
-	DHCP Server is required for assignment of IP’s to Cloud Connector VMs.
 
## Citrix Cloud Connector:
 
Citrix Cloud connector acts as an interface between the Citrix Cloud and on-premise resource location. This helps in managing the hosts and virtual desktops from the cloud by removing the need for complex solutions and networking. Each resource location is recommended to have more than one cloud connector to provide high availability (HA). However, it is laborious to configure or de-configure cloud connector whenever a resource location is created or deleted.

This plugin automates the installation of citrix cloud connectors by deploying virtual machines (VMs), adding them to Active Directory (AD), downloading Citrix cloud connector and installing it.
 
 
## Requirements:
 
-	Java (>1.6)
-	VMWare vSphere 6.5.0 flex
-	Citrix Client ID and Key (Refer this doc for more info: https://docs.citrix.com/en-us/citrix-cloud/citrix-cloud-management/identity-access-management.html)
-	It is recommended to use Windows Server 2016 to create a template that is used for connecting Citrix cloud and resource location.
-	The template should not join the AD domain. The plugin creates the VM and joins to AD.
-	Since the IP address of VM(s) created by the plugin is assigned from the DHCP server, user has no option to assign static IP. Please ensure the correct network is chosen for DHCP access.
 
## Version:
 
Cloud connector installation of SimpliVity vCenter is tested on the following versions:

### HPE Simplivity
-	OmniCube Controller: 3.7
-	API Version: 1.8

### VMWare vSphere
-	vCenter Client Windows 2016 
-	Build Version 6.5.0
-	Build 4944578

## Installation of Plugin:
-	To install the plugin “vsphere-client-sdk-6.5.0-4602587” is needed. This can be downloaded from VMWare website.
-	The SDK includes a tool to help you register your plug-in as a vCenter server extension. It is available in html-client-sdk\tools\vCenter plugin registration.
-	The prebuilt directory contains the main script extension-registration which lets you register or unregister an extension with the vCenter server of your choice.
-	Run extension-registration[sh,bat] from the command line with the required parameters.

## Plugin Development

To develop new features or fix bugs in the plugins, refer the code in the dev directory of respective type (Flexx.x or HTMLx.x)
-	Powershell scripts to configure and deconfigure are available in dev/citrixplugin-service/src/main/resources.
-	Code for the service layer (Java) is available in dev/citrixplugin-service folder.
-	Code for the UI layer (flex) is available in dev/citrixplugin-ui folder.

