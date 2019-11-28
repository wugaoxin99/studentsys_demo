package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

public interface StudentMap extends BaseMapper<Student> {
    int addStudent(Student student);
}
