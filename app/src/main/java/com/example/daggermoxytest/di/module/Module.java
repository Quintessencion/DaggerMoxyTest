package com.example.daggermoxytest.di.module;

import android.content.Context;

import com.example.daggermoxytest.FakeDatabase;

import javax.inject.Singleton;

import dagger.Provides;

@dagger.Module
public class Module {

    private Context context;

    public Module(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    FakeDatabase provideDatabase(Context context) {
        return new FakeDatabase(context);
    }
}
