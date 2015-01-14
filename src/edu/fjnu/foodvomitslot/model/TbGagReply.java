package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbGagReply {
    private Integer grId;

    private Integer gId;

    private String grContent;

    private Date grTime;

    private Integer cId;
    private TbCustomer customer;
    public TbCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(TbCustomer customer) {
		this.customer = customer;
	}

	public Integer getGrId() {
        return grId;
    }

    public void setGrId(Integer grId) {
        this.grId = grId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getGrContent() {
        return grContent;
    }

    public void setGrContent(String grContent) {
        this.grContent = grContent == null ? null : grContent.trim();
    }

    public Date getGrTime() {
        return grTime;
    }

    public void setGrTime(Date grTime) {
        this.grTime = grTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}