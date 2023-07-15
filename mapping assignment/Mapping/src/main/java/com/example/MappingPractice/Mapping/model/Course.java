package com.example.MappingPractice.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String courseId;

    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany
    List<Student> studentList;
}
