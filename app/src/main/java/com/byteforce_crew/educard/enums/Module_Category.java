package com.byteforce_crew.educard.enums;

/* -- General Module Categories (General University/Polytechnic) -- */
public enum Module_Category {
    Accounting("Accounting & Finance"),
    Art("Creative Arts & Design"),
    Architecture("Architecture, Building & Construction"),
    Law("Law & Criminology"),
    Business("Business & Management"),
    CompSci("Information Technology & Computer Scicence"),
    HSci("Health Science"),
    Psycho("Psychology"),
    Sports("Sports Science"),
    Teaching("Education & Teaching"),
    Others("Others");

    // -- Parameter Variable(s) --
    private final String name;

    // -- Enum Constructor --
    Module_Category(String name){
        this.name = name;
    }

    // -- Getter --
    public String getName(){
        return name;
    }

}
