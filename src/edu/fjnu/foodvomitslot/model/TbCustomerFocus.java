package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbCustomerFocus {
    private Integer cfsId;

    private Integer cId;

    private Integer cFocusid;

    private Date cfsTime;

    private String cfsIfshield;

    public Integer getCfsId() {
        return cfsId;
    }

    public void setCfsId(Integer cfsId) {
        this.cfsId = cfsId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcFocusid() {
        return cFocusid;
    }

    public void setcFocusid(Integer cFocusid) {
        this.cFocusid = cFocusid;
    }

    public Date getCfsTime() {
        return cfsTime;
    }

    public void setCfsTime(Date cfsTime) {
        this.cfsTime = cfsTime;
    }

    public String getCfsIfshield() {
        return cfsIfshield;
    }

    public void setCfsIfshield(String cfsIfshield) {
        this.cfsIfshield = cfsIfshield == null ? null : cfsIfshield.trim();
    }
}