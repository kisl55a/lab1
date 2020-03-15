package com.example.lab1;

import android.util.Log;

public class Car {
    private String name;
    private int horsePowers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
    public void giveInfo() {
        Log.d("yes", "Car " + getName() + ".Horsepowers:"+ getHorsePowers() );
    }
}
