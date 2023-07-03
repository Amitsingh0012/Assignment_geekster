package com.example.University.Event.Management.controller;
import com.example.University.Event.Management.model.Department;
import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.service.EventService;
import com.example.University.Event.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    EventService eventService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("student/{studentId}/{department}")
    public String updateStudentDepartment(@PathVariable Long studentId, @PathVariable Department type){
        return studentService.updateStudentDepartment(studentId,type);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    //event
    //add event
    @PostMapping("event")
    public String addEvent(@RequestBody Event eventModel){
        return eventService.addEvent(eventModel);
    }

    //update event
    @PutMapping("event/{eventId}/{eventName}")
    public String updateEventById(@PathVariable Long eventId, @PathVariable  String eventName){
        return eventService.updateEventById(eventId,eventName);
    }

    //delete event
    @DeleteMapping("event/{eventId}")
    public String deleteEvent(@PathVariable Long eventId){
        return eventService.deleteEvent(eventId);
    }

    @GetMapping("event")
    public Iterable<Event> getAllEvent(){
        return eventService.getAllEvent();
    }

    //get all event by date

    @GetMapping("event/date/{date}")
    public List<Event> getAllEventsByDate(@PathVariable LocalDate date){
        return eventService.getAllEventsByDate(date);


    }
    
}
