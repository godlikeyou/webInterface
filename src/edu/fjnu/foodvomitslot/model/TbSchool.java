package edu.fjnu.foodvomitslot.model;

public class TbSchool {
    private Integer sId;

    private String sName;

    private Integer sCount;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsCount() {
        return sCount;
    }

    public void setsCount(Integer sCount) {
        this.sCount = sCount;
    }
}