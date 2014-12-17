package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbGag;

public interface TbGagMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(TbGag record);

    int insertSelective(TbGag record);

    TbGag selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(TbGag record);

    int updateByPrimaryKey(TbGag record);
}