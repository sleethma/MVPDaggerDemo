package com.example.micha.daggarandmvpdemo.DI;

import com.example.micha.daggarandmvpdemo.LunchActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by micha on 2/23/2018.
 */
//sets up 'bridge' between modules provided and instructs Dagger where and what to inject
@Singleton
@Component(modules = {ApplicationModule.class, LunchActivityModule.class})
public interface LunchComponent {

    void inject(LunchActivity target);
}
