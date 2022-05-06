package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.Model.User;
import com.example.btvn_week08_lt.R;

import java.util.List;
import java.util.Random;

public class Activity_forgotpassword extends AppCompatActivity {

    private Button btnSend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpasswd);
        btnSend = (Button) findViewById(R.id.btn_continue_forgot);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_forgotpassword.this, Activity_forgotpassword1.class);
                startActivity(intent);
            }
        });
    }
}
