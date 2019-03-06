package com.example.daggermoxytest.ui;

import android.content.Context;
import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;

abstract class BaseActivity extends MvpAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = this;//!!! не нужно переопределять MvpAppCompatActivity для получения активити
    }
}
