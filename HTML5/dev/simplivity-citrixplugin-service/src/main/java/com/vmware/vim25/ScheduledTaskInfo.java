//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class ScheduledTaskInfo
    extends ScheduledTaskSpec
{

    public ManagedObjectReference scheduledTask;
    public ManagedObjectReference entity;
    public Calendar lastModifiedTime;
    public String lastModifiedUser;
    public Calendar nextRunTime;
    public Calendar prevRunTime;
    public TaskInfoState state;
    public LocalizedMethodFault error;
    public Object result;
    public Integer progress;
    public ManagedObjectReference activeTask;
    public ManagedObjectReference taskObject;

    public ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }

    public void setScheduledTask(ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Calendar lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    public Calendar getNextRunTime() {
        return nextRunTime;
    }

    public void setNextRunTime(Calendar nextRunTime) {
        this.nextRunTime = nextRunTime;
    }

    public Calendar getPrevRunTime() {
        return prevRunTime;
    }

    public void setPrevRunTime(Calendar prevRunTime) {
        this.prevRunTime = prevRunTime;
    }

    public TaskInfoState getState() {
        return state;
    }

    public void setState(TaskInfoState state) {
        this.state = state;
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ManagedObjectReference getActiveTask() {
        return activeTask;
    }

    public void setActiveTask(ManagedObjectReference activeTask) {
        this.activeTask = activeTask;
    }

    public ManagedObjectReference getTaskObject() {
        return taskObject;
    }

    public void setTaskObject(ManagedObjectReference taskObject) {
        this.taskObject = taskObject;
    }

}