package com.example.primerAppSpringBoot.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

}
