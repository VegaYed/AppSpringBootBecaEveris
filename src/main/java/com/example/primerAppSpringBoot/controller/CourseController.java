package com.example.primerAppSpringBoot.controller;

import com.example.primerAppSpringBoot.entity.Course;
import com.example.primerAppSpringBoot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/")
public class CourseController {

    @Autowired
    CourseRepository repCourse;

    @GetMapping(value = "courses")
    public ResponseEntity<Iterable<Course>>getAll(){
        return new ResponseEntity<Iterable<Course>>(repCourse.findAll(), HttpStatus.OK);
    }
    /*@GetMapping(value = "course/{id}")
    public ResponseEntity<Course>getCourseByPath(@PathVariable Integer id){
        Course course = repCourse.findById(id);
        return new ResponseEntity<Course>(course,HttpStatus.OK);
    }
    @PostMapping(value = "course/")
    public ResponseEntity<Course>getCourseByRequest(@RequestParam Integer id) {
        Course course = repCourse.findById(id);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }*/
    @PostMapping(value = "courseB")
    public ResponseEntity<Course>getCourseByBody(@RequestBody Course courseRetrived) {
        Optional<Course> course = repCourse.findById(courseRetrived.getId());
        return course.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
