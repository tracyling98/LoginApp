package com.example.loginapp.enums;

public enum Study_Year {
    Year1("Year 1"),
    Year2("Year 2"),
    Year3("Year 3");

    private final String yearName;

    Study_Year(String yearName){
        this.yearName = yearName;
    }

    public String getYearName(){
        return yearName;
    }
}
