package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StudentMap;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMap, Student> implements IStudentService {
    @Autowired
    private StudentMap studentMap;
    @Override
    public void addStudent(Student student) {
        studentMap.addStudent(student);
    }
}
