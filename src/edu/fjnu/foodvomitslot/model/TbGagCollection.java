package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbGagCollection {
    private Integer gcId;

    private Integer gId;

    private Integer cId;

    private Date gcTime;

    private String gcStatus;

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getGcTime() {
        return gcTime;
    }

    public void setGcTime(Date gcTime) {
        this.gcTime = gcTime;
    }

    public String getGcStatus() {
        return gcStatus;
    }

    public void setGcStatus(String gcStatus) {
        this.gcStatus = gcStatus == null ? null : gcStatus.trim();
    }
}