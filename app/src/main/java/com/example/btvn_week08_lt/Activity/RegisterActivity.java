package com.example.btvn_week08_lt.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.Api.ApiClient;
import com.example.btvn_week08_lt.Login.RegisterRequest;
import com.example.btvn_week08_lt.Login.RegisterResponse;
import com.example.btvn_week08_lt.R;

import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    RegisterResponse registerResponsesData;
    private Button btnSignup;
    private TextView txt_signin;
    EditText edUserName, edEmail, edPhone, edPassword, edCPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnSignup = (Button)findViewById(R.id.btn_signin);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        txt_signin = (TextView)findViewById(R.id.tv_signin);
        txt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
