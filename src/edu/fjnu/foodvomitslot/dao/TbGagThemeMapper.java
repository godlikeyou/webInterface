package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbGagTheme;

public interface TbGagThemeMapper {
    int deleteByPrimaryKey(Integer gtId);

    int insert(TbGagTheme record);

    int insertSelective(TbGagTheme record);

    TbGagTheme selectByPrimaryKey(Integer gtId);

    int updateByPrimaryKeySelective(TbGagTheme record);

    int updateByPrimaryKey(TbGagTheme record);
}