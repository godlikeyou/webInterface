package edu.fjnu.foodvomitslot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbGagNauseaMapper;
import edu.fjnu.foodvomitslot.model.TbGagNausea;
import edu.fjnu.foodvomitslot.service.GagNauseaServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;

@Service("gagNauseaService")
@Transactional
public class GagNauseaServiceImpl implements GagNauseaServiceInte {
	@Autowired
	private TbGagNauseaMapper gagNauseaMapper;

	@Override
	public int deleteByPrimaryKey(Integer gnId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbGagNausea record) {
		// TODO Auto-generated method stub
		if( record == null)return GlobalVariable.RET_FAILURE;
		return gagNauseaMapper.insert(record);
	}

	@Override
	public int insertSelective(TbGagNausea record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbGagNausea selectByPrimaryKey(Integer gnId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TbGagNausea record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TbGagNausea record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
