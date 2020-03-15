package com.example.lab1;

import android.util.Log;

public class Book implements Readable {

    public static void main(String[] args) {

        Book book = new Book();
        book.read();
    }

    public void read(){
        Log.d("Dmitrii", "Read a book");
    }
}
