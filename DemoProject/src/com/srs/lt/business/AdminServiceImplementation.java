package com.srs.lt.business;

import com.srs.lt.bean.Course;
import com.srs.lt.bean.Student;

import java.util.List;

public class AdminServiceImplementation implements AdminInterface {
	/*This is Admin service implementation
	 *
	 * */
	@Override
	public void addCourse (Course course, List<Course> courseList) {

	}

	@Override
	public void addProfessor (Professor professor) {

	}

	@Override
	public void approveStudent(int studentId, List<Student> studentList) {
 
	}

	@Override
	public void assignCourse(String courseCode, String professorId) {

	}

	@Override
	public void deleteCourse(String courseCode, List<Course> courseList) {

	}

	@Override
	public void viewCourses(int catalogId) {

	}

	@Override
	public List<Student> viewPendingAdmissions() {
		return null;
	}

	@Override
	public List<Professor> viewProfessors() {
		return null;
	}




}
