package com.example.micha.daggarandmvpdemo.DI;

import android.app.Application;

/**
 * Created by micha on 2/23/2018.
 */

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
