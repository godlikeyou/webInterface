package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbGagCollection;

public interface GagCollectionServiceInte {
	int deleteByPrimaryKey(Integer gcId);

    int insert(TbGagCollection record);

    int insertSelective(TbGagCollection record);

    TbGagCollection selectByPrimaryKey(Integer gcId);

    int updateByPrimaryKeySelective(TbGagCollection record);

    int updateByPrimaryKey(TbGagCollection record); 
}
