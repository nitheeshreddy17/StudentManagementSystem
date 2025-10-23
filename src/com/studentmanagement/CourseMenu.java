package com.studentmanagement;

import java.util.Scanner;

public class CourseMenu {

    public static void displayMenu(CourseManager manager, Scanner sc) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Course Management ---");
            System.out.println("1. Add Course");
            System.out.println("2. View All Courses");
            System.out.println("3. Search Course by ID");
            System.out.println("4. Update Course");
            System.out.println("5. Delete Course");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Duration (weeks): ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    manager.addCourse(new Course(id, name, duration));
                    System.out.println("Course added successfully!");
                    break;
                case 2:
                    manager.viewAllCourses();
                    break;
                case 3:
                    System.out.print("Enter Course ID to search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    Course c = manager.searchCourseById(searchId);
                    if (c != null) System.out.println(c);
                    else System.out.println("Course not found.");
                    break;
                case 4:
                    System.out.print("Enter Course ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Course Name (leave blank to skip): ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new Duration (0 to skip): ");
                    int newDuration = sc.nextInt();
                    sc.nextLine();
                    Course updatedCourse = new Course(updateId, newName, newDuration);
                    if (manager.updateCourse(updateId, updatedCourse)) {
                        System.out.println("Course updated successfully!");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Course ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    if (manager.deleteCourse(deleteId)) {
                        System.out.println("Course deleted successfully!");
                    } else {
                        System.out.println("Course not found.");
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
