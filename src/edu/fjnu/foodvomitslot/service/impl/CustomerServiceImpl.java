package edu.fjnu.foodvomitslot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;

import edu.fjnu.foodvomitslot.dao.TbCustomerMapper;
import edu.fjnu.foodvomitslot.model.TbCustomer;
import edu.fjnu.foodvomitslot.service.CustomerServiceInte;
import edu.fjnu.foodvomitslot.util.Page;

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
		if (c == null)
			return false;
		else {
			if (c.getcPassword().equals(passwd))
				return true;
			else
				return false;
		}
	}

	@Override
	public TbCustomer getCustomerInfoByCid(Integer cid) {
		// TODO Auto-generated method stub
		return this.customerMapper.selectByPrimaryKey(cid);
	}

	@Override
	public TbCustomer getCustomerInfoByName(String name) {
		// TODO Auto-generated method stub
		return this.customerMapper.selectCustomerByName(name);
	}

	public List<TbCustomer> selectByNameLevelSubject(String name, Page page) {  
		  System.out.println("name==="+name);
		  Map<String, Object> map = Maps.newHashMap();
		  if (name != null && name.isEmpty()){  
		    name = null;  
		  }  
		  map.put("name", name); 
		  map.put("page", page);             //MAP的话加这一句就OK  
		  return customerMapper.selectByNameLevelSubject(map);  
	}  
}
