package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.entity.Student;
/**
 * @description: 
 * @author luowenxin
 * @version 1.0.0
 * @create 2023/4/10 15:07
 */
@Service
public class StudentService{

    @Resource
    private StudentMapper studentMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

}
