package com.studentmanagement;

import java.util.Scanner;

public class TeacherMenu {

    public static void displayMenu(TeacherManager manager, Scanner sc) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Teacher Management ---");
            System.out.println("1. Add Teacher");
            System.out.println("2. View All Teachers");
            System.out.println("3. Search Teacher by ID");
            System.out.println("4. Update Teacher");
            System.out.println("5. Delete Teacher");
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
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter Experience (years): ");
                    int exp = sc.nextInt();
                    sc.nextLine();
                    manager.addTeacher(new Teacher(id, name, subject, exp));
                    System.out.println("Teacher added successfully!");
                    break;
                case 2:
                    manager.viewAllTeachers();
                    break;
                case 3:
                    System.out.print("Enter Teacher ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    Teacher t = manager.searchTeacherById(searchId);
                    if (t != null) System.out.println(t);
                    else System.out.println("Teacher not found.");
                    break;
                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name (leave blank to skip): ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new Subject (leave blank to skip): ");
                    String newSubject = sc.nextLine();
                    System.out.print("Enter new Experience (0 to skip): ");
                    int newExp = sc.nextInt();
                    sc.nextLine();
                    Teacher updatedTeacher = new Teacher(updateId, newName, newSubject, newExp);
                    if (manager.updateTeacher(updateId, updatedTeacher)) {
                        System.out.println("Teacher updated successfully!");
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    if (manager.deleteTeacher(deleteId)) {
                        System.out.println("Teacher deleted successfully!");
                    } else {
                        System.out.println("Teacher not found.");
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

