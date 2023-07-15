package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepo studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setStudentName(updatedStudent.getStudentName());
            existingStudent.setStudentAge(updatedStudent.getStudentAge());

            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}

