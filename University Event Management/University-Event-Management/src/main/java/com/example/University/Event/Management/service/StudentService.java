package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.Department;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public String addStudent(Student student){
        studentRepo.save(student);
        return "Student added";
    }

    public String updateStudentDepartment(Long studentId, Department type) {
        Optional<Student> myStudentOpt = studentRepo.findById(studentId);
        Student myStudent=null;
        if(myStudentOpt.isPresent()){
            myStudent=myStudentOpt.get();
        }else{
            return "Id not Found";
        }
        myStudent.setDepartment(type);
        studentRepo.save(myStudent);
        return "room Department updated to "+ type;
    }

    public String deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
        return "student deleted "+studentId;
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return studentRepo.findById(studentId);
    }
}
