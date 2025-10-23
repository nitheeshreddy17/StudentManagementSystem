package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private List<Course> courses;

    // Constructor
    public CourseManager() {
        courses = new ArrayList<>();
    }

    // Add a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return courses;
    }

    // View all courses
    public void viewAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : courses) {
                System.out.println(c);
            }
        }
    }

    // Find a course by ID
    public Course searchCourseById(int id) {
        for (Course c : courses) {
            if (c.getCourseId() == id) {
                return c;
            }
        }
        return null;
    }

    // Update an existing course by ID
    public boolean updateCourse(int id, Course updatedCourse) {
        Course existing = searchCourseById(id);
        if (existing == null) {
            return false; // Course not found
        }

        // Update name if provided
        if (updatedCourse.getCourseName() != null && !updatedCourse.getCourseName().isBlank()) {
            existing.setCourseName(updatedCourse.getCourseName());
        }

        // Update duration if greater than 0
        if (updatedCourse.getDuration() > 0) {
            existing.setDuration(updatedCourse.getDuration());
        }

        return true; // Successfully updated
    }

    // Delete a course by ID
    public boolean deleteCourse(int id) {
        Course existing = searchCourseById(id);
        if (existing == null) {
            return false; // Not found
        }
        courses.remove(existing);
        return true; // Successfully deleted
    }
}

