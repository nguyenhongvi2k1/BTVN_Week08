package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btvn_week08_lt.R;

public class ActivityPaymentSuccessfull extends AppCompatActivity {

    private Button btn_bookingdetails, btn_explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successfull);

        btn_bookingdetails = findViewById(R.id.btn_bookingdetails);
        btn_bookingdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPaymentSuccessfull.this, ActivityPaymentDetail.class);
                startActivity(intent);
            }
        });

    }
}