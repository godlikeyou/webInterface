package edu.fjnu.foodvomitslot.model;

public class TbGagTheme {
    private Integer gtId;

    private String gtName;

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName == null ? null : gtName.trim();
    }
}