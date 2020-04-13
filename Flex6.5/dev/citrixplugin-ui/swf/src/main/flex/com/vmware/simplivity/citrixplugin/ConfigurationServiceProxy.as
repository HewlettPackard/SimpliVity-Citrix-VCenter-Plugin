package com.vmware.simplivity.citrixplugin {
import com.vmware.flexutil.ServiceUtil;
import com.vmware.flexutil.proxies.BaseProxy;

/**
 * Proxy class for the GlobalService java service
 */
public class ConfigurationServiceProxy extends BaseProxy {
   // Service name matching the flex:remoting-destination declared in
   // main/webapp/WEB-INF/spring/bundle-context.xml
   private static const SERVICE_NAME:String = "ConfigurationService";

   /**
    * Create a GlobalServiceProxy with a secure channel.
    */
   public function ConfigurationServiceProxy() {
      // channelUri uses the Web-ContextPath defined in MANIFEST.MF
      const channelUri:String = ServiceUtil.getDefaultChannelUri(CitrixPluginModule.contextPath);
      super(SERVICE_NAME, channelUri);
   }

   public function configure(input:ConfigureInputData, callback:Function = null,
							   context:Object = null):void {
	   callService("configure", [input], callback, context);
   }

}
}