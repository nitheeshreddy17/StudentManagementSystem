package com.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
	
	private List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}
	
	
	public boolean addStudent(Student s) {
		
		if(s==null) {
			return false;
		}
		
		if(findStudentById(s.getId())!=null) {
			return false;
		}
		
		students.add(s);
		
		return true;
	}
	
	
	public void viewAllStudents() {
		
		if(students.isEmpty()) {
			System.out.println("No Students");
			return;
		}
		
		for(Student s:students) {
			System.out.println(s);
		}
		
	}
	
	
	public Student findStudentById(int id) {
		
		for(Student s:students) {
			if(s.getId()==id) {
				return s;
			}
				
		}
		
		return null;
		
	}
	
	
	public boolean updateStudent(int id,Student updatedStudent) {
		
		Student existing = findStudentById(id);
		
		if(existing==null) {
			return false;
		}
		
		if(updatedStudent.getName()!=null && !updatedStudent.getName().isBlank()) {
			existing.setName(updatedStudent.getName());
		}
		
		if(updatedStudent.getAge()>0) {
			existing.setAge(updatedStudent.getAge());
		}
		
		if(updatedStudent.getCourse()!=null && !updatedStudent.getCourse().isBlank()) {
			existing.setCourse(updatedStudent.getCourse());
		}
		
		return true;
		
		
	}
	
	
	public boolean deleteStudent(int id) {
		
		Student s = findStudentById(id);
		
		if(s==null) {
			return false;
		}
		
		return students.remove(s);
		
	}
	
	
	public boolean isEmpty() {
		
		return students.isEmpty();
		
	}
	
	public List<Student> getAllStudents(){
		return Collections.unmodifiableList(new ArrayList<>(students));
		
	}
	
	
	
	
}
