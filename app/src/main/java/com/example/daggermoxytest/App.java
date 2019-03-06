package com.example.daggermoxytest;

import android.app.Application;

import com.example.daggermoxytest.di.component.Component;
import com.example.daggermoxytest.di.component.DaggerComponent;
import com.example.daggermoxytest.di.module.Module;

public class App extends Application {

    public static Component component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerComponent.builder().module(new Module(this)).build();
    }
}
