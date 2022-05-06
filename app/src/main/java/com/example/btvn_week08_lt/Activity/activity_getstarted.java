package com.example.btvn_week08_lt.Activity;

import android.R.anim;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class activity_getstarted extends AppCompatActivity {
    private Button button;
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        button =(Button) findViewById(R.id.get_started);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_getstarted.this, LoginActivity.class);
                startActivity(intent);
            }
        });
//        setContentView(R.layout.test);
//        v_flipper =  findViewById(R.id.v_flipper);
//
//        int images[] = {R.drawable.cinqueterre, R.drawable.maldives, R.drawable.banhmi};
//
//        for(int image: images) {
//            flipperImages(image);
//        }

    }

//    public void flipperImages (int image) {
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource(image);
//        v_flipper.addView(imageView);
//        v_flipper.setFlipInterval(4000);
//        v_flipper.setAutoStart(true);
//
//        //anim
//        v_flipper.setInAnimation(this,  android.R.anim.slide_in_left);
//        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
//    }
}
