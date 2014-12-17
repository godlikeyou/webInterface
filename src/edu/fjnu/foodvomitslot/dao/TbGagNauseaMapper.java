package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbGagNausea;

public interface TbGagNauseaMapper {
    int deleteByPrimaryKey(Integer gnId);

    int insert(TbGagNausea record);

    int insertSelective(TbGagNausea record);

    TbGagNausea selectByPrimaryKey(Integer gnId);

    int updateByPrimaryKeySelective(TbGagNausea record);

    int updateByPrimaryKey(TbGagNausea record);
}