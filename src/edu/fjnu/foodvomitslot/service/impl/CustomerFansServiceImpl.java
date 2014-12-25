package edu.fjnu.foodvomitslot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbCustomerFansMapper;
import edu.fjnu.foodvomitslot.model.TbCustomerFans;
import edu.fjnu.foodvomitslot.service.CustomerFansServiceInte;

@Service("customerFansService")
@Transactional
public class CustomerFansServiceImpl implements CustomerFansServiceInte {
	
	private TbCustomerFansMapper customerfansMapper;
	
	@Autowired
	public void setCustomerfansMapper(TbCustomerFansMapper customerfansMapper) {
		this.customerfansMapper = customerfansMapper;
	}


	@Override
	public List<TbCustomerFans> getCustomerFans(Integer cid) {
		// TODO Auto-generated method stub
		return this.getCustomerFans(cid);
	}


	@Override
	public int getCustomerFansCount(Integer cid) {
		// TODO Auto-generated method stub
		return this.customerfansMapper.customerFansCount(cid);
	}

}
