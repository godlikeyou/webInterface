package edu.fjnu.foodvomitslot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbGagMapper;
import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.service.GagServiceInte;
@Service("gagService")
@Transactional
public class GagServiceImpl implements GagServiceInte {
	@Autowired
	private TbGagMapper gagMapper;
	@Override
	public List<TbGag> selectAllGag() {
		// TODO Auto-generated method stub
		return gagMapper.selectAllGag();
	}
	
}
