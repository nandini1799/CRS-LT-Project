package com.srs.lt.business;

import com.srs.lt.bean.Catalog;
import com.srs.lt.bean.Course;

import java.util.List;

public class CatalogServiceImplementation implements CatalogInterface {

    // TODO: Remove this method once dao is implemented
    //  and use the find method from dao class in the other methods
    public Catalog getCatalog(){
        Catalog c1 = new Catalog();
        return c1;

    }
    @Override
    public void addCourse(int courseCode, Boolean isOffered, String name, String instructor){
        // Get the catalog using the dto class then add the course to the catalog
        // For dummy implementation we are using the new catalog
        Catalog c1 = getCatalog();
        List<Course> existingCourses = c1.getCourses();
        Course newCourse = new Course();
        newCourse.setCourseCode(courseCode);
        newCourse.setInstructor(instructor);
        newCourse.setName(name);
        newCourse.setOffered(isOffered);
        existingCourses.add(newCourse);
    };
    @Override
    public List<Course> viewCourse(int catalogId){
        // Get the courses for the given catalogId and return all the courses
        Catalog c1 =  getCatalog();
        List<Course> existingCourses = c1.getCourses();
        return existingCourses;

    };
    @Override
    public void viewCourseDetails(int courseCode){
        Catalog c1 =  getCatalog();
        List<Course> existingCourses = c1.getCourses();
        // TODO: Change this to optional when using the dao class and refactor
        Course requiredCourse = null;
        for (Course course: existingCourses){
            if (courseCode == course.getCourseCode()){
                requiredCourse = course;
            }
        }
        if (requiredCourse != null){
            System.out.println(String.format("For courseCode %d Course Name: %d, Instructor: %s isOffered: %s",
                    courseCode
                    ));
        } else {
            System.out.println(String.format("Course with courseCode %d doesn't exist in the current catalog",
                    courseCode));
        }
    };

}
