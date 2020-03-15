package com.example.lab1;

import android.util.Log;

public class Formula1 extends Car {
    private String formula = "Formula 1";
    @Override
    public void giveInfo() {
        Log.d("yes", "Car" + getName() + ".Horsepowers:"+ getHorsePowers() +" "+ formula );
    }
}
