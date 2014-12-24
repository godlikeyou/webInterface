package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomerFocus;

public interface TbCustomerFocusMapper {
    int deleteByPrimaryKey(Integer cfsId);

    int insert(TbCustomerFocus record);

    int insertSelective(TbCustomerFocus record);

    TbCustomerFocus selectByPrimaryKey(Integer cfsId);

    int updateByPrimaryKeySelective(TbCustomerFocus record);

    int updateByPrimaryKey(TbCustomerFocus record);
    
    int customerFocusCount(Integer cid);
}