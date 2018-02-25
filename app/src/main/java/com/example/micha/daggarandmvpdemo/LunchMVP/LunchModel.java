package com.example.micha.daggarandmvpdemo.LunchMVP;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchModel implements LunchMVPContract.Model {

    LunchRepo repo;

    public LunchModel(LunchRepo repo) {
        this.repo = repo;
    }

    @Override
    public Lunch getLunchItem() {
        return repo.getLunch();
    }

    @Override
    public void saveLunchItem(String lunchItem, String dayOfWeek) {
        repo.saveLunch(lunchItem, dayOfWeek);
    }
}
