package com.example.daggermoxytest.di.component;

import com.example.daggermoxytest.ui.MainActivity;
import com.example.daggermoxytest.di.module.Module;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = Module.class)
public interface Component {
    void inject(MainActivity activity);
}
