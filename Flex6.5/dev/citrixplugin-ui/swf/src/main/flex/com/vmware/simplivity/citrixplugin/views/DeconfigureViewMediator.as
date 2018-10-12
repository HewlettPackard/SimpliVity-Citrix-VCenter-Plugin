package com.vmware.simplivity.citrixplugin.views {

import com.vmware.flexutil.events.MethodReturnEvent;
import com.vmware.simplivity.citrixplugin.BaseInputData;
import com.vmware.simplivity.citrixplugin.DeconfigurationServiceProxy;
import com.vmware.simplivity.citrixplugin.DeconfigureTableServiceProxy;
import com.vmware.simplivity.citrixplugin.DomainData;
import com.vmware.simplivity.citrixplugin.OVCData;
import com.vmware.simplivity.citrixplugin.VMData;
import com.vmware.ui.events.NavigationRequest;

import flash.events.EventDispatcher;
import flash.events.MouseEvent;

import mx.collections.ArrayCollection;
import mx.collections.ArrayList;
import mx.controls.Alert;
import mx.rpc.Fault;

[Event(name="{com.vmware.ui.events.NavigationRequest.NAVIGATION_REQUEST}",
      type="com.vmware.ui.events.NavigationRequest")]
/**
 * Class implementing the DeconfigureView logic
 */
public class DeconfigureViewMediator extends EventDispatcher {
   // Main view's extendion id (defined in plugin.xml)
   private static const APPVIEW_ID:String = "com.vmware.simplivity.citrixpluginui.appview";
   
   private var _view:DeconfigureView;

   // Define a configure proxy instance with the InjectableProxy tag
   [InjectableProxy]
   public var proxy:DeconfigurationServiceProxy;
   
   [InjectableProxy]
   public var tableProxy:DeconfigureTableServiceProxy;
   
   [View]
   /** The view associated with this mediator. */
   public function set view(value:DeconfigureView):void {
      // The view is injected here by the Framework when it is first created,
      // and reset to null when it is no longer needed.
      if ((value == null) && (_view != null)) {
		 _view.submitButton.removeEventListener(MouseEvent.CLICK, onSubmitClick);
		 _view.mainViewButton.removeEventListener(MouseEvent.CLICK, onLinkButtonClick);
		 _view.RefreshButton.removeEventListener(MouseEvent.CLICK, onRefreshButtonClick);
      }

      _view = value;
      if (_view != null) {
         initialize();
      }
   }

   public function get view():DeconfigureView {
      return _view;
   }

   private function initialize():void {
	  _view.submitButton.addEventListener(MouseEvent.CLICK, onSubmitClick);
	  _view.mainViewButton.addEventListener(MouseEvent.CLICK, onLinkButtonClick);
	  _view.RefreshButton.addEventListener(MouseEvent.CLICK, onRefreshButtonClick);

      // The update button will be enabled only when a text input changes
      _view.submitButton.enabled = false;

      // Async call to retrieve the VM data from the back-end
	  tableProxy.getDeconfigureEntries(onGettingVMEntries);
	  _view.input = new BaseInputData();
   }
    
   private function onRefreshButtonClick(click:MouseEvent):void 
   {
	   tableProxy.getDeconfigureEntries(onGettingVMEntries);
   }
   private function onGettingVMEntries(event:MethodReturnEvent):void {
	   if (event.error != null) {
		   Alert.show("Error getting Configured VM entries: " + event.error.message);
		   return;
	   }
	   _view.ac = event.result as ArrayCollection;
   }

   private function onLinkButtonClick(click:MouseEvent):void {
	   // Jump to the Settings view
	   var event:NavigationRequest = new NavigationRequest();
	   event.targetViewUid = APPVIEW_ID;
	   dispatchEvent(event);
   }

   private function onSubmitClick(click:MouseEvent):void {
   
	   // Preparing Domain Data
	   var domainData:DomainData = new DomainData();
	   domainData.domainName = _view.domainName.text;
	   domainData.dmnPassword = _view.dmnPassword.text;
	   domainData.dmnUserName = _view.dmnUserName.text;
	   _view.input.domainData = domainData;
	   
	   //Preparing OVC data
	   var ovcData:OVCData = new OVCData();
	   ovcData.ovcIP = _view.ovcIP.text;
	   ovcData.ovcUsername = _view.ovcUsername.text;
	   ovcData.ovcPassword = _view.ovcPassword.text;
	   _view.input.ovcData = ovcData;
	  
	   //Preparing VM Data
	   var size:int = _view.ac.length;//Assumption
	   var vmData:ArrayList = new ArrayList();
	   	
	   var temp:VMData = new VMData();
	   temp.vmName = _view.vmName.text;
	   temp.vmUsername = _view.vmUserName.text;
	   temp.vmPassword =  _view.vmPassword.text;
	   temp.vmCluster = _view.vmCluster.text;
	   temp.vmHost =  _view.vmHost.text;
		   
	   vmData.addItem(temp);
	   
	   _view.input.vmData = vmData;
	   
	   var rowNumber:int = _view.rowNumber;
	   // Async call to update settings on the back-end,
	   _view.deconfigureStatus.text = "Deconfiguration is in progess. it may take few minutes";
	   proxy.deconfigure(_view.input,rowNumber, onDeconfiguresResult);
	   _view.submitButton.enabled = false;
	   //tableProxy.getDeconfigureEntries(onGettingVMEntries);
	   
   }

   /**
    * Callback from the ConfigurationService configure method.
    */
   private function onDeconfiguresResult(event:MethodReturnEvent):void {
      if (event.error != null) {
         // Default error message
         var errorMsg:String = event.error.message;

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
         Alert.show("Error while deconfiguring: " + errorMsg);
         return;
      }
      // Update the status label to confirm action to the user.
	  var returnVal:String = event.result as String;
	  
	  _view.submitButton.enabled = true;
	  _view.ac = null;
	  if(returnVal.match("success"))
	  {
		  _view.deconfigureStatus.text = "Deconfiguration done successfully.";
		  tableProxy.getDeconfigureEntries(onGettingVMEntries);
	  }
   }
}
}