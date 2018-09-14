package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.OVCData")]
   [Bindable]
   public class OVCData
   {
      // Note: only public fields can be serialized to Java
      public var ovcIP:String;
      public var ovcUsername:String;
      public var ovcPassword:String;
   }
}