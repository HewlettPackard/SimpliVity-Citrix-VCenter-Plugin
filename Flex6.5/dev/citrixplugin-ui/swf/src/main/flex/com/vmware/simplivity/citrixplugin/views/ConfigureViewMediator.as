package com.vmware.simplivity.citrixplugin.views {

import com.vmware.flexutil.events.MethodReturnEvent;
import com.vmware.simplivity.citrixplugin.CitrixData;
import com.vmware.simplivity.citrixplugin.ClusterServiceProxy;
import com.vmware.simplivity.citrixplugin.ConfigurationServiceProxy;
import com.vmware.simplivity.citrixplugin.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.DomainData;
import com.vmware.simplivity.citrixplugin.ReadCfgFileServiceProxy;
import com.vmware.simplivity.citrixplugin.VMData;
import com.vmware.ui.events.NavigationRequest;

import flash.events.Event;
import flash.events.EventDispatcher;
import flash.events.MouseEvent;

import mx.collections.ArrayCollection;
import mx.collections.ArrayList;
import mx.controls.Alert;
import mx.rpc.Fault;
import mx.managers.CursorManager;

[Event(name="{com.vmware.ui.events.NavigationRequest.NAVIGATION_REQUEST}",
      type="com.vmware.ui.events.NavigationRequest")]
/**
 * Class implementing the ConfigureView logic
 */
public class ConfigureViewMediator extends EventDispatcher {
   // Main view's extendion id (defined in plugin.xml)
   private static const APPVIEW_ID:String = "com.vmware.simplivity.citrixpluginui.appview";
   private var _view:ConfigureView;

   // Define a configure proxy instance with the InjectableProxy tag
   [InjectableProxy]
   public var proxy:ConfigurationServiceProxy;
   
   [InjectableProxy]
   public var clusterProxy:ClusterServiceProxy;
   
   [InjectableProxy]
   public var cfgProxy:ReadCfgFileServiceProxy;

  // public var statusflag:Boolean = false;
   
   [View]
   /** The view associated with this mediator. */
   public function set view(value:ConfigureView):void {
      // The view is injected here by the Framework when it is first created,
      // and reset to null when it is no longer needed.
      if ((value == null) && (_view != null)) {
		 _view.submitButton.removeEventListener(MouseEvent.CLICK, onSubmitClick);
		 _view.mainViewButton.removeEventListener(MouseEvent.CLICK, onLinkButtonClick);
      }

      _view = value;
      if (_view != null) {
		_view.dhcp.selected = true;
		_view.subnet.enabled = false;
		_view.gateway.enabled = false;
		_view.dnsserver.enabled = false;
         initialize();
		 clusterProxy.getClusterInfo(onClusterInfoResult);
      }
   }

   public function get view():ConfigureView {
      return _view;
   }

   private function initialize():void {
	  _view.submitButton.addEventListener(MouseEvent.CLICK, onSubmitClick);
	  _view.mainViewButton.addEventListener(MouseEvent.CLICK, onLinkButtonClick);

      // The update button will be enabled only when a text input changes
      _view.submitButton.enabled = false;
	  _view.removeVm.enabled = false;
	  
	  cfgProxy.readcfgfile(onCfgServiceResult);
	  
	  _view.input = new ConfigureInputData();
   }
       
   private function onLinkButtonClick(click:MouseEvent):void {
	   // Jump to the Settings view
	   var event:NavigationRequest = new NavigationRequest();
	   event.targetViewUid = APPVIEW_ID;
	   dispatchEvent(event);
   }
   
   private function onCfgServiceResult(event:MethodReturnEvent):void {
	   
	   if (event.error != null) {
		   Alert.show("Error getting cfg info: " + event.error.message);
		   return;
	   }
	   var cfgObj:ConfigureInputData = event.result as ConfigureInputData;
	   
	   if(cfgObj != null)
	   {
		   if(cfgObj.domainData != null)
		   {
			   _view.dmnUserName.text = cfgObj.domainData.dmnUserName;
			   _view.dmnPassword.text = cfgObj.domainData.dmnPassword;
			   _view.domainName.text = cfgObj.domainData.domainName;
		   }
		   
		   if(cfgObj.citrixData != null)
		   {
			   _view.clientId.text = cfgObj.citrixData.clientId;
			   _view.clientKey.text = cfgObj.citrixData.citrixKey;
			   _view.customerName.text = cfgObj.citrixData.customerName;
			   _view.resourceLocation.text = cfgObj.citrixData.resourceLocation;
		   }
		  		   
		   if(cfgObj.template != null)
		   {
			   _view.template.text = cfgObj.template;
		   }
	   }
	   else
	   {
		   Alert.show("Check the configuration file and if empty fill the details and refresh the page");
	   }
   }

   private function onClusterInfoResult(event:MethodReturnEvent):void {
	   
	   if (event.error != null) {
		   Alert.show("Error getting cluster info: " + event.error.message);
		   return;
	   }
	   var clusterMap:Object = event.result as Object;
	   _view.clusters = [];
	   _view.clusterMap = clusterMap;
	   var clusterArray:Array = new Array();
	   clusterArray.push("Select cluster");
	   var flag:Boolean = false;
	   for (var i:String in clusterMap)
	   {
		   clusterArray.push(i);
		   flag = true;
	   }
	   if(flag == false)
	   {
			Alert.show("Error in getting cluster info. Please enter the OVC details in main page if not given before.")
			return;
	   }
	   _view.vmCluster.dataProvider = clusterArray;
   }

   
   private function onSubmitClick(click:MouseEvent):void {

	   _view.configureStatus.text = "Configuration may take few minutes. Please check the latest log file from C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs location";
	   //Preparing template data
	   _view.input.template = _view.template.text;
	   
	   
	   // Preparing citrix data
	   var cData:CitrixData = new CitrixData();
	   cData.citrixKey = _view.clientKey.text;
	   cData.clientId = _view.clientId.text;
	   cData.customerName = _view.customerName.text;
	   cData.resourceLocation = _view.resourceLocation.text;
	   _view.input.citrixData = cData;
	   
	   // Preparing Domain Data
	   var domainData:DomainData = new DomainData();
	   domainData.domainName = _view.domainName.text;
	   domainData.dmnPassword = _view.dmnPassword.text;
	   domainData.dmnUserName = _view.dmnUserName.text;
	   _view.input.domainData = domainData;
	     
	   //Preparing VM Data
	   var size:int = _view.ac.length;//Assumption
	   var vmData:ArrayList = new ArrayList();
	   for(var index:int = 0;index <size; index++)
	   {
		   var temp:VMData = new VMData();
		   temp.vmName = _view.ac.getItemAt(index).VmName;
		   temp.vmUsername = _view.ac.getItemAt(index).UserName;
		   temp.vmPassword =  _view.ac.getItemAt(index).Password;
		   temp.vmCluster = _view.vmCluster.text;
		   temp.vmHost =  _view.ac.getItemAt(index).Host;
		   var flag:Boolean = _view.ac.getItemAt(index).IsStatic;

		   temp.isStatic = flag;
		   if(flag) {
				temp.subnet = _view.ac.getItemAt(index).Subnet;
				temp.ipAddr = _view.ac.getItemAt(index).IpAddr;
				temp.gateway = _view.ac.getItemAt(index).Gateway;
				temp.dnsServerAddress = _view.ac.getItemAt(index).DnsServer;
		   }
		   
		   vmData.addItem(temp);
	   }
	   _view.input.vmData = vmData;
	      
	   // Async call to update settings on the back-end,
	   proxy.configure(_view.input, onConfigureResult);
	   _view.submitButton.enabled = false;
	   CursorManager.setBusyCursor();
	   var mainConfiguration:String ="Configuration is in  progress .";
	   var dotCharacter:String =".";
	   
		
	/*   for (var i:int =0;statusflag == false;i++)
	   {	
			
			if( (i%100000000) == 0) {
				mainConfiguration = mainConfiguration + dotCharacter;
				_view.configureStatus.text = mainConfiguration;
			}
			if( (i%200000000) == 0) {
				mainConfiguration = mainConfiguration + dotCharacter;
				_view.configureStatus.text = mainConfiguration;
			}
			if( (i%200000000) == 0) {
				mainConfiguration = "Configuration is in  progress .";
				_view.configureStatus.text = mainConfiguration;
			}
		
	   }
	 */
   }

   /**
    * Callback from the ConfigurationService configure method.
    */
   private function onConfigureResult(event:MethodReturnEvent):void {
      if (event.error != null) {
         // Default error message
         var errorMsg:String = event.error.message;
		// statusflag = true;

         // In case of an RPC Fault the faultCode is set to the initial Java exception
         // by our custom ExceptionTranslatorService, so we can handle specific errors
         // like FileNotFoundException.
         if (event.error is Fault) {
            var faultCode:String = (event.error as Fault).faultCode;
            var faultDetails:String = (event.error as Fault).faultDetail;
            if (faultCode == "java.io.FileNotFoundException") {
               errorMsg = faultDetails +
                  "\n\nCheck that the server process has write access to the file.";
            } else {
               errorMsg = faultCode + ": " + faultDetails;
            }
         }
         Alert.show("Error during configuration: " + errorMsg);
         return;
      }
      // Update the status label to confirm action to the user.
	  _view.configureStatus.text = event.result as String;
	  _view.submitButton.enabled = true;
	  CursorManager.removeBusyCursor();
   }
}
}