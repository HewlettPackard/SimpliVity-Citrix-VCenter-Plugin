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
public class ExtSolutionManagerInfo
    extends DynamicData
{

    private final static ExtSolutionManagerInfoTabInfo[] NULL_TAB_ARRAY = new ExtSolutionManagerInfoTabInfo[ 0 ] ;
    public ExtSolutionManagerInfoTabInfo[] tab;
    public String smallIconUrl;

    public ExtSolutionManagerInfoTabInfo[] getTab() {
        if ((tab) == null) {
            return (NULL_TAB_ARRAY);
        }
        return tab;
    }

    public void setTab(ExtSolutionManagerInfoTabInfo[] tab) {
        this.tab = tab;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public void setSmallIconUrl(String smallIconUrl) {
        this.smallIconUrl = smallIconUrl;
    }

}