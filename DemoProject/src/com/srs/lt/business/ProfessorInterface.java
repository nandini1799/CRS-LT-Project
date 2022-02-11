/**
 * 
 */
package com.srs.lt.business;
import com.srs.lt.bean.Student;

import java.util.List;

/**
 * @author user208
 *
 */
public interface ProfessorInterface {
	public String viewEnrolledStudents();
	public String getCourses();
	public String viewGrade(int studentId, int courseCode, String grade);
	public String addGrade(int studentId);
	

}
