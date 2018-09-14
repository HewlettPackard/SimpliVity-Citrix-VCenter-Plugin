package com.vmware.simplivity.citrixplugin
{
	import mx.collections.ArrayList;

   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.BaseInputData")]
   [Bindable]
   public class BaseInputData
   {
      // Note: only public fields can be serialized to Java
      public var vmData:ArrayList;
      public var domainData:DomainData;
	  public var ovcData:OVCData;
   }
}