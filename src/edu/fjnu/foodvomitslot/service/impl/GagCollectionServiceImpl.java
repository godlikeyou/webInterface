package edu.fjnu.foodvomitslot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.foodvomitslot.dao.TbGagCollectionMapper;
import edu.fjnu.foodvomitslot.model.TbGagCollection;
import edu.fjnu.foodvomitslot.service.GagCollectionServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;
@Service("gagCollectionService")
@Transactional
public class GagCollectionServiceImpl implements GagCollectionServiceInte {
	@Autowired
	private TbGagCollectionMapper gagCollectionMapper ;

	@Override
	public int deleteByPrimaryKey(Integer gcId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbGagCollection record) {
		// TODO Auto-generated method stub
		if( record == null )return GlobalVariable.RET_FAILURE;
		return gagCollectionMapper.insert(record);
	}

	@Override
	public int insertSelective(TbGagCollection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbGagCollection selectByPrimaryKey(Integer gcId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TbGagCollection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TbGagCollection record) {
		// TODO Auto-generated method stub
		return 0;
	}


}
