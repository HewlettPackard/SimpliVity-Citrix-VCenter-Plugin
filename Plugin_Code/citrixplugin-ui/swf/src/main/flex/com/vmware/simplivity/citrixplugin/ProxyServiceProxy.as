package com.vmware.simplivity.citrixplugin {
import com.vmware.flexutil.ServiceUtil;
import com.vmware.flexutil.proxies.BaseProxy;

/**
 * Proxy class for the  Proxy Service java service
 */
public class ProxyServiceProxy extends BaseProxy {
   // Service name matching the flex:remoting-destination declared in
   // main/webapp/WEB-INF/spring/bundle-context.xml
   private static const SERVICE_NAME:String = "ProxyService";

   /**
    * Create a ProxyServiceProxy with a secure channel.
    */
   public function ProxyServiceProxy() {
      // channelUri uses the Web-ContextPath defined in MANIFEST.MF
      const channelUri:String = ServiceUtil.getDefaultChannelUri(CitrixPluginModule.contextPath);
      super(SERVICE_NAME, channelUri);
   }
  
   /**
	* Call the "setProxyData" method of ClusterService.
	*
	* @param callBack      callback method used to return the result
	* @param callContext   Optional object that is passed back in the callback method
	*/
   public function setProxyData(message:ProxyData, callback:Function = null, context:Object = null):void {
	   callService("setProxyData", [message], callback, context);
   }
}
}