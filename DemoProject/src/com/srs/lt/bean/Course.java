package com.srs.lt.bean;

public class Course {
    int courseCode;
    String name ;
    Boolean isOffered;
    int professorId;
    int marks;

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOffered() {
        return isOffered;
    }

    public void setOffered(Boolean offered) {
        isOffered = offered;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
