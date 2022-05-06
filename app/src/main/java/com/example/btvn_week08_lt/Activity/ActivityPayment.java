package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btvn_week08_lt.R;

public class ActivityPayment extends AppCompatActivity {

    private Button btn_continue;
    private View btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btn_continue = findViewById(R.id.btn_Continuebooking);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPayment.this, ActivityPaymentSuccessfull.class);
                startActivity(intent);
            }
        });

        btnBack = findViewById(R.id.btn_BackHotel);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPayment.this, HotelActivity.class);
                startActivity(intent);
            }
        });

    }
}