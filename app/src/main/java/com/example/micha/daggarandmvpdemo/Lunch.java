package com.example.micha.daggarandmvpdemo;

import com.example.micha.daggarandmvpdemo.LunchMVP.LunchMVPContract;

/**
 * Created by micha on 2/23/2018.
 */

public class Lunch {

    String lunchName, dayOfWeek;

    public Lunch(String lunchName, String dayOfWeek) {
        this.lunchName = lunchName;
        this.dayOfWeek = dayOfWeek;
    }

    public String getLunchName() {
        return lunchName;
    }

    public String getDayOfWeek(){
        return dayOfWeek;
    }
}
