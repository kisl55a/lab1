package com.example.lab1;

import android.util.Log;

public class Teacher extends Man {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void giveInfo() {
        Log.d("yes", "Man" + getName() + "" + getSubject() + "teacher" );
    }
}
