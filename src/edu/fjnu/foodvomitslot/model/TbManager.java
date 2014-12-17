package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbManager {
    private Integer mId;

    private String mPassword;

    private String mRealname;

    private String mSex;

    private String mQq;

    private String mEmail;

    private String mTel;

    private Date mJointime;

    private Date mLastlogintime;

    private Integer pId;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword == null ? null : mPassword.trim();
    }

    public String getmRealname() {
        return mRealname;
    }

    public void setmRealname(String mRealname) {
        this.mRealname = mRealname == null ? null : mRealname.trim();
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex == null ? null : mSex.trim();
    }

    public String getmQq() {
        return mQq;
    }

    public void setmQq(String mQq) {
        this.mQq = mQq == null ? null : mQq.trim();
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail == null ? null : mEmail.trim();
    }

    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel == null ? null : mTel.trim();
    }

    public Date getmJointime() {
        return mJointime;
    }

    public void setmJointime(Date mJointime) {
        this.mJointime = mJointime;
    }

    public Date getmLastlogintime() {
        return mLastlogintime;
    }

    public void setmLastlogintime(Date mLastlogintime) {
        this.mLastlogintime = mLastlogintime;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}