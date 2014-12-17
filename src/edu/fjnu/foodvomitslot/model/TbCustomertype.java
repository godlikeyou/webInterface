package edu.fjnu.foodvomitslot.model;

public class TbCustomertype {
    private Integer ctTypeid;

    private String ctTypedescription;

    public Integer getCtTypeid() {
        return ctTypeid;
    }

    public void setCtTypeid(Integer ctTypeid) {
        this.ctTypeid = ctTypeid;
    }

    public String getCtTypedescription() {
        return ctTypedescription;
    }

    public void setCtTypedescription(String ctTypedescription) {
        this.ctTypedescription = ctTypedescription == null ? null : ctTypedescription.trim();
    }
}