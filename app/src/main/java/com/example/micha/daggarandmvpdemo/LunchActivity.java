package com.example.micha.daggarandmvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.micha.daggarandmvpdemo.DI.LunchApp;
import com.example.micha.daggarandmvpdemo.LunchMVP.LunchMVPContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LunchActivity extends AppCompatActivity implements LunchMVPContract.View {

    @Inject
    LunchMVPContract.Presenter presenter;

    @BindView(R.id.b_order)
    Button orderButton;
    @BindView(R.id.tv_label_id)
    TextView tv_Id;
    @BindView(R.id.et_dish_name)
    EditText et_dish;
    @BindView(R.id.et_day_of_week)
    EditText et_day;

    String dishName, id, dayOfWeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        ButterKnife.bind(this);

        ((LunchApp) getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String getId() {
        return id;
    }
}
