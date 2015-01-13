package edu.fjnu.foodvomitslot.dao;


import java.util.List;
import java.util.Map;

import edu.fjnu.foodvomitslot.model.TbGag;
import edu.fjnu.foodvomitslot.util.Page;

public interface TbGagMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(TbGag record);

    int insertSelective(TbGag record);

    TbGag selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(TbGag record);

    int updateByPrimaryKey(TbGag record);
    
    List<TbGag> selectAllGag(Map map);
    List<TbGag> selectAllGagPureText(Map map);
    int countGag();
    int countPureText();
    int countHavePic();
    List<TbGag> selectAllGagHavePic(Map map);
}