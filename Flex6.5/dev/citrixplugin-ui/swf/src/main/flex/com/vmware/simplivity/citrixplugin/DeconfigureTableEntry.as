package com.vmware.simplivity.citrixplugin
{
   /**
    * Simple data model for the Deconfigure Table entries
    *
    */
   [RemoteClass(alias="com.vmware.simplivity.citrixplugin.DeconfigureTableEntry")]
   [Bindable]
   public class DeconfigureTableEntry
   {
      // Note: only public fields can be serialized to Java
      public var vmName:String;
      public var vmUsername:String;
	  public var vmHost:String;
	  public var vmCluster:String;
	  public var domainName:String;
	  public var domainUserName:String;
	  public var rowNumber:int;
   }
}