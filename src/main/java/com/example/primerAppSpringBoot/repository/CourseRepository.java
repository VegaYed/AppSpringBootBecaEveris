package com.example.primerAppSpringBoot.repository;

import com.example.primerAppSpringBoot.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {



}
