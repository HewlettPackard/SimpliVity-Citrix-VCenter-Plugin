package com.vmware.simplivity.citrixplugin.views {

import com.vmware.flexutil.events.MethodReturnEvent;
import com.vmware.simplivity.citrixplugin.ProxyData;
import com.vmware.simplivity.citrixplugin.ProxyServiceProxy;
import com.vmware.ui.events.NavigationRequest;

import flash.events.EventDispatcher;
import flash.events.MouseEvent;

import mx.controls.Alert;

[Event(name="{com.vmware.ui.events.NavigationRequest.NAVIGATION_REQUEST}",
      type="com.vmware.ui.events.NavigationRequest")]
/**
 * Class implementing the MainView logic
 */
public class MainViewMediator extends EventDispatcher {
   // Settings view's extendion id (defined in plugin.xml)
   private static const CONFIG_ID:String = "com.vmware.simplivity.citrixpluginui.configureView";
   private static const DECONFIG_ID:String = "com.vmware.simplivity.citrixpluginui.deconfigureView";
   private var _view:MainView;

   // Define a global proxy instance with the InjectableProxy tag
   [InjectableProxy]
   public var proxy:ProxyServiceProxy;

   [View]
   /** The view associated with this mediator. */
   public function set view(value:MainView):void {
      // The view is injected here by the Framework when it is first created,
      // and reset to null when it is no longer needed.
      if ((value == null) && (_view != null)) {
         _view.submitButton.removeEventListener(MouseEvent.CLICK, onSubmitClick);
         _view.linkButton.removeEventListener(MouseEvent.CLICK, onLinkButtonClick);
		 _view.deconfigureButton.removeEventListener(MouseEvent.CLICK, onDeconfigClick);
      }

      _view = value;

      if (_view == null) {
		  _view.input = new ProxyData();
         return;
      }
      _view.submitButton.addEventListener(MouseEvent.CLICK, onSubmitClick);
      _view.linkButton.addEventListener(MouseEvent.CLICK, onLinkButtonClick);
	  _view.deconfigureButton.addEventListener(MouseEvent.CLICK, onDeconfigClick);
   }

   public function get view():MainView {
      return _view;
   }

   private function onSubmitClick(click:MouseEvent):void {
     
	   _view.proxyStatus.text = "Proxy data is getting saved";
	   
	   var inputVar:ProxyData = new ProxyData();
	   inputVar.proxyIP = _view.proxyIP.text;
	   inputVar.proxyPort = _view.proxyPort.text;
	   inputVar.proxyUsername = _view.proxyUsername.text;
	   inputVar.proxyPassword = _view.proxyPassword.text;
	   
      // Async call to the java service
      proxy.setProxyData(inputVar, onMethodResult);
   }

   private function onLinkButtonClick(click:MouseEvent):void {
      // Jump to the Settings view
      var event:NavigationRequest = new NavigationRequest();
      event.targetViewUid = CONFIG_ID;
      dispatchEvent(event);
   }

   private function onDeconfigClick(click:MouseEvent):void {
	   // Jump to the Settings view
	   var event:NavigationRequest = new NavigationRequest();
	   event.targetViewUid = DECONFIG_ID;
	   dispatchEvent(event);
   }
   
   /**
    * Callback from the ProxyService
    *
    * @param event Method response.
    */
   private function onMethodResult(event:MethodReturnEvent):void {
      if (event.error != null) 
	  {
         Alert.show("Error Setting Proxy Data: " + event.error.message);
      }
	  else 
	  {
		_view.proxyStatus.text = event.result as String;
      }
   }
}
}