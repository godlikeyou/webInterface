package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomerLevelIntegral;

public interface TbCustomerLevelIntegralMapper {
    int deleteByPrimaryKey(Integer cliId);

    int insert(TbCustomerLevelIntegral record);

    int insertSelective(TbCustomerLevelIntegral record);

    TbCustomerLevelIntegral selectByPrimaryKey(Integer cliId);

    int updateByPrimaryKeySelective(TbCustomerLevelIntegral record);

    int updateByPrimaryKey(TbCustomerLevelIntegral record);
}