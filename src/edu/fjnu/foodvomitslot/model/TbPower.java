package edu.fjnu.foodvomitslot.model;

public class TbPower {
    private Integer pId;

    private String pDescription;

    private Integer pPowercode;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription == null ? null : pDescription.trim();
    }

    public Integer getpPowercode() {
        return pPowercode;
    }

    public void setpPowercode(Integer pPowercode) {
        this.pPowercode = pPowercode;
    }
}