package com.example.micha.daggarandmvpdemo;

/**
 * Created by micha on 2/23/2018.
 */

/*can be used to access multiple data sources of your persistence layer from Model.
only one layer represented here*/

public interface LunchRepo {

    Lunch getLunch();

    void saveLunch(String lunchItem, String dayOfWeek);

    boolean isSaved();
}
