package com.example.micha.daggarandmvpdemo.LunchMVP;

import android.support.annotation.Nullable;

import com.example.micha.daggarandmvpdemo.Lunch;

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

    @Override
    public void onSetLunchButtonClick() {
        if (view != null) {
            if (view.getDayOfWeek().trim().isEmpty() || view.getDishName().trim().isEmpty()) {
                view.messageEnterFieldInfo();
            } else {
                view.messageSaveSuccessful();
                model.saveLunchItem(view.getDishName(), view.getDayOfWeek());
            }
        }
    }

    @Override
    public void getLastLunch() {
        Lunch lunch = model.getLunchItem();
        if (view != null && lunch != null) {
            view.setDayOfWeek(lunch.getDayOfWeek());
            view.setDishName(lunch.getLunchName());
        }
    }

}
