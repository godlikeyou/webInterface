package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbCustomer;

import java.util.List;
import java.util.Map;

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.util.Page;


public interface CustomerServiceInte {
	/*
	 * 通过用户名和密码判断用户登录
	 */
	public boolean customerLogin(String cname,String passwd);
	
	/*
	 * 通过用户ID获取用户信息
	 */
	public TbCustomer getCustomerInfoByCid(Integer cid);
	
	/*
	 * 通过用户名获取用户信息
	 */
	public TbCustomer getCustomerInfoByName(String name);public List<TbCustomer> selectByNameLevelSubject(String name, Page page);
	
	/*
	 * 注册用户
	 */
	public boolean addCustomer(TbCustomer customer);
	/*
	 * 更新用户
	 */
	public boolean updateCustomerNickname(Map map);
	public List<TbCustomer> selectAllUser();
}
