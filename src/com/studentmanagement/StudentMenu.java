package com.studentmanagement;

import java.util.Scanner;

public class StudentMenu {

    public static void displayMenu(StudentManager manager, Scanner sc) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    manager.addStudent(new Student(id, name, age, course));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    manager.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    Student s = manager.findStudentById(searchId);
                    if (s != null) System.out.println(s);
                    else System.out.println("Student not found.");
                    break;
                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name (leave blank to skip): ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new Age (0 to skip): ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Course (leave blank to skip): ");
                    String newCourse = sc.nextLine();
                    Student updatedStudent = new Student(updateId, newName, newAge, newCourse);
                    if (manager.updateStudent(updateId, updatedStudent)) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    if (manager.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
