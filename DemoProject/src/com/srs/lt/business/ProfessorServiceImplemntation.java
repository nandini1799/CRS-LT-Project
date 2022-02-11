package com.srs.lt.business;

import com.srs.lt.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProfessorServiceImplemntation implements ProfessorInterface {
	/*This is professor service implementation
	 *
	 * */
	@Override
	public String addGrade(int studentId) {
		
		
		List<Grade> grades = new ArrayList<Grade>();
		//grades.set(0, )
		
	}
	
	public String viewGrade(int studentId, int courseCode, String grade) {
		
		List<Grade> grades = new ArrayList<Grade>();
		grades.add(101, 01, " ");
		grades.add(103, 01, " ");
		grades.add(104, 01, " ");
		
		Iterator i = grades.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

	@Override
	public String getCourses() {
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(01, "Mechanics");
		courses.add(02, "Networking");
		courses.add(03, "Cloud computing");
		courses.add(04, "Java");
		courses.add(05, "Python");
		courses.add(06, "Mechanics");
		
		Iterator i = courses.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
	}

//	@Override
//	public String getProfessorById(String profId) {
//		return null;
//	}

	@Override
	public String viewEnrolledStudents() {
		
		List<Student> studentEnroll = new ArrayList<Student>();
		studentEnroll.add(101, "CSE");
		studentEnroll.add(102, "EE");
		studentEnroll.add(103, "ME");
		studentEnroll.add(104, "CE");
		
		Iterator i = studentEnroll.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
	}



}
