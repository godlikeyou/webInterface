package edu.fjnu.foodvomitslot.service;

import edu.fjnu.foodvomitslot.model.TbGagReply;

public interface GagReplyServiceInte {
	int deleteByPrimaryKey(Integer grId);

    int insert(TbGagReply record);

    int insertSelective(TbGagReply record);

    TbGagReply selectByPrimaryKey(Integer grId);

    int updateByPrimaryKeySelective(TbGagReply record);

    int updateByPrimaryKey(TbGagReply record);
}
