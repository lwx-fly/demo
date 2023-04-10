package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luowenxin
 * @version 1.0.0
 * @description:
 * @create 2023/4/10 15:07
 */
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int unbind(Student record);
}