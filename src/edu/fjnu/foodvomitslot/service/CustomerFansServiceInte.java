package edu.fjnu.foodvomitslot.service;

import java.util.List;

import edu.fjnu.foodvomitslot.model.TbCustomerFans;


public interface CustomerFansServiceInte {
	/*
	 * 通过用户ID获取该用户的粉丝
	 */
	public List<TbCustomerFans> getCustomerFans(Integer cid);
	
	/*
	 * 通过用户ID 获取该用户粉丝量
	 */
	public int getCustomerFansCount(Integer cid);
}
