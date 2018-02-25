package com.example.micha.daggarandmvpdemo.LunchMVP;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchModel implements LunchMVPContract.Model {

    LunchRepo repo;

    //initialized by Dagger on application build, setting the repo interface to the Model
    public LunchModel(LunchRepo repo) {
        this.repo = repo;
    }

    //passes the desired lunch item requested from our persisted object in Memory to @return:presenter
    public Lunch getLunchItem() {
        return repo.getLunch();
    }

    @Override
    public void saveLunchItem(String lunchItem, String dayOfWeek) {
        repo.saveLunch(lunchItem, dayOfWeek);
    }
    /*used to communicate with presenter from @LunchRepo interface to
     @LunchMVPContract to presenter implementation*/
    @Override
    public boolean isSaved() {
        return repo.isSaved();
    }


}
