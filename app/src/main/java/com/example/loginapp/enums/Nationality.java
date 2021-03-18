package com.example.loginapp.enums;

public enum Nationality {
    SG("Singapore"),
    MY("Malaysia"),
    AU("Australia"),
    US("United States of America"),
    KR("Korea"),
    CN("China"),
    HK("Hong Kong"),
    TW("Taiwan"),
    TH("Thailand"),
    UK("United Kingdom"),
    IN("India"),
    ID("Indonesia"),
    MM("Myanmar"),
    NZ("New Zealand"),
    PH("Philippines"),
    RU("Russia");

    private final String nationality;

    Nationality(String nationality){
        this.nationality = nationality;
    }

    public String getNationality(){
        return nationality;
    }

}
