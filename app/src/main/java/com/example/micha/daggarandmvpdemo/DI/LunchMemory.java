package com.example.micha.daggarandmvpdemo.DI;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchMemory implements LunchRepo{

private Lunch lunchItem;
    @Override
    public Lunch getLunch() {
        if(lunchItem == null){
            lunchItem = new Lunch("Caesar Salad","Monday", "Treat");
        }
        return lunchItem;
    }
}
