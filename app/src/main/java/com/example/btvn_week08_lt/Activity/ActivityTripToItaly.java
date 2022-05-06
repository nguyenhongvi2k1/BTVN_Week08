package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.btvn_week08_lt.R;

public class ActivityTripToItaly extends AppCompatActivity {
    private View btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_to_italy);

        btn_Back = findViewById(R.id.btn_Back3);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}