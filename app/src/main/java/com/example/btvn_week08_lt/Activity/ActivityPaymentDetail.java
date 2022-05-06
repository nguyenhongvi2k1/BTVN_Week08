package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btvn_week08_lt.Fragment.HomeFragment;
import com.example.btvn_week08_lt.R;

public class ActivityPaymentDetail extends AppCompatActivity {

    private Button btn_explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_detail);

        btn_explore = findViewById(R.id.btn_gotoExplore);
        btn_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPaymentDetail.this, HomeFragment.class);
                startActivity(intent);
            }
        });

    }
}