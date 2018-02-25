package com.example.micha.daggarandmvpdemo.DI;

import com.example.micha.daggarandmvpdemo.LunchMVP.LunchMVPContract;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchModel;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchPresenter;
import com.example.micha.daggarandmvpdemo.LunchMemory;
import com.example.micha.daggarandmvpdemo.LunchRepo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by micha on 2/23/2018.
 */
//provides Dagger with the 'what' will be included in injection
@Module
public class LunchActivityModule {

    //provides presenter object with model instance which is the implementation of the Presenter interface
    @Provides
    public LunchMVPContract.Presenter providesLunchActivityPresenter(LunchMVPContract.Model model){
        return new LunchPresenter(model);
    }

    //provides and constructs the Model instance when it is requested
    @Provides
    public LunchMVPContract.Model providesLunchActivityModel(LunchRepo repo){
        return new LunchModel(repo);
    }
//    provides memory instance for when @LunchModel requests it in it's constructor
    @Provides
    public LunchRepo providesRepository(){
        return new LunchMemory();

    }

}
