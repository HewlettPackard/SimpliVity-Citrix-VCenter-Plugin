package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.ProxyData")]
   [Bindable]
   public class ProxyData
   {
      // Note: only public fields can be serialized to Java
      public var proxyIP:String;
      public var proxyUsername:String;
      public var proxyPassword:String;
	  public var proxyPort:String;
   }
}