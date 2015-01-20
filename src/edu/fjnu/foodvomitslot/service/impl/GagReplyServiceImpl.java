package edu.fjnu.foodvomitslot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;

import edu.fjnu.foodvomitslot.dao.TbGagReplyMapper;
import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.service.GagReplyServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;
import edu.fjnu.foodvomitslot.util.Page;
@Service("gagReplyService")
@Transactional
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

	@Override
	public List<TbGagReply> findRecByGId(Page page,Integer gid) {
		// TODO Auto-generated method stub
		Map<String, Object> map = Maps.newHashMap();
		map.put("gid", gid);
		map.put("page", page);
		return gagReplyMapper.findRecByGId(map);
	}

	@Override
	public int recSize(Integer gid) {
		// TODO Auto-generated method stub
		return gagReplyMapper.recSize(gid);
	}

}
