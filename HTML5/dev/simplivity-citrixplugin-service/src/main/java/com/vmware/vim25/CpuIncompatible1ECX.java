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
public class CpuIncompatible1ECX
    extends CpuIncompatible
{

    public boolean sse3;
    public Boolean pclmulqdq;
    public boolean ssse3;
    public boolean sse41;
    public boolean sse42;
    public Boolean aes;
    public boolean other;
    public boolean otherOnly;

    public boolean getSse3() {
        return sse3;
    }

    public void setSse3(boolean sse3) {
        this.sse3 = sse3;
    }

    public boolean isSse3() {
        return sse3;
    }

    public Boolean getPclmulqdq() {
        return pclmulqdq;
    }

    public void setPclmulqdq(Boolean pclmulqdq) {
        this.pclmulqdq = pclmulqdq;
    }

    public Boolean isPclmulqdq() {
        return pclmulqdq;
    }

    public boolean getSsse3() {
        return ssse3;
    }

    public void setSsse3(boolean ssse3) {
        this.ssse3 = ssse3;
    }

    public boolean isSsse3() {
        return ssse3;
    }

    public boolean getSse41() {
        return sse41;
    }

    public void setSse41(boolean sse41) {
        this.sse41 = sse41;
    }

    public boolean isSse41() {
        return sse41;
    }

    public boolean getSse42() {
        return sse42;
    }

    public void setSse42(boolean sse42) {
        this.sse42 = sse42;
    }

    public boolean isSse42() {
        return sse42;
    }

    public Boolean getAes() {
        return aes;
    }

    public void setAes(Boolean aes) {
        this.aes = aes;
    }

    public Boolean isAes() {
        return aes;
    }

    public boolean getOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public boolean isOther() {
        return other;
    }

    public boolean getOtherOnly() {
        return otherOnly;
    }

    public void setOtherOnly(boolean otherOnly) {
        this.otherOnly = otherOnly;
    }

    public boolean isOtherOnly() {
        return otherOnly;
    }

}
