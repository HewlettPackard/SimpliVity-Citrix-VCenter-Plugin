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
public class AlarmTriggeringAction
    extends AlarmAction
{

    public Action action;
    private final static AlarmTriggeringActionTransitionSpec[] NULL_TRANSITION_SPECS_ARRAY = new AlarmTriggeringActionTransitionSpec[ 0 ] ;
    public AlarmTriggeringActionTransitionSpec[] transitionSpecs;
    public boolean green2yellow;
    public boolean yellow2red;
    public boolean red2yellow;
    public boolean yellow2green;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public AlarmTriggeringActionTransitionSpec[] getTransitionSpecs() {
        if ((transitionSpecs) == null) {
            return (NULL_TRANSITION_SPECS_ARRAY);
        }
        return transitionSpecs;
    }

    public void setTransitionSpecs(AlarmTriggeringActionTransitionSpec[] transitionSpecs) {
        this.transitionSpecs = transitionSpecs;
    }

    public boolean getGreen2Yellow() {
        return green2yellow;
    }

    public void setGreen2Yellow(boolean green2yellow) {
        this.green2yellow = green2yellow;
    }

    public boolean isGreen2Yellow() {
        return green2yellow;
    }

    public boolean getYellow2Red() {
        return yellow2red;
    }

    public void setYellow2Red(boolean yellow2red) {
        this.yellow2red = yellow2red;
    }

    public boolean isYellow2Red() {
        return yellow2red;
    }

    public boolean getRed2Yellow() {
        return red2yellow;
    }

    public void setRed2Yellow(boolean red2yellow) {
        this.red2yellow = red2yellow;
    }

    public boolean isRed2Yellow() {
        return red2yellow;
    }

    public boolean getYellow2Green() {
        return yellow2green;
    }

    public void setYellow2Green(boolean yellow2green) {
        this.yellow2green = yellow2green;
    }

    public boolean isYellow2Green() {
        return yellow2green;
    }

}
