package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class Activity_forgotpassword3 extends AppCompatActivity {
    private Button btnLoginAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpasswd3);

        btnLoginAgain = (Button) findViewById(R.id.btn_donepass);
        btnLoginAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_forgotpassword3.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
