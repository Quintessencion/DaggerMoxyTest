package com.example.daggermoxytest;

import android.content.Context;

public class FakeDatabase {

    private String someData;

    public FakeDatabase(Context context) {
        someData = "Dependency injection in Moxy constructor is working";
    }

    public String getSomeData() {
        return someData;
    }
}
