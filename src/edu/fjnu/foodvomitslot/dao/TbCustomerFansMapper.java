package edu.fjnu.foodvomitslot.dao;

import java.util.List;

import edu.fjnu.foodvomitslot.model.TbCustomerFans;

public interface TbCustomerFansMapper {
    int deleteByPrimaryKey(Integer cfId);

    int insert(TbCustomerFans record);

    int insertSelective(TbCustomerFans record);

    TbCustomerFans selectByPrimaryKey(Integer cfId);

    int updateByPrimaryKeySelective(TbCustomerFans record);

    int updateByPrimaryKey(TbCustomerFans record);
    
    List<TbCustomerFans> selectCustomerFansByCid(Integer CId);
    /*
     * 获取用户粉丝量
     */
    int customerFansCount(Integer cid);
}