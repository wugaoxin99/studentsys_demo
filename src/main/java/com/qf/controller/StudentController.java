package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

/**
 * 学生控制器
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @RequestMapping("/list")
    public String list(ModelMap map){
        List<Student> studentList = studentService.list();
        System.out.println(studentList.get(1));
        map.put("studentList",studentList);
        return "student_list";
    }
    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        studentService.removeById(id);
        return "redirect:/stu/list";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(Integer id, Model model){
        Student student = studentService.getById(id);
        model.addAttribute("student",student);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Student student,String birthdayDemo){
        Date birthday=Date.valueOf(birthdayDemo);
        student.setBirthday(birthday);
        studentService.updateById(student);
        return "redirect:/stu/list";
    }
    //添加学生页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    //添加学生信息
    @RequestMapping("/add")
    public String add(Student student,String birthdayDemo){
        Date birthday=Date.valueOf(birthdayDemo);
        student.setBirthday(birthday);
//        studentService.addStudent(student);
        studentService.save(student);
        return "redirect:/stu/list";
    }
    /**
     * 会写bug的好程序员
     * bug让代码更精彩
     */

    /**
     * 你好新世界
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello,spring_boot!");
        return "hello,spring_boot!";
    }
}
