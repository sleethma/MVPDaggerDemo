package com.example.micha.daggarandmvpdemo;

/**
 * Created by micha on 2/23/2018.
 */

public interface LunchRepo {

    Lunch getLunch();

    void saveLunch(String lunchItem, String dayOfWeek);
}
