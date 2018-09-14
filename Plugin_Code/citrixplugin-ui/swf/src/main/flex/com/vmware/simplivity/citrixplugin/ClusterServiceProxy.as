package com.vmware.simplivity.citrixplugin {
import com.vmware.flexutil.ServiceUtil;
import com.vmware.flexutil.proxies.BaseProxy;

/**
 * Proxy class for the  Cluster Service java service
 */
public class ClusterServiceProxy extends BaseProxy {
   // Service name matching the flex:remoting-destination declared in
   // main/webapp/WEB-INF/spring/bundle-context.xml
   private static const SERVICE_NAME:String = "ClusterService";

   /**
    * Create a ClusterServiceProxy with a secure channel.
    */
   public function ClusterServiceProxy() {
      // channelUri uses the Web-ContextPath defined in MANIFEST.MF
      const channelUri:String = ServiceUtil.getDefaultChannelUri(CitrixPluginModule.contextPath);
      super(SERVICE_NAME, channelUri);
   }
  
   /**
	* Call the "getClusterInfo" method of ClusterService.
	*
	* @param callBack      callback method used to return the result
	* @param callContext   Optional object that is passed back in the callback method
	*/
   public function getClusterInfo(callback:Function = null, context:Object = null):void {
	   // This method takes no arguments
	   callService("getClusterInfo", [], callback, context);
   }
   
   public function getHosts(input:Object, callback:Function = null, context:Object = null):void {
	   // This method takes no arguments
	   callService("getHosts", [input], callback, context);
   }
}
}