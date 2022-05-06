package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.btvn_week08_lt.ApiInterface.ApiService;
import com.example.btvn_week08_lt.Fragment.UserFragment;
import com.example.btvn_week08_lt.Model.MyProfile;
import com.example.btvn_week08_lt.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyProfileActivity extends AppCompatActivity {

    View btnBack, btnChangePasss;
    TextView txtFullName, txtEmail, txtPhoneNumber;

    private RecyclerView  recyclerProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        
        txtFullName = findViewById(R.id.tv2);
        txtEmail = findViewById(R.id.tv4);
        txtPhoneNumber = findViewById(R.id.tv11);

        btnBack = (View) findViewById(R.id.btn_BackFragmentAccount);
        btnChangePasss = (View) findViewById(R.id.btn_changePassword);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        btnChangePasss.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MyProfileActivity.this, ChangePasswordActivity.class);
//                startActivity(intent);
//            }
//        });


//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://nhm204.fun")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        ApiService apiService = retrofit.create(ApiService.class);
//
//        Call<MyProfile> call = apiService.getMyProfile();;
//        call.enqueue(new Callback<MyProfile>() {
//            @Override
//            public void onResponse(Call<MyProfile> call, Response<MyProfile> response) {
//                if (!response.isSuccessful()) {
//                    txtEmail.setText("Code: " + response.code());
//                    return;
//                }
//
//                txtFullName.append(response.body().getFullname());
//                txtEmail.append(response.body().getEmail());
//
//            }
//            @Override
//            public void onFailure(Call<MyProfile> call, Throwable t) {
//                txtEmail.setText(t.getMessage());
//
//            }
//        });


    }
}