package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomerFans;

public interface TbCustomerFansMapper {
    int deleteByPrimaryKey(Integer cfId);

    int insert(TbCustomerFans record);

    int insertSelective(TbCustomerFans record);

    TbCustomerFans selectByPrimaryKey(Integer cfId);

    int updateByPrimaryKeySelective(TbCustomerFans record);

    int updateByPrimaryKey(TbCustomerFans record);
}