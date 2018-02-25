package com.example.micha.daggarandmvpdemo;

import android.app.Application;

import com.example.micha.daggarandmvpdemo.DI.ApplicationModule;
import com.example.micha.daggarandmvpdemo.DI.DaggerLunchComponent;
import com.example.micha.daggarandmvpdemo.DI.LunchActivityModule;
import com.example.micha.daggarandmvpdemo.DI.LunchComponent;

/**
 * Created by micha on 2/23/2018.
 */

//Application is extended to initialize the Dagger component and make it accessible by the entire App.
public class LunchApp extends Application {


LunchComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerLunchComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .lunchActivityModule(new LunchActivityModule())
                .build();
    }

    public LunchComponent getComponent() {
        return component;
    }
}
