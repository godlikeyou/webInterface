package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomerLevel;

public interface TbCustomerLevelMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(TbCustomerLevel record);

    int insertSelective(TbCustomerLevel record);

    TbCustomerLevel selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(TbCustomerLevel record);

    int updateByPrimaryKey(TbCustomerLevel record);
}