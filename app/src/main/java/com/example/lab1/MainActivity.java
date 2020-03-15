package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Car reno = new Car();
        reno.setName("Reno");
        reno.setHorsePowers(76);
        reno.giveInfo();

        Formula1 formula1 = new Formula1();
        formula1.setName("Lexus");
        formula1.setHorsePowers(500);
        formula1.giveInfo();

        Teacher a = new Teacher();
        a.setName("Dora");
        a.setSubject("Math");
        a.giveInfo();

        Driver b = new Driver();
        b.setName("Dmitrii");
        b.setCar("Reno");
        b.giveInfo();
    }
}
