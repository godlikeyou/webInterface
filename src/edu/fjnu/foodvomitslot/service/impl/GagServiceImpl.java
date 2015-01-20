package edu.fjnu.foodvomitslot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;

import edu.fjnu.foodvomitslot.dao.TbGagMapper;
import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.service.GagServiceInte;
import edu.fjnu.foodvomitslot.util.GlobalVariable;
import edu.fjnu.foodvomitslot.util.Page;
@Service("gagService")
@Transactional
public class GagServiceImpl implements GagServiceInte {
	@Autowired
	private TbGagMapper gagMapper;
	@Override
	public List<TbGag> selectAllGag(Page page) {
		// TODO Auto-generated method stub
		Map<String, Object> map = Maps.newHashMap();
		map.put("page", page);  
		return gagMapper.selectAllGag(map);
	}
	@Override
	public int updateGag(TbGag g) {
		// TODO Auto-generated method stub
		return gagMapper.updateByPrimaryKeySelective(g);
	}
	@Override
	public int insert(TbGag g) {
		if( g == null)return GlobalVariable.RET_FAILURE;
		// TODO Auto-generated method stub
		return gagMapper.insert(g);
	}
	@Override
	public int countGag() {
		// TODO Auto-generated method stub
		return gagMapper.countGag();
	}
	@Override
	public int countPureText() {
		// TODO Auto-generated method stub
		return gagMapper.countPureText();
	}
	@Override
	public List<TbGag> selectAllGagPureText(Page page) {
		// TODO Auto-generated method stub
		Map<String, Object> map = Maps.newHashMap();
		map.put("page", page);  
		return gagMapper.selectAllGagPureText(map);
	}
	@Override
	public int countHavePic() {
		// TODO Auto-generated method stub
		return gagMapper.countHavePic();
	}
	@Override
	public List<TbGag> selectAllGagHavePic(Page page) {
		// TODO Auto-generated method stub
		Map<String, Object> map = Maps.newHashMap();
		map.put("page", page);  
		return gagMapper.selectAllGagHavePic(map);
	}
	@Override
	public int updateByPrimaryKeySelective(TbGag record) {
		// TODO Auto-generated method stub
		return gagMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public TbGag selectByPrimaryKey(Integer gId) {
		// TODO Auto-generated method stub
		return gagMapper.selectByPrimaryKey(gId);
	}
	
}
