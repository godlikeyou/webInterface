/**
 * 
 */
package edu.fjnu.foodvomitslot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbCustomerActiveMapper;
import edu.fjnu.foodvomitslot.model.TbCustomerActive;
import edu.fjnu.foodvomitslot.service.CustomerActiveServiceInte;

/**
 * @author Administrator
 *
 */
@Service("customerActiveService")
@Transactional
public class CustomerActiveServiceImpl implements CustomerActiveServiceInte {
	
	private TbCustomerActiveMapper customerActiveMapper;

	@Autowired
	public void setCustomerActiveMapper(
			TbCustomerActiveMapper customerActiveMapper) {
		this.customerActiveMapper = customerActiveMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.fjnu.foodvomitslot.service.CustomerActiveServiceInte#
	 * selectCustomerActiveByCid(java.lang.Integer)
	 */
	public TbCustomerActive selectCustomerActiveByCid(Integer cid) {
		// TODO Auto-generated method stub
		return this.customerActiveMapper.selectCustomerActiveByCId(cid);
	}

	@Override
	public boolean addCustomerActiveInfo(TbCustomerActive ca) {
		// TODO Auto-generated method stub
		if(this.customerActiveMapper.insertSelective(ca) == 1)
			return true;
		else
			return false;
	}

}
