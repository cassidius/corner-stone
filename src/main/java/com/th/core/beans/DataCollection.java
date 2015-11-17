/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.core.beans;

import java.util.Date;

/**
 * Represents a collection of data
 *
 * @author pwarrington
 */
public class DataCollection {

    /**
     * unique identifier
     */
    private int id;
    /**
     * When the data was recorded
     */
    private Date recordTime;
    /**
     * Who created the record
     */
    private int createdBy;
    /**
     * When the record was created
     */
    private Date createdOn;
    /**
     * The parent data collection, if any
     */
    private DataCollection parentDataCollection;
    /**
     * The device that generated this data collection
     */
    private SourceDevice sourceDevice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public DataCollection getParentDataCollection() {
        return parentDataCollection;
    }

    public void setParentDataCollection(DataCollection parentDataCollection) {
        this.parentDataCollection = parentDataCollection;
    }

    public SourceDevice getSourceDevice() {
        return sourceDevice;
    }

    public void setSourceDevice(SourceDevice sourceDevice) {
        this.sourceDevice = sourceDevice;
    }

}
