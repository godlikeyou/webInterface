package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbCustomerFans {
    private Integer cfId;

    private Integer cId;

    private Integer cFansid;

    private Date cfTime;

    private String cfStatus;

    public Integer getCfId() {
        return cfId;
    }

    public void setCfId(Integer cfId) {
        this.cfId = cfId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcFansid() {
        return cFansid;
    }

    public void setcFansid(Integer cFansid) {
        this.cFansid = cFansid;
    }

    public Date getCfTime() {
        return cfTime;
    }

    public void setCfTime(Date cfTime) {
        this.cfTime = cfTime;
    }

    public String getCfStatus() {
        return cfStatus;
    }

    public void setCfStatus(String cfStatus) {
        this.cfStatus = cfStatus == null ? null : cfStatus.trim();
    }
}