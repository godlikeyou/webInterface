package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbCustomerActive {
    private Integer caId;

    private Integer cId;

    private Date caJointime;

    private Date caLastlogintime;

    private String caRecyle;

    private Integer caPost;

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getCaJointime() {
        return caJointime;
    }

    public void setCaJointime(Date caJointime) {
        this.caJointime = caJointime;
    }

    public Date getCaLastlogintime() {
        return caLastlogintime;
    }

    public void setCaLastlogintime(Date caLastlogintime) {
        this.caLastlogintime = caLastlogintime;
    }

    public String getCaRecyle() {
        return caRecyle;
    }

    public void setCaRecyle(String caRecyle) {
        this.caRecyle = caRecyle == null ? null : caRecyle.trim();
    }

    public Integer getCaPost() {
        return caPost;
    }

    public void setCaPost(Integer caPost) {
        this.caPost = caPost;
    }
}