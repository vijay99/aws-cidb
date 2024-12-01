package com.vijay.service;

import com.vijay.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    //RDS DB
    private final List<Course> courses = new ArrayList<>();

    // Create a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Retrieve all courses
    public List<Course> getAllCourses() {
        return courses;
    }

    // Retrieve a course by id
    public Optional<Course> getCourseById(int courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId() == courseId)
                .findFirst();
    }

    // Update a course
    public boolean updateCourse(int courseId, Course newCourse) {
        return getCourseById(courseId).map(existingCourse -> {
            courses.remove(existingCourse);
            courses.add(newCourse);
            return true;
        }).orElse(false);
    }

    // Delete a course by id
    public boolean deleteCourse(int courseId) {
        return courses
                .removeIf(course -> course.getCourseId() == courseId);
    }
}
