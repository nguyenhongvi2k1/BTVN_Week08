package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.MainActivity;
import com.example.btvn_week08_lt.R;

public class HotelActivity extends AppCompatActivity {
    private Button btnre_room;
    private View btn_Back;
    private TextView btn_showmore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        btnre_room = (Button) findViewById(R.id.btn_reserver_room);
        btnre_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this, ActivityPayment.class);
                startActivity(intent);
            }
        });

        btn_Back = findViewById(R.id.btn_back);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this, activity_home.class);
                startActivity(intent);
            }
        });

        btn_showmore = findViewById(R.id.text_show_more);
        btn_showmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this, Hotel_Detail.class);
                startActivity(intent);
            }
        });
    }
}
