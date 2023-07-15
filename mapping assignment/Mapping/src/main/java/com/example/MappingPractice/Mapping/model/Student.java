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
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String studentId;
    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String StudentDepartment;
    @OneToOne
    private Address address;

}
