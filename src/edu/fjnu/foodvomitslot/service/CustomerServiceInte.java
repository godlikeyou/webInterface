package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbCustomer;

public interface CustomerServiceInte {
	/*
	 * 通过用户名和密码判断用户登录
	 */
	public boolean customerLogin(String cname,String passwd);
	
	/*
	 * 通过用户ID获取用户信息
	 */
	public TbCustomer getCustomerInfoByCid(Integer cid);

}
