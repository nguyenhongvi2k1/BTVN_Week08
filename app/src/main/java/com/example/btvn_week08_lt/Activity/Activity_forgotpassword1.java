package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class Activity_forgotpassword1 extends AppCompatActivity {
    Button btn_Password ;
    View btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpasswd1);
        btn_Password = (Button) findViewById(R.id.btn_continue_forgot);
        btn_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_forgotpassword1.this, Activity_forgotpassword2.class);
                startActivity(intent);
            }
        });


    }
}
