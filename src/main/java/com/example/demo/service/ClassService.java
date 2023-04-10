package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.entity.Class;
import com.example.demo.mapper.ClassMapper;
/**
 * @description: 
 * @author luowenxin
 * @version 1.0.0
 * @create 2023/4/10 15:34
 */
@Service
public class ClassService{

    @Resource
    private ClassMapper classMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return classMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Class record) {
        return classMapper.insert(record);
    }

    
    public int insertSelective(Class record) {
        return classMapper.insertSelective(record);
    }

    
    public Class selectByPrimaryKey(Integer id) {
        return classMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Class record) {
        return classMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Class record) {
        return classMapper.updateByPrimaryKey(record);
    }

}
