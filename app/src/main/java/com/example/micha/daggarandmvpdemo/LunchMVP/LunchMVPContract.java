package com.example.micha.daggarandmvpdemo.LunchMVP;

import com.example.micha.daggarandmvpdemo.Lunch;
import com.example.micha.daggarandmvpdemo.LunchRepo;

/**
 * Created by micha on 2/23/2018.
 */

public interface LunchMVPContract {

    interface View{
        public String getDishName();
        public String getDayOfWeek();
        public String getId();
    }

    interface Presenter{
       public void setView(LunchMVPContract.View view);
    }

    interface Model{

        Lunch getLunchItem();
    }
}
