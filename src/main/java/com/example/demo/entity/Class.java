package com.example.demo.entity;

/**
 * @description: 
 * @author luowenxin
 * @version 1.0.0
 * @create 2023/4/10 15:34
 */
/**
    * 班级表
    */
public class Class {
    /**
    * id
    */
    private Integer id;

    /**
    * 班级名称
    */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}