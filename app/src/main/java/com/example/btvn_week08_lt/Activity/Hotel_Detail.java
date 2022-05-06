package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.btvn_week08_lt.Fragment.FragmentMaps;
import com.example.btvn_week08_lt.MainActivity;
import com.example.btvn_week08_lt.R;

public class Hotel_Detail extends AppCompatActivity {
    private TextView textview_all_gallery;
    private TextView textview_all_review;
    private View btn_back, btn_viewmap;
    private TextView showmap, btn_viewall, btn_viewreview;
//    private FragmentMaps myMapFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_detail_demo);
        textview_all_gallery = (TextView) findViewById(R.id.view_all_gallery);
        textview_all_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Detail.this, Hotel_Gallery.class);
                startActivity(intent);
            }
        });
        textview_all_review = (TextView) findViewById(R.id.view_all_review);
        textview_all_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Detail.this, Hotel_Reviews.class);
                startActivity(intent);
            }
        });
        btn_back = (View) findViewById(R.id.btn_back_hotel);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Detail.this, HotelActivity.class);
                startActivity(intent);
            }
        });

        btn_viewall = findViewById(R.id.view_all_gallery);
        btn_viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Detail.this, Hotel_Gallery.class);
                startActivity(intent);
            }
        });

        btn_viewreview = findViewById(R.id.view_all_review);
        btn_viewreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel_Detail.this, Hotel_Reviews.class);
                startActivity(intent);
            }
        });

//        btn_viewmap = findViewById(R.id.map);
//        btn_viewmap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Hotel_Detail.this, Hotel_Gallery.class);
//                startActivity(intent);
//            }
//        });


//        FragmentManager fragmentManager = this.getSupportFragmentManager();
//        //this.myMapFragment = (fragment_map) fragmentManager.findFragmentById(R.id.map);
//        showmap = (TextView) findViewById(R.id.show_in_map);
//        showmap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Hotel_Detail.this, FragmentMaps.class);
//                startActivity(intent);
//            }
//        });
    }
}
