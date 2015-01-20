package edu.fjnu.foodvomitslot.dao;

import java.util.List;
import java.util.Map;

import edu.fjnu.foodvomitslot.model.TbGagReply;
import edu.fjnu.foodvomitslot.util.Page;

public interface TbGagReplyMapper {
    int deleteByPrimaryKey(Integer grId);

    int insert(TbGagReply record);

    int insertSelective(TbGagReply record);

    TbGagReply selectByPrimaryKey(Integer grId);

    int updateByPrimaryKeySelective(TbGagReply record);

    int updateByPrimaryKey(TbGagReply record);
    
    List<TbGagReply> findRecByGId(Map map);
    int recSize(Integer gid);
}