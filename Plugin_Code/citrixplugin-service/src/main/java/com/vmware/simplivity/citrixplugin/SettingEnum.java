package com.vmware.simplivity.citrixplugin;

/**
 * Simple Java Enum to demonstrate how the conversion to Flex works.
 * See SettingEnum.as in citrixplugin-ui project.
 */
public enum SettingEnum {
   // Note: The display values can be different than the constant names.
   // On the java side this is used mainly for logging, because display values
   // should be localized on the UI side.
   VAL1("First enum value"),
   VAL2("Second enum value"),
   VAL3("Third enum value");

   private final String _displayName;

   SettingEnum(String displayName) {
      this._displayName = displayName;
   }

   @Override
   public String toString() {
      return _displayName;
   }
}
