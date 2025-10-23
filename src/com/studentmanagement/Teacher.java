package com.studentmanagement;

import java.util.Objects;

public class Teacher {
	
	
	private int teacherId;
	private String teacherName;
	private String subject;
	private int experience;
	
	
	public Teacher(int teacherId, String teacherName, String subject, int experience) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
		this.experience = experience;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject
				+ ", experience=" + experience + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(teacherId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return teacherId == other.teacherId;
	}
	
	
	
	
}
