/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.core.beans;

import java.util.Date;

/**
 * The source device that generated the longitudinal data
 *
 * @author pwarrington
 */
public class SourceDevice {

    /**
     * Unique identifier for this entry
     */
    private int id;
    /**
     * Unique device identifier (e.g. serial number)
     */
    private String deviceId;
    /**
     * The device owner
     */
    private String deviceOwner;
    /**
     * The device type
     */
    private String deviceType;
    /**
     * Who created the record
     */
    private int createdBy;
    /**
     * When the record was created
     */
    private Date createdOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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

}
