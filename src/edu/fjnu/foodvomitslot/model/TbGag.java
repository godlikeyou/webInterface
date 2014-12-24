package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbGag {
    private Integer gId;

    private Integer sId;
    
    private TbSchool school;
    
    private TbCustomer customer;
    
    private String gContent;

    private String gPic;

    private Date gTime;

    private Integer cId;

    private Integer gtId;

    private Integer gtReccount;

    private Integer gtGoodcount;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getgContent() {
        return gContent;
    }

    public void setgContent(String gContent) {
        this.gContent = gContent == null ? null : gContent.trim();
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic == null ? null : gPic.trim();
    }

    public Date getgTime() {
        return gTime;
    }

    public void setgTime(Date gTime) {
        this.gTime = gTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public Integer getGtReccount() {
        return gtReccount;
    }

    public void setGtReccount(Integer gtReccount) {
        this.gtReccount = gtReccount;
    }

    public Integer getGtGoodcount() {
        return gtGoodcount;
    }

    public void setGtGoodcount(Integer gtGoodcount) {
        this.gtGoodcount = gtGoodcount;
    }

	public TbSchool getSchool() {
		return school;
	}

	public void setSchool(TbSchool school) {
		this.school = school;
	}

	public TbCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(TbCustomer customer) {
		this.customer = customer;
	}
}