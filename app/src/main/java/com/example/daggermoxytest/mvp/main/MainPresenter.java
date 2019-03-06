package com.example.daggermoxytest.mvp.main;

import com.arellomobile.mvp.InjectViewState;
import com.example.daggermoxytest.FakeDatabase;

import javax.inject.Inject;

@InjectViewState
public class MainPresenter extends BasePresenter<MainView> {

    private FakeDatabase database;

    @Inject
    public MainPresenter(FakeDatabase database) {
        this.database = database;
    }

    @Override
    public void attachView(MainView view) {
        super.attachView(view);
        getViewState().showToast(database.getSomeData());
    }
}
