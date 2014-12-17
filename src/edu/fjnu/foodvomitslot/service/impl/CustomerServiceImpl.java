package edu.fjnu.foodvomitslot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbCustomerMapper;
import edu.fjnu.foodvomitslot.model.TbCustomer;
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerServiceInte {

	private TbCustomerMapper customerMapper;

	@Autowired
	public void setCustomerMapper(TbCustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public boolean customerLogin(String cname, String passwd) {
		// TODO Auto-generated method stub
		TbCustomer c = customerMapper.selectCustomerByName(cname);
		System.out.println(c);
		if (c == null)
			return false;
		else {
			if (c.getcPassword().equals(passwd))
				return true;
			else
				return false;
		}
	}

}
