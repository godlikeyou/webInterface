package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomer;

public interface TbCustomerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TbCustomer record);

    int insertSelective(TbCustomer record);

    /*
     * 通过用户ID获取用户信息
     */
    TbCustomer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TbCustomer record);

    int updateByPrimaryKey(TbCustomer record);
    
    TbCustomer selectCustomerByName(String name);
}