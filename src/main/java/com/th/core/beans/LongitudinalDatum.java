package com.th.core.beans;

import java.util.Date;

/**
 * An individual data point
 *
 * @author pwarrington
 */
public class LongitudinalDatum {

    /**
     * Unique identifier
     */
    private int id;
    /**
     * The data collection this datum belongs to
     */
    private DataCollection dataCollection;
    /**
     * The value of this datum
     */
    private String value;
    /**
     * A label qualifier (e.g. mg, points, cm, bpm, etc)
     */
    private String label;
    /**
     * The type of value
     */
    private String type;
    /**
     * when this datum was recorded
     */
    private Date recordTime;
    /**
     * The user id this datum applies to
     */
    private int appliesTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataCollection getDataCollection() {
        return dataCollection;
    }

    public void setDataCollection(DataCollection dataCollection) {
        this.dataCollection = dataCollection;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public int getAppliesTo() {
        return appliesTo;
    }

    public void setAppliesTo(int appliesTo) {
        this.appliesTo = appliesTo;
    }

}
