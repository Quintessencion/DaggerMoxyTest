package com.example.daggermoxytest.ui;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.daggermoxytest.App;
import com.example.daggermoxytest.R;
import com.example.daggermoxytest.mvp.main.MainPresenter;
import com.example.daggermoxytest.mvp.main.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    @InjectPresenter
    MainPresenter presenter;

    @ProvidePresenter
    MainPresenter providePresenter() {
        return presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.component.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showToast(String value) {
        Toast toast = Toast.makeText(this, value, Toast.LENGTH_LONG);
        TextView v = toast.getView().findViewById(android.R.id.message);
        if (v != null) {
            v.setGravity(Gravity.CENTER);
        }
        toast.show();
    }
}
