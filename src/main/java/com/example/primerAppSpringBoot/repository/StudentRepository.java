package com.example.primerAppSpringBoot.repository;

import com.example.primerAppSpringBoot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findById(Integer id);

}
