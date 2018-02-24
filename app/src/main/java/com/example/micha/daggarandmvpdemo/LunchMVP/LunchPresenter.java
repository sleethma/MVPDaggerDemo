package com.example.micha.daggarandmvpdemo.LunchMVP;

import android.support.annotation.Nullable;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchPresenter implements LunchMVPContract.Presenter {

    @Nullable
    LunchMVPContract.View view;
    LunchMVPContract.Model model;

    public LunchPresenter(LunchMVPContract.Model model) {
        this.model = model;
    }


    @Override
    public void setView(LunchMVPContract.View view) {
        this.view = view;
    }
}
