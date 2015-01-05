package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbCustomerActive;

public interface CustomerActiveServiceInte {
	/*
	 * 通过用户ID获取用户活跃信息
	 */
	public TbCustomerActive selectCustomerActiveByCid(Integer cid);
	
	/*
	 * 增加用户活跃信息
	 */
	public boolean addCustomerActiveInfo(TbCustomerActive ca);

}
