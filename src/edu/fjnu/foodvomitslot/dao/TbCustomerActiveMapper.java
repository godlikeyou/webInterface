package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomerActive;

public interface TbCustomerActiveMapper {
    int deleteByPrimaryKey(Integer caId);

    int insert(TbCustomerActive record);

    int insertSelective(TbCustomerActive record);

    TbCustomerActive selectByPrimaryKey(Integer caId);

    int updateByPrimaryKeySelective(TbCustomerActive record);

    int updateByPrimaryKey(TbCustomerActive record);
}