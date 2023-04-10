package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @PostMapping("/insert")
    public void insert(@RequestBody Student student) {
        studentMapper.insert(student);
    }

    @PostMapping("/deleteById")
    public void deleteById(@RequestParam Integer id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @GetMapping("/selectById")
    public Student selectById(@RequestParam Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }


    @PostMapping("/bind")
    public void bind(@RequestBody Student student) {
        Student student1 = new Student();
        student1.setClassId(student.getClassId());
        student1.setId(student.getId());
        studentMapper.updateByPrimaryKeySelective(student);
    }


    @PostMapping("/unbind")
    public void unbind(@RequestBody Student student) {
        Student student1 = new Student();
        student1.setId(student.getId());
        studentMapper.unbind(student);
    }


}