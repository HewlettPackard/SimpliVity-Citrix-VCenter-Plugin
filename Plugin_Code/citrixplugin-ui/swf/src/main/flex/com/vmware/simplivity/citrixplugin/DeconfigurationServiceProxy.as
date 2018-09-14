package com.vmware.simplivity.citrixplugin {
import com.vmware.flexutil.ServiceUtil;
import com.vmware.flexutil.proxies.BaseProxy;

/**
 * Proxy class for the GlobalService java service
 */
public class DeconfigurationServiceProxy extends BaseProxy {
   // Service name matching the flex:remoting-destination declared in
   // main/webapp/WEB-INF/spring/bundle-context.xml
   private static const SERVICE_NAME:String = "DeconfigurationService";

   /**
    * Create a GlobalServiceProxy with a secure channel.
    */
   public function DeconfigurationServiceProxy() {
      // channelUri uses the Web-ContextPath defined in MANIFEST.MF
      const channelUri:String = ServiceUtil.getDefaultChannelUri(CitrixPluginModule.contextPath);
      super(SERVICE_NAME, channelUri);
   }

   public function deconfigure(input:BaseInputData, rowNumber:int, callback:Function = null,
							   context:Object = null):void {
	   callService("deconfigure", [input, rowNumber], callback, context);
   }

}
}