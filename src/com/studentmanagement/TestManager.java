package com.studentmanagement;

public class TestManager {

    public static void main(String[] args) {
        StudentManager mgr = new StudentManager();

        System.out.println("Is student list empty? " + mgr.isEmpty());

        // Add students
        Student s1 = new Student(1, "Asha", 20, "CSE");
        Student s2 = new Student(2, "Ravi", 21, "ECE");
        Student s3 = new Student(1, "Duplicate", 22, "ME");

        System.out.println("Added s1? " + mgr.addStudent(s1));
        System.out.println("Added s2? " + mgr.addStudent(s2));
        System.out.println("Added s3 (duplicate)? " + mgr.addStudent(s3));

        // View all students
        mgr.viewAllStudents();

        // Find a student
        Student found = mgr.findStudentById(2);
        System.out.println("Found student with ID 2: " + found);

        // Update student
        Student updated = new Student(2, "Ravi Kumar", 22, "ECE");
        boolean isUpdated = mgr.updateStudent(2, updated);
        System.out.println("Update successful? " + isUpdated);
        mgr.viewAllStudents();

        // Delete a student
        boolean deleted = mgr.deleteStudent(1);
        System.out.println("Deleted student with ID 1? " + deleted);
        mgr.viewAllStudents();

        // Get all students (safe copy)
        System.out.println("All students via getAllStudents(): " + mgr.getAllStudents());
    }
}