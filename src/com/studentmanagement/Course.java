package com.studentmanagement;




public class Course {
	
	private int courseId;
	private String courseName;
	private int duration;
	
	
	public Course(int courseId, String courseName, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + "]";
	}


	@Override
	public int hashCode() {
		return Integer.hashCode(courseId);
	}


	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Course)) return false;
	    Course c = (Course) o;
	    return courseId == c.courseId;
	}


	


	


	
	
	
	
	
}
