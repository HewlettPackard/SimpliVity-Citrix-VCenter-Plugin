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
public class VirtualMachineVideoCard
    extends VirtualDevice
{

    public Long videoRamSizeInKB;
    public Integer numDisplays;
    public Boolean useAutoDetect;
    public Boolean enable3DSupport;
    public String use3dRenderer;
    public Long graphicsMemorySizeInKB;

    public Long getVideoRamSizeInKB() {
        return videoRamSizeInKB;
    }

    public void setVideoRamSizeInKB(Long videoRamSizeInKB) {
        this.videoRamSizeInKB = videoRamSizeInKB;
    }

    public Integer getNumDisplays() {
        return numDisplays;
    }

    public void setNumDisplays(Integer numDisplays) {
        this.numDisplays = numDisplays;
    }

    public Boolean getUseAutoDetect() {
        return useAutoDetect;
    }

    public void setUseAutoDetect(Boolean useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }

    public Boolean isUseAutoDetect() {
        return useAutoDetect;
    }

    public Boolean getEnable3DSupport() {
        return enable3DSupport;
    }

    public void setEnable3DSupport(Boolean enable3DSupport) {
        this.enable3DSupport = enable3DSupport;
    }

    public Boolean isEnable3DSupport() {
        return enable3DSupport;
    }

    public String getUse3DRenderer() {
        return use3dRenderer;
    }

    public void setUse3DRenderer(String use3dRenderer) {
        this.use3dRenderer = use3dRenderer;
    }

    public Long getGraphicsMemorySizeInKB() {
        return graphicsMemorySizeInKB;
    }

    public void setGraphicsMemorySizeInKB(Long graphicsMemorySizeInKB) {
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
    }

}
