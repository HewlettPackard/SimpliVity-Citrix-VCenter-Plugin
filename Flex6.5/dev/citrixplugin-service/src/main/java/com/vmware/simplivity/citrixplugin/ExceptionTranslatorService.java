package com.vmware.simplivity.citrixplugin;

import org.springframework.flex.core.ExceptionTranslator;
import flex.messaging.MessageException;

/**
 * Custom ExceptionTranslator service, used to convert Java exceptions to Flex errors,
 * in order to return meaningful information back to the UI.
 *
 * See how this is configured in the citrixplugin-ui's bundle-context.xml.
 */
public class ExceptionTranslatorService implements ExceptionTranslator {

   /**
    * Checks if the translator can handle the specified exception class.
    *
    * @see org.springframework.flex.core.ExceptionTranslator#handles(java.lang.Class)
    */
   @Override
   public boolean handles(Class<?> clazz) {
      return true;
   }

   /**
    * Translate the specified exception into a BlazeDS MessageException that will
    * propagate proper AMF error message back to the client.
    *
    * @see org.springframework.flex.core.ExceptionTranslator#translate(java.lang.Throwable)
    */
   @Override
   public MessageException translate(Throwable t) {
      MessageException ex = new MessageException();

      StackTraceElement[] stElements = t.getStackTrace();
      String topMostStackTrace = stElements[0].toString();
      ex.setCode(t.toString());
      ex.setMessage(topMostStackTrace);

      // The root cause should be the initial Java exception, so we set the error code to
      // that class name, and error details to the proper error message to display.
      Throwable rootCause = t.getCause();
      if (rootCause != null) {
         ex.setCode(rootCause.getClass().getName());
         ex.setRootCause(rootCause);
         ex.setDetails(rootCause.getLocalizedMessage());
      }
      return ex;
   }

}
