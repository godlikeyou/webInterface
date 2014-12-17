package edu.fjnu.foodvomitslot.dao;

import edu.fjnu.foodvomitslot.model.TbSchool;

public interface TbSchoolMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(TbSchool record);

    int insertSelective(TbSchool record);

    TbSchool selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(TbSchool record);

    int updateByPrimaryKey(TbSchool record);
}