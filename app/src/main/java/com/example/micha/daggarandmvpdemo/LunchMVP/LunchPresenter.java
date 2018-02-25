package com.example.micha.daggarandmvpdemo.LunchMVP;

import android.support.annotation.Nullable;
import com.example.micha.daggarandmvpdemo.Lunch;

/**
 * Created by micha on 2/23/2018.
 */

public class LunchPresenter implements LunchMVPContract.Presenter {

   /* @Nullable is a lint reminder to always check to make sure the OS didn't
     terminate the view instance before calling it here.*/
    @Nullable
    LunchMVPContract.View view;
    LunchMVPContract.Model model;

    //model is passed to the presenter by 'constructor injection' defined in @LunchActivityModule
    public LunchPresenter(LunchMVPContract.Model model) {
        this.model = model;
    }


    //enables presenter to manipulate the view by injecting presenter instance into model
    @Override
    public void setView(LunchMVPContract.View view) {
        this.view = view;
    }


    //a great overview of MVP greatness where the presenter is the point of contact b/n Model and View
    @Override
    public void onSetLunchButtonClick() {
        if (view != null) {
            if (view.getDayOfWeek().trim().isEmpty() || view.getDishName().trim().isEmpty()) {
                view.messageEnterFieldInfo();
            } else {
                model.saveLunchItem(view.getDishName(), view.getDayOfWeek());
                if(model.isSaved()){
                    view.messageSaveSuccessful();
                }
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
