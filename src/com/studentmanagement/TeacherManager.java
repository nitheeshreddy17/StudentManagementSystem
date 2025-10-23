package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
	
	private List<Teacher> teachers;
	
	public TeacherManager() {
		teachers = new ArrayList<>();
	}
	
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public List<Teacher> getAllTeachers(){
		return teachers;
	}
	
	public void viewAllTeachers() {
		if(teachers.isEmpty()) {
			System.out.println("No teachers available");
		}else{
			for(Teacher t :teachers) {
				System.out.println(t);
			}
		}
	}
	
	
	public Teacher searchTeacherById(int id) {
		for(Teacher t:teachers) {
			if(t.getTeacherId()==id) {
				return t;
			}
		}
		return null;
	}
	
	
	public boolean updateTeacher(int id,Teacher updatedTeacher) {
		Teacher existing = searchTeacherById(id);
		
		if(existing==null) {
			return false;
		}
		
		// Update name if provided
	    if (updatedTeacher.getTeacherName() != null && !updatedTeacher.getTeacherName().isBlank()) {
	        existing.setTeacherName(updatedTeacher.getTeacherName());
	    }
	    
	    // Update subject if provided
	    if (updatedTeacher.getSubject() != null && !updatedTeacher.getSubject().isBlank()) {
	        existing.setSubject(updatedTeacher.getSubject());
	    }
	    
	    // Update experience if greater than 0
	    if (updatedTeacher.getExperience() > 0) {
	        existing.setExperience(updatedTeacher.getExperience());
	    }
	    
	    return true; 
		
	}
	
	
	public boolean deleteTeacher(int id) {
	    Teacher existing = searchTeacherById(id);
	    if (existing == null) {
	        return false; // Not found
	    }
	    teachers.remove(existing);
	    return true; // Successfully removed
	}

	
	
}
