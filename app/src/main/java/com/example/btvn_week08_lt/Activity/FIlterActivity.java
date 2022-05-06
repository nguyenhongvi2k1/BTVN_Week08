package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btvn_week08_lt.R;

public class FIlterActivity extends AppCompatActivity {

    private View btnCLose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        btnCLose = findViewById(R.id.close_filter);
        btnCLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}