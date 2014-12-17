package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbGagNausea {
    private Integer gnId;

    private Integer gId;

    private Integer cId;

    private Date gnTime;

    private String gnStatus;

    public Integer getGnId() {
        return gnId;
    }

    public void setGnId(Integer gnId) {
        this.gnId = gnId;
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

    public Date getGnTime() {
        return gnTime;
    }

    public void setGnTime(Date gnTime) {
        this.gnTime = gnTime;
    }

    public String getGnStatus() {
        return gnStatus;
    }

    public void setGnStatus(String gnStatus) {
        this.gnStatus = gnStatus == null ? null : gnStatus.trim();
    }
}