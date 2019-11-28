package com.qf.studentsys_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.qf.dao")
public class StudentsysDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsysDemoApplication.class, args);
    }

}
