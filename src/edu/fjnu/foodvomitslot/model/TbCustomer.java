package edu.fjnu.foodvomitslot.model;

public class TbCustomer {
    private Integer cId;

    private String cName;

    private String cNickname;

    private String cPassword;

    private String cPurl;

    private Integer ctTypeid;

    private String cEmail;

    private String cPhone;

    private String cSignature;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcNickname() {
        return cNickname;
    }

    public void setcNickname(String cNickname) {
        this.cNickname = cNickname == null ? null : cNickname.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcPurl() {
        return cPurl;
    }

    public void setcPurl(String cPurl) {
        this.cPurl = cPurl == null ? null : cPurl.trim();
    }

    public Integer getCtTypeid() {
        return ctTypeid;
    }

    public void setCtTypeid(Integer ctTypeid) {
        this.ctTypeid = ctTypeid;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcSignature() {
        return cSignature;
    }

    public void setcSignature(String cSignature) {
        this.cSignature = cSignature == null ? null : cSignature.trim();
    }
}