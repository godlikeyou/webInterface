package edu.fjnu.foodvomitslot.dao;

import java.util.List;
import java.util.Map;

import edu.fjnu.foodvomitslot.model.TbCustomer;

public interface TbCustomerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TbCustomer record);

    /*
     * 用户注册
     */
    int insertSelective(TbCustomer record);

    /*
     * 通过用户ID获取用户信息
     */
    TbCustomer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TbCustomer record);

    int updateByPrimaryKey(TbCustomer record);
    
    TbCustomer selectCustomerByName(String name);
    
    public List<TbCustomer> selectByNameLevelSubject(Map map);
}