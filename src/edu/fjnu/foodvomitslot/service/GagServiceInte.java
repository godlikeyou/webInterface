package edu.fjnu.foodvomitslot.service;

import java.util.List;

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.util.Page;

public interface GagServiceInte {
	public List<TbGag> selectAllGag(Page page);
	public List<TbGag> selectAllGagPureText(Page page);
	public int updateGag(TbGag g);
	public int insert(TbGag g);
	public int countGag();
	public int countPureText();
	public int countHavePic();
	public List<TbGag> selectAllGagHavePic(Page page);
}
