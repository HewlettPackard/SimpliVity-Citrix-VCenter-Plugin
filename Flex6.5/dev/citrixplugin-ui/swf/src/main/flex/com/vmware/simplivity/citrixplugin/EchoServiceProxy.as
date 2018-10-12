package com.vmware.simplivity.citrixplugin {
import com.vmware.flexutil.ServiceUtil;
import com.vmware.flexutil.proxies.BaseProxy;

/**
* Proxy class for the EchoService java service
*/
public class EchoServiceProxy extends BaseProxy {
   // Service name matching the flex:remoting-destination declared in
   // main/webapp/WEB-INF/spring/bundle-context.xml
   private static const SERVICE_NAME:String = "EchoService";

   /**
    * Create a EchoServiceProxy with a secure channel.
    */
   public function EchoServiceProxy() {
      // channelUri uses the Web-ContextPath defined in MANIFEST.MF
      const channelUri:String = ServiceUtil.getDefaultChannelUri(CitrixPluginModule.contextPath);
      super(SERVICE_NAME, channelUri);
   }

   /**
    * Call the "echo" method of the EchoService java service.
    *
    * @param message    Single argument to the echo method
    * @param callback   Callback in the form <code>function(result:Object,
    *       error:Error, callContext:Object)</code>
    * @param context    Optional context object passed back with the result
    */
   public function echo(message:String, callback:Function = null, context:Object = null):void {
      // "echo" takes a single message argument but callService still requires an array.
      callService("echo", [message], callback, context);
   }
   
   public function setProxyData(message:ProxyData, callback:Function = null, context:Object = null):void {
	   callService("setProxyData", [message], callback, context);
   }
}
}