package com.byteforce_crew.educard.entities;

import androidx.annotation.NonNull;

import com.byteforce_crew.educard.enums.Grade;

public class Module_History {
    /* -- History Properties -- */
    private String module_history_code;
    private String module_code;
    private Grade overall_grade; // Enum grade
    private String enroll_date;
    private String completion_date;
    private String unenroll_date; // 00-00-00 For those NA ones?

    // -- Default Constructor --
    public Module_History(String module_history_code, String module_code, Grade overall_grade,
                          String enroll_date, String completion_date, String unenroll_date){
        this.module_history_code = module_history_code;
        this.module_code = module_code;
        this.overall_grade = overall_grade;
        this.enroll_date = enroll_date;
        this.completion_date = completion_date;
        this.unenroll_date = unenroll_date;
    }

    // -- Overloading Constructor(s) --
    public Module_History(Module_History module_history){
        this(module_history.module_history_code, module_history.module_code, module_history.overall_grade,
                module_history.enroll_date, module_history.completion_date, module_history.unenroll_date);
    }


    // -- Getters --
    public String getModule_history_code(){
        return module_history_code;
    }

    public String getModule_code(){
        return module_code;
    }

    public Grade getOverall_grade(){
        return overall_grade;
    }

    public String getEnroll_date(){
        return enroll_date;
    }

    public String getCompletion_date(){
        return completion_date;
    }

    public String getUnenroll_date(){
        return unenroll_date;
    }

    // -- Setters --
    public void setModule_history_code(String module_history_code){
        this.module_history_code = module_history_code;
    }

    public void setModule_code(String module_code){
        this.module_code = module_code;
    }

    public void setOverall_grade(Grade overall_grade){
        this.overall_grade = overall_grade;
    }

    public void setEnroll_date(String enroll_date){
        this.enroll_date = enroll_date;
    }

    public void setCompletion_date(String completion_date){
        this.completion_date = completion_date;
    }

    public void setUnenroll_date(String unenroll_date){
        this.unenroll_date = unenroll_date;
    }

    // -- ToString Method --
    @NonNull
    public String toString(){
        return String.format(
                "Module History Code: %s\nModule Code: %s\nOverall Grade: %s\n" +
                        "Enroll Date: %s\nCompletion Date: %s\nUnenroll Date: %s\n",
                module_history_code, module_code, overall_grade, enroll_date, completion_date, unenroll_date);
    }
}
