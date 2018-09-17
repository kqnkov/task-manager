package com.example.android.todolist;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class MyApplicationClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
