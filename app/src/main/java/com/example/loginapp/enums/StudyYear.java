package com.example.loginapp.enums;

public enum StudyYear {
    Year1("Year 1"),
    Year2("Year 2"),
    Year3("Year 3");

    private final String yearName;

    StudyYear(String yearName){
        this.yearName = yearName;
    }

    public String getYearName(){
        return yearName;
    }
}
