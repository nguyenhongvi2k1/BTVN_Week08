package com.example.btvn_week08_lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.util.Timer;

import android.os.Handler;

import com.example.btvn_week08_lt.Activity.activity_introduction1;
import com.example.btvn_week08_lt.R;

public class MainActivity extends AppCompatActivity {

    private  static  int SPLASH_TIMER = 3000;
    ImageView backgroundImage ;

    //Animation
    Animation sideAnimation;
    AnimationSet animationSet;
    View viewProgress;

     Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewProgress = findViewById(R.id.view_progress);
        int viewWidth = viewProgress.getWidth();

        TranslateAnimation move = new TranslateAnimation(-(getScreenWidth() / 2) + viewWidth / 2, (getScreenWidth() / 2) + viewWidth / 2 + viewWidth, 0, 0);
        move.setDuration(1000);
        TranslateAnimation move1 = new TranslateAnimation(-viewWidth, 0, 0, 0);
        move1.setDuration(500);
        ScaleAnimation laftOut = new ScaleAnimation(0, 1, 1, 1);
        laftOut.setDuration(500);

        animationSet = new AnimationSet(true);
        animationSet.addAnimation(move);
        animationSet.addAnimation(move1);
        animationSet.addAnimation(laftOut);
        animationSet.addAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideout));

        startAnimation();

        //Hooks
        backgroundImage = (ImageView) findViewById(R.id.start_image);

        //Animation
//        sideAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_anim);

        //Set animation
//        backgroundImage.setAnimation(sideAnimation);

//        backgroundImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_anim);
//                backgroundImage.startAnimation(animation);
//            }
//        });

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(MainActivity.this, activity_introduction1.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  }, //Pass time here
                SPLASH_TIMER);
//        timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this, activity_introduction1.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 3000);
    }

    private void startAnimation() {
        viewProgress.startAnimation(animationSet);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startAnimation();
            }
        }, 1000);

    }

    private float getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}