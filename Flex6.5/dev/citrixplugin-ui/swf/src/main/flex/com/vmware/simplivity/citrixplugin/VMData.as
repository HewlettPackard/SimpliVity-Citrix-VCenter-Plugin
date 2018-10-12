package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the settings page.
    *
    * See the java equivalent, GlobalSettings.java, in the global-service project.
    * For more complex types see the Actionscript-Java serialization documentation.
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.VMData")]
   [Bindable]
   public class VMData
   {
      // Note: only public fields can be serialized to Java
      public var vmName:String;
      public var vmUsername:String;
      public var vmPassword:String;
	  public var vmCluster:String;
	  public var vmHost:String;
   }
}