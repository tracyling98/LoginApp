package com.example.loginapp.entities;

import com.example.loginapp.enums.Nationality;
import com.example.loginapp.enums.UserType;
import com.example.loginapp.enums.Gender;

public class User {

    // User Properties
    protected String username;
    protected UserType userType;
    protected Gender userGender;
    protected Nationality nationality;

    // Default Constructor
    public User() {}

    // Other Constructors (Overloading)
    public User(String username, UserType userType, Gender userGender){
        this.username = username;
        this.userType = userType;
        this.userGender = userGender;
    }

    // Getters and Setters
    public String getUsername(){
        return this.username;
    }

    public UserType getUserType(){
        return this.userType;
    }

    public Gender getUserGender(){
        return this.userGender;
    }

    public Nationality getNationality(){
        return this.nationality;
    }

    public void setUsername(String username){
        // Include some validation before storing the values
        this.username = username;
    }

    public void setUserType(UserType userType){
        this.userType = userType;
    }

    public void setUserGender(Gender userGender){
        this.userGender = userGender;
    }
    public void setNationality(Nationality nationality){
        this.nationality = nationality;
    }
}
