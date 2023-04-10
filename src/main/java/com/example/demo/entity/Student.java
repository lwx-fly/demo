package com.example.demo.entity;

/**
 * @author luowenxin
 * @version 1.0.0
 * @description:
 * @create 2023/4/10 15:07
 */
public class Student {
    /**
     * id
     */
    private Integer id;

    /**
     * 学生学号
     */
    private Long no;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 班级
     */
    private Integer classId;

    /**
     * 籍贯
     */
    private String hometown;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}