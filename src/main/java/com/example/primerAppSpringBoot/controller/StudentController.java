package com.example.primerAppSpringBoot.controller;


import com.example.primerAppSpringBoot.entity.Course;
import com.example.primerAppSpringBoot.entity.Student;
import com.example.primerAppSpringBoot.repository.CourseRepository;
import com.example.primerAppSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/")
public class StudentController {
    @Autowired
    StudentRepository student;

    @GetMapping(value = "students")
    public ResponseEntity<Iterable<Student>> getAll(){
        return new ResponseEntity<Iterable<Student>>(student.findAll(), HttpStatus.OK);
    }
    @PutMapping(value = "students")
    public ResponseEntity<HttpStatus> newStudent(){
        Student newStudent = new Student();
        newStudent.setName("Felipe");
        newStudent.setAge(19);
        newStudent.setCourse("Java");
        newStudent.setLastname("Leiva");
        newStudent.setIdCourse(1);
        student.save(newStudent);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }
    @PostMapping(value = "pathVariable/{id}")
    public ResponseEntity<Student>getStudentByPath(@PathVariable Integer id){
        Student rsp = new Student();
        rsp = student.findById(id);
        return new ResponseEntity<Student>(rsp, HttpStatus.OK);
    }
    @PostMapping(value = "requestParam/")
    public ResponseEntity<Student>getStudentByRequest(@RequestParam Integer id){
        Student rsp = new Student();
        rsp = student.findById(id);
        return new ResponseEntity<Student>(rsp, HttpStatus.OK);
    }
    @PostMapping(value = "requestBody")
    public ResponseEntity<Student>getStudentByBody(@RequestBody Student std){
        Student rsp = new Student();
        rsp = student.findById(std.getId());
        return new ResponseEntity<Student>(rsp, HttpStatus.OK);
    }



}
