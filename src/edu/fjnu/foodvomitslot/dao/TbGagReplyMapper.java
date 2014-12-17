package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbGagReply;

public interface TbGagReplyMapper {
    int deleteByPrimaryKey(Integer grId);

    int insert(TbGagReply record);

    int insertSelective(TbGagReply record);

    TbGagReply selectByPrimaryKey(Integer grId);

    int updateByPrimaryKeySelective(TbGagReply record);

    int updateByPrimaryKey(TbGagReply record);
}