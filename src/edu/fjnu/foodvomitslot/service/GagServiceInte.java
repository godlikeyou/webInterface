package edu.fjnu.foodvomitslot.service;

import java.util.List;

import edu.fjnu.foodvomitslot.model.TbGag;

public interface GagServiceInte {
	public List<TbGag> selectAllGag();
	public int updateGag(TbGag g);
	public int insert(TbGag g);
}
