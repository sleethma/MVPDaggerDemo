package com.example.micha.daggarandmvpdemo;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchMemory implements LunchRepo{

private Lunch lunch;
private String lunchItem, dayOfWeek;
    @Override
    public Lunch getLunch() {
        if(lunch == null){
            lunch = new Lunch("Caesar Salad","Monday");
        }
        return lunch;
    }

    @Override
    public void saveLunch(String lunchItem, String dayOfWeek) {
        this.lunchItem = lunchItem;
        this.dayOfWeek = dayOfWeek;
    }
}
