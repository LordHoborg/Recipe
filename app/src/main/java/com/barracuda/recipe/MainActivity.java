package com.barracuda.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View foodsListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodsListButton = findViewById(R.id.foods_list);
        foodsListButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == foodsListButton)
            startActivity(new Intent(this, MainFragment.class));

    }
}