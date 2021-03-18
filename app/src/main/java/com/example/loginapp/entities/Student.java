package com.example.loginapp.entities;

import com.example.loginapp.enums.Course;
import com.example.loginapp.enums.StudyYear;

public class Student extends User{

    private Course course;
    private StudyYear studyYear;
    private double attendance_rates;

    // Default Constructor
    public Student(){}

    // Constructor Overloading


    // Getter and Setter
    public Course getCourse(){
        return course;
    }

    public StudyYear getStudyYear(){
        return studyYear;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public void setStudyYear(StudyYear studyYear){
        this.studyYear = studyYear;
    }



}
