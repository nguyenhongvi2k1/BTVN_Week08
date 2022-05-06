package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class Activity_forgotpassword2 extends AppCompatActivity {
    private View btnComplete;
    private View btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpasswd2);
        btnComplete = (View) findViewById(R.id.btn_changepass);
        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_forgotpassword2.this, Activity_forgotpassword3.class);
                startActivity(intent);
            }
        });

    }

}
