package com.example.micha.daggarandmvpdemo;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

//This class is in charge of whatever persistence model you choose (SqLite, Realm, Server Db...etc)
    //This only lives as long as the activity
public class LunchMemory implements LunchRepo{

private Lunch lunch;
private String lunchItem, dayOfWeek;
private boolean savedStatus = false;
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
        savedStatus = true;
    }

    @Override
    public boolean isSaved() {
        return savedStatus;
    }
}
