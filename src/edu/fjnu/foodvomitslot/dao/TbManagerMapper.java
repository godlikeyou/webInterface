package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbManager;

public interface TbManagerMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(TbManager record);

    int insertSelective(TbManager record);

    TbManager selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(TbManager record);

    int updateByPrimaryKey(TbManager record);
}