package com.srs.lt.bean;

public class Professor extends User {
	private String department;
	private int professorId;
	private String designation;
	private String courseAssigned;
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCourseAssigned() {
		return courseAssigned;
	}
	public void setDesignation(String courseAssigned) {
		this.courseAssigned = courseAssigned;
	}
	

}
