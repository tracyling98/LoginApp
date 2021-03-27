package com.byteforce_crew.educard.enums;

public enum Grade {
    D("Distinction"),   /* -- [85% - 100%] -- */
    G("Good"),          /* -- [70% -  84%] -- */
    P("Pass"),          /* -- [50% -  69%] -- */
    F("Fail");          /* -- [ 0% -  49%] -- */

    /* -- Grade Parameter(s) -- */
    private String name;

    /* Enum Constructor */
    Grade(String name){
        this.name = name;
    }

    /* -- Getter -- */
    public String getName(){
        return name;
    }
}
