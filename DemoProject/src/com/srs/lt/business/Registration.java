package com.srs.lt.business;

import com.srs.lt.bean.Course;
import com.srs.lt.bean.Notification;

import java.util.List;

public interface Registration {
    boolean addCourse(String courseCode, int studentId);
    double calculateFee(int studentId);
    boolean checkCourse(String courseCode, int studentId, List<Course> availableCourseList);
    boolean dropCourse(String courseCode, int studentId, List<Course> registeredCourseList);
    boolean getRegistrationStatus(int studentId);
    void setRegistrationStatus(int studentId);
    List<Course> viewCourses(int studentId);
    List<String> viewGradeCard(int studentId);
    List<Course> viewRegisteredCourses(int studentId);
    Notification payFee (int studentId, String mode, double amount);
}
