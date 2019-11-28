package com.qf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.entity.Student;

public interface IStudentService extends IService<Student> {
    void addStudent(Student student);
}
