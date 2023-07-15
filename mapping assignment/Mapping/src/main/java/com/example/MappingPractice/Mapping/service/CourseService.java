package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            existingCourse.setCourseTitle(updatedCourse.getCourseTitle());
            existingCourse.setCourseDescription(updatedCourse.getCourseDescription());

            return courseRepository.save(existingCourse);
        }
        return null;
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

