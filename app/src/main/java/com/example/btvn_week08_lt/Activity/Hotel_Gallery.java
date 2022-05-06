package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class Hotel_Gallery extends AppCompatActivity {
    private View btn_back_gallery;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_gallery);
        btn_back_gallery= (View) findViewById(R.id.chevron_lef_gallery);
        btn_back_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Gallery.this, Hotel_Detail.class);
                startActivity(intent);
            }
        });
    }
}
