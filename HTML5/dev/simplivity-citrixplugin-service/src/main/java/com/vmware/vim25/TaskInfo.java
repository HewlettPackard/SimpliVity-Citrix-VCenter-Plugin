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
public class TaskInfo
    extends DynamicData
{

    public String key;
    public ManagedObjectReference task;
    public LocalizableMessage description;
    public String name;
    public String descriptionId;
    public ManagedObjectReference entity;
    public String entityName;
    private final static ManagedObjectReference[] NULL_LOCKED_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] locked;
    public TaskInfoState state;
    public boolean cancelled;
    public boolean cancelable;
    public LocalizedMethodFault error;
    public Object result;
    public Integer progress;
    public TaskReason reason;
    public Calendar queueTime;
    public Calendar startTime;
    public Calendar completeTime;
    public int eventChainId;
    public String changeTag;
    public String parentTaskKey;
    public String rootTaskKey;
    public String activationId;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ManagedObjectReference getTask() {
        return task;
    }

    public void setTask(ManagedObjectReference task) {
        this.task = task;
    }

    public LocalizableMessage getDescription() {
        return description;
    }

    public void setDescription(LocalizableMessage description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public ManagedObjectReference[] getLocked() {
        if ((locked) == null) {
            return (NULL_LOCKED_ARRAY);
        }
        return locked;
    }

    public void setLocked(ManagedObjectReference[] locked) {
        this.locked = locked;
    }

    public TaskInfoState getState() {
        return state;
    }

    public void setState(TaskInfoState state) {
        this.state = state;
    }

    public boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean getCancelable() {
        return cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }

    public boolean isCancelable() {
        return cancelable;
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

    public TaskReason getReason() {
        return reason;
    }

    public void setReason(TaskReason reason) {
        this.reason = reason;
    }

    public Calendar getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(Calendar queueTime) {
        this.queueTime = queueTime;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Calendar completeTime) {
        this.completeTime = completeTime;
    }

    public int getEventChainId() {
        return eventChainId;
    }

    public void setEventChainId(int eventChainId) {
        this.eventChainId = eventChainId;
    }

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }

    public String getParentTaskKey() {
        return parentTaskKey;
    }

    public void setParentTaskKey(String parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public String getRootTaskKey() {
        return rootTaskKey;
    }

    public void setRootTaskKey(String rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

    public String getActivationId() {
        return activationId;
    }

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

}
