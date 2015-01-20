package edu.fjnu.foodvomitslot.service;

import java.util.List;
import java.util.Map;

import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.util.Page;

public interface GagReplyServiceInte {
	int deleteByPrimaryKey(Integer grId);

    int insert(TbGagReply record);

    int insertSelective(TbGagReply record);

    TbGagReply selectByPrimaryKey(Integer grId);

    int updateByPrimaryKeySelective(TbGagReply record);

    int updateByPrimaryKey(TbGagReply record);
    List<TbGagReply> findRecByGId(Page page,Integer gid);
    int recSize(Integer gid);
}
