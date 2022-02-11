package com.srs.lt.business;

import com.srs.lt.bean.Course;
import com.srs.lt.bean.Notification;

import java.util.List;

public class RegistrationServiceImplementation implements Registration {
    @Override
    public boolean addCourse(String courseCode, int studentId) {
        return false;
    }

    @Override
    public double calculateFee(int studentId) {
        return 0;
    }

    @Override
    public boolean checkCourse(String courseCode, int studentId, List<Course> availableCourseList) {
        return false;
    }

    @Override
    public boolean dropCourse(String courseCode, int studentId, List<Course> registeredCourseList) {
        return false;
    }

    @Override
    public boolean getRegistrationStatus(int studentId) {
        return false;
    }

    @Override
    public void setRegistrationStatus(int studentId) {

    }

    @Override
    public List<Course> viewCourses(int studentId) {
        return null;
    }

    @Override
    public List<String> viewGradeCard(int studentId) {
        return null;
    }

    @Override
    public List<Course> viewRegisteredCourses(int studentId) {
        return null;
    }

    @Override
    public Notification payFee(int studentId, String mode, double amount) {
        return null;
    }
}
