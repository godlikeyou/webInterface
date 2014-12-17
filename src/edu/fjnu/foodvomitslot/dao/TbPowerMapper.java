package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbPower;

public interface TbPowerMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(TbPower record);

    int insertSelective(TbPower record);

    TbPower selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(TbPower record);

    int updateByPrimaryKey(TbPower record);
}