package com.example.primerAppSpringBoot.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "course")
    private String course;

    @NotBlank(message = "validation error")
    @Column(name = "idcourse")
    private int idCourse;

    @NotBlank(message = "validation error")
    @Column(name = "age")
    private Integer age;



}
