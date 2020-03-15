package com.example.lab1;

import android.util.Log;

public class Journal implements Readable {

    public static void main(String[] args) {

        Journal journal = new Journal();
        journal.read();
    }


    public void read() {
        Log.d("Dmitrii", "Read a journal");
    }
}

interface Readable{
    public void read();
}