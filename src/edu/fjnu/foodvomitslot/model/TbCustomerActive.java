package edu.fjnu.foodvomitslot.model;

import java.util.Date;

public class TbCustomerActive {
	private Integer caId;

	private Integer cId;

	private Date caJointime;

	private Date caLastlogintime;

	private String caRecyle;

	private Integer caPost;
	private Integer caFans;
	private Integer caFocus;
	private Integer caCollection;
	
	private TbCustomer customer;

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

	public Integer getCaFans() {
		return caFans;
	}

	public void setCaFans(Integer caFans) {
		this.caFans = caFans;
	}

	public Integer getCaFocus() {
		return caFocus;
	}

	public void setCaFocus(Integer caFocus) {
		this.caFocus = caFocus;
	}

	public Integer getCaCollection() {
		return caCollection;
	}

	public void setCaCollection(Integer caCollection) {
		this.caCollection = caCollection;
	}

	public TbCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(TbCustomer customer) {
		this.customer = customer;
	}
}