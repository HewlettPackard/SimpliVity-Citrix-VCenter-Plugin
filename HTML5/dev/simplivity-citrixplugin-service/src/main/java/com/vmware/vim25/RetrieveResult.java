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
public class RetrieveResult
    extends DynamicData
{

    public String token;
    private final static ObjectContent[] NULL_OBJECTS_ARRAY = new ObjectContent[ 0 ] ;
    public ObjectContent[] objects;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ObjectContent[] getObjects() {
        if ((objects) == null) {
            return (NULL_OBJECTS_ARRAY);
        }
        return objects;
    }

    public void setObjects(ObjectContent[] objects) {
        this.objects = objects;
    }

}
