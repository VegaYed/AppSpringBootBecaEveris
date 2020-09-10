package com.example.primerAppSpringBoot.controller;


import com.example.primerAppSpringBoot.entity.Course;
import com.example.primerAppSpringBoot.entity.Student;
import com.example.primerAppSpringBoot.repository.CourseRepository;
import com.example.primerAppSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class StudentController {
    @Autowired
    StudentRepository student;

    @GetMapping(value = "students")
    public ResponseEntity<Iterable<Student>> getAll(){
        return new ResponseEntity<Iterable<Student>>(student.findAll(), HttpStatus.OK);
    }
}
