package com.vmware.simplivity.citrixplugin {

import mx.resources.ResourceManager;

/**
 * Various utilities
 */
public class Util {
   // Resource bundle name,  matches the defaultBundle attribute in plugin.xml
   private static var BUNDLE_NAME:String = "com_vmware_simplivity_citrixplugin";

   /**
    * Get a string resource from the default plugin bundle, or return null if not found.
    */
   public static function getString(key:String, parameters:Array = null) : String {
      return ResourceManager.getInstance().getString(BUNDLE_NAME, key, parameters);
   }

   /**
    * Get an image resource from the default plugin bundle, or return null if not found.
    */
   public static function getImage(key:String) : Class {
      return ResourceManager.getInstance().getClass(BUNDLE_NAME, key);
   }

}
}