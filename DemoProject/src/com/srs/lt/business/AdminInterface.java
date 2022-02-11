/**
 * 
 */
package com.srs.lt.business;

import com.srs.lt.bean.Course;
import com.srs.lt.bean.Student;
import com.srs.lt.bean.Professor;
import java.util.List;

/**
 * @author user208
 *
 */
public interface AdminInterface {

    void addCourse(Course course, List<Course> courseList);
    void 	addProfessor(Professor professor)
    void approveStudent(int studentId, List<Student> studentList);
    void assignCourse(String courseCode, String professorId);
    void deleteCourse(String courseCode, List<Course> courseList);
    void viewCourses(int catalogId);
    List<Student> viewPendingAdmissions();
    List<Professor> viewProfessors();
}
