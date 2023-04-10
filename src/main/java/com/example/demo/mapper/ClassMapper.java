package com.example.demo.mapper;

import com.example.demo.entity.Class;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 
 * @author luowenxin
 * @version 1.0.0
 * @create 2023/4/10 15:34
 */
@Mapper
public interface ClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}