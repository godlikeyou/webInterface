package edu.fjnu.foodvomitslot.model;

public class TbCustomerLevel {
    private Integer clId;

    private Integer clLowIntegral;

    private Integer clHighIntegral;

    private String clNickname;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getClLowIntegral() {
        return clLowIntegral;
    }

    public void setClLowIntegral(Integer clLowIntegral) {
        this.clLowIntegral = clLowIntegral;
    }

    public Integer getClHighIntegral() {
        return clHighIntegral;
    }

    public void setClHighIntegral(Integer clHighIntegral) {
        this.clHighIntegral = clHighIntegral;
    }

    public String getClNickname() {
        return clNickname;
    }

    public void setClNickname(String clNickname) {
        this.clNickname = clNickname == null ? null : clNickname.trim();
    }
}