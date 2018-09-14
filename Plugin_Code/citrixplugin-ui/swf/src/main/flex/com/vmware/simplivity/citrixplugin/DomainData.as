package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.DomainData")]
   [Bindable]
   public class DomainData
   {
      // Note: only public fields can be serialized to Java
      public var domainName:String;
      public var dmnUserName:String;
      public var dmnPassword:String;
   }
}