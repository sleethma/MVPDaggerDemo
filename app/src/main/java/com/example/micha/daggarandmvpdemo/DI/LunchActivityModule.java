package com.example.micha.daggarandmvpdemo.DI;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchMVPContract;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchModel;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchPresenter;
import com.example.micha.daggarandmvpdemo.LunchRepo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micha on 2/23/2018.
 */

@Module
public class LunchActivityModule {

    @Provides
    public LunchMVPContract.Presenter providesPresenter(LunchMVPContract.Model model){
        return new LunchPresenter(model);
    }

    @Provides
    public LunchMVPContract.Model providesModel(LunchRepo repo){
        return new LunchModel(repo);
    }

    @Provides
    public LunchRepo providesRepository(){
        return new LunchMemory();

    }

}
