package com.srs.lt.business;

import com.srs.lt.bean.Course;

import java.util.List;

public interface CatalogInterface {
    public void addCourse(int courseCode, Boolean isOffered, String name, String instructor);
    public List<Course> viewCourse(int catalogId);
    public void viewCourseDetails(int courseId);

}
