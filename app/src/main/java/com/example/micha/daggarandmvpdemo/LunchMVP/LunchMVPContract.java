package com.example.micha.daggarandmvpdemo.LunchMVP;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public interface LunchMVPContract {

    interface View {
        String getDishName();

        String getDayOfWeek();

        void messageSaveSuccessful();

        void messageEnterFieldInfo();

        void setDishName(String dishName);

        void setDayOfWeek(String dayOfWeek);
    }

    interface Presenter {
        void setView(LunchMVPContract.View view);

        void onSetLunchButtonClick();

        void getLastLunch();


    }

    interface Model {

        Lunch getLunchItem();

        void saveLunchItem(String lunchItem, String dayOfWeek);

    }
}
