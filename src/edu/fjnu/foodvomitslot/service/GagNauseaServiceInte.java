package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbGagNausea;

public interface GagNauseaServiceInte {
	int deleteByPrimaryKey(Integer gnId);

    int insert(TbGagNausea record);

    int insertSelective(TbGagNausea record);

    TbGagNausea selectByPrimaryKey(Integer gnId);

    int updateByPrimaryKeySelective(TbGagNausea record);

    int updateByPrimaryKey(TbGagNausea record);
}
