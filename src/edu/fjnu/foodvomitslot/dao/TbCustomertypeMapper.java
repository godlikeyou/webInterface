package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbCustomertype;

public interface TbCustomertypeMapper {
    int deleteByPrimaryKey(Integer ctTypeid);

    int insert(TbCustomertype record);

    int insertSelective(TbCustomertype record);

    TbCustomertype selectByPrimaryKey(Integer ctTypeid);

    int updateByPrimaryKeySelective(TbCustomertype record);

    int updateByPrimaryKey(TbCustomertype record);
}