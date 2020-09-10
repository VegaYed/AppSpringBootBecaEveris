package com.example.primerAppSpringBoot.controller;

import com.example.primerAppSpringBoot.entity.Course;
import com.example.primerAppSpringBoot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class CourseController {

    @Autowired
    CourseRepository course;

    @GetMapping(value = "courses")
    public ResponseEntity<Iterable<Course>>getAll(){
        return new ResponseEntity<Iterable<Course>>(course.findAll(), HttpStatus.OK);
    }


}
