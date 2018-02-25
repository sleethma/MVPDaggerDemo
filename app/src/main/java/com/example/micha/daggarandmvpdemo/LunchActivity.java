package com.example.micha.daggarandmvpdemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        ButterKnife.bind(this);

        ((LunchApp) getApplication()).getComponent().inject(this);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onSetLunchButtonClick();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getLastLunch();
    }

    @Override
    public String getDishName() {
        return et_dish.getText().toString().trim();
    }

    @Override
    public String getDayOfWeek() {
        return et_day.getText().toString().trim();
    }

    @Override
    public void setDishName(String dishName) {
        et_dish.setText(dishName);
    }

    @Override
    public void setDayOfWeek(String dayOfWeek) {
        et_day.setText(dayOfWeek);
    }

    @Override
    public void messageSaveSuccessful() {
        Snackbar.make(orderButton, "Lunch Order Saved!...Enjoy!", Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void messageEnterFieldInfo() {
        Snackbar.make(orderButton, "Enter day of week and field information", Snackbar.LENGTH_LONG).show();
    }

}
