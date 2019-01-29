package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.ConfigureInputData")]
   [Bindable]
   public class ConfigureInputData extends BaseInputData
   {
      // Note: only public fields can be serialized to Java
      public var citrixData:CitrixData;
      public var template:String;
   }
}