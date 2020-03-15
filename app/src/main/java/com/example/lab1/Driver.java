package com.example.lab1;

import android.util.Log;

public class Driver extends Man {
 private  String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
        public void giveInfo() {
            Log.d("yes", "Man" + getName() + "" + getCar() + "drive" );
        }
}
