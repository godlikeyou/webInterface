package edu.fjnu.foodvomitslot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.fjnu.foodvomitslot.dao.TbGagReplyMapper;
import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.service.GagReplyServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;

public class GagReplyServiceImpl implements GagReplyServiceInte {
	@Autowired
	private TbGagReplyMapper gagReplyMapper;
	@Override
	public int deleteByPrimaryKey(Integer grId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbGagReply record) {
		// TODO Auto-generated method stub
		if( record == null)return GlobalVariable.RET_FAILURE;
		return gagReplyMapper.insert(record);
	}

	@Override
	public int insertSelective(TbGagReply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbGagReply selectByPrimaryKey(Integer grId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TbGagReply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TbGagReply record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
