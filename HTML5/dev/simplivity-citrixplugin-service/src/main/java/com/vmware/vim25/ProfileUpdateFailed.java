//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;



/**
 * 
 */
@SuppressWarnings("all")
public class ProfileUpdateFailed
    extends VimFault
{

    private final static ProfileUpdateFailedUpdateFailure[] NULL_FAILURE_ARRAY = new ProfileUpdateFailedUpdateFailure[ 0 ] ;
    public ProfileUpdateFailedUpdateFailure[] failure;
    private final static ProfileUpdateFailedUpdateFailure[] NULL_WARNINGS_ARRAY = new ProfileUpdateFailedUpdateFailure[ 0 ] ;
    public ProfileUpdateFailedUpdateFailure[] warnings;

    public ProfileUpdateFailedUpdateFailure[] getFailure() {
        if ((failure) == null) {
            return (NULL_FAILURE_ARRAY);
        }
        return failure;
    }

    public void setFailure(ProfileUpdateFailedUpdateFailure[] failure) {
        this.failure = failure;
    }

    public ProfileUpdateFailedUpdateFailure[] getWarnings() {
        if ((warnings) == null) {
            return (NULL_WARNINGS_ARRAY);
        }
        return warnings;
    }

    public void setWarnings(ProfileUpdateFailedUpdateFailure[] warnings) {
        this.warnings = warnings;
    }

}
