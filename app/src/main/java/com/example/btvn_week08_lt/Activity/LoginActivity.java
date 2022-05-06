package com.example.btvn_week08_lt.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.Api.ApiClient;
import com.example.btvn_week08_lt.Login.LoginRequest;
import com.example.btvn_week08_lt.Login.LoginResponse;
import com.example.btvn_week08_lt.MainActivity;
import com.example.btvn_week08_lt.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity{
    private TextView tv_signup;
    private TextView tv_forgot;
    private Button btN_Login;
    private EditText Username,Password;
    private CheckBox checkRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.etPassword);
        tv_forgot = (TextView) findViewById(R.id.tv_forgot);
        tv_signup = (TextView) findViewById(R.id.tv_signup);
        btN_Login = (Button)findViewById(R.id.btn_signin);
        checkRemember = (CheckBox) findViewById(R.id.RememberMe);

        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
        tv_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Activity_forgotpassword.class);
                startActivity(intent);

            }
        });
        btN_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, activity_home.class);
                startActivity(intent);

            }
        });
   }

}


