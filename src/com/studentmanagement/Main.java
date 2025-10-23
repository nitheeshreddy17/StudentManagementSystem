package com.studentmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentManager mgr = new StudentManager();
		
		while (true) {
		    System.out.println("\n---- Student Management System ----");
		    System.out.println("1. Add Student");
		    System.out.println("2. View All Students");
		    System.out.println("3. Find Student by ID");
		    System.out.println("4. Update Student");
		    System.out.println("5. Delete Student");
		    System.out.println("6. Exit");
		    System.out.print("Enter your choice: ");

		    int choice = sc.nextInt();
		    sc.nextLine(); // consume newline

		    switch (choice) {
		        case 1:
		            // Add Student
		        	System.out.println("Enter ID:");
		        	int id = sc.nextInt();
		        	sc.nextLine();
		        	
		        	System.out.println("Enter Name:");
		        	String name = sc.nextLine();
		        	
		        	System.out.println("Enter Age:");
		        	int age = sc.nextInt();
		        	sc.nextLine();
		        	
		        	System.out.println("Enter Course:");
		        	String course = sc.nextLine();
		        	
		        	Student s = new Student(id,name,age,course);
		        	if(mgr.addStudent(s)) {
		        		System.out.println("Student added successfully");
		        	}else {
		        		System.out.println("Failed to add student");
		        	}
		        	
		            break;
		            
		        case 2:
		            // View All Students
		        	mgr.viewAllStudents();
		            break;
		            
		        case 3:
		            // Find Student
		        	System.out.println("Enter ID to search:");
		        	int searchId = sc.nextInt();
		        	sc.nextLine();
		        	
		        	Student found = mgr.findStudentById(searchId);
		        	if(found!=null) {
		        		System.out.println("Student found: "+found);
		        	}else {
		        		System.out.println("Student not found");
		        	}
		        	
		            break;
		        case 4:
		            // Update Student
		        	System.out.println("Enter ID to update:");
		        	int updateId = sc.nextInt();
		        	sc.nextLine();
		        	
		        	System.out.println("Enter Name:");
		        	String UpdateName = sc.nextLine();
		        	
		        	System.out.println("Enter Age:");
		        	int updateAge = sc.nextInt();
		        	sc.nextLine();
		        	
		        	System.out.println("Enter Course:");
		        	String updateCourse = sc.nextLine();
		        	
		        	Student updatedStudent = new Student(updateId,UpdateName,updateAge,updateCourse);
		        	if(mgr.updateStudent(updateId, updatedStudent)) {
		        		System.out.println("Student updated successfully");
		        	}else {
		        		System.out.println("Student not found,update failed");
		        	}
		        	
		        	
		            break;
		        case 5:
		            // Delete Student
		        	System.out.println("Enter ID to delete:");
		        	int deleteId = sc.nextInt();
		        	sc.nextLine();
		        	
		        	if(mgr.deleteStudent(deleteId)) {
		        		System.out.println("Student deleted successfully");
		        	}else {
		        		System.out.println("Student not found to delete");
		        	}
		        	
		            break;
		        case 6:
		            System.out.println("Exiting...");
		            return; // exit main
		        default:
		            System.out.println("Invalid choice. Try again.");
		    }
		}

		
		
	}
}
