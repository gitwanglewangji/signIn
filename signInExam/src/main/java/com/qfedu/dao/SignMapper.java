package com.qfedu.dao;

import java.util.List;
import java.util.Map;

import com.qfedu.pojo.Sign;

public interface SignMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sign record);

    int insertSelective(Sign record);

    Sign selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sign record);

    int updateByPrimaryKey(Sign record);
    
    List<Sign> selectAll(Sign sign);
    
    List<Sign> selectAllSign(Map<String,Object> map);
    
    int total();
    
}