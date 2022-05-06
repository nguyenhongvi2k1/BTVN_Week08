package com.example.btvn_week08_lt.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.btvn_week08_lt.Adapter.ViewPagerAdapter;
import com.example.btvn_week08_lt.Login.LoginResponse;
import com.example.btvn_week08_lt.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_home extends AppCompatActivity {

    ViewFlipper v_flipper;

    private BottomNavigationView navigationView;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LoginResponse loginResponse;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            loginResponse = (LoginResponse) intent.getSerializableExtra("data");
            Log.e("TAG", "=====>" + loginResponse.getEmail());
        }

        navigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        setUpViewPager();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_loca:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.nav_favo:
                        mViewPager.setCurrentItem(2);
                        break;
                    case R.id.nav_trips:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.nav_search:
                        mViewPager.setCurrentItem(3);
                        break;
                    case R.id.nav_usr:
                        mViewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
    }

        private void setUpViewPager() {
            ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            mViewPager.setAdapter(viewPagerAdapter);

            mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }
                @Override
                public void onPageSelected(int position) {
                    switch (position) {
                        case 0:
                            navigationView.getMenu().findItem(R.id.nav_loca).setChecked(true);
                            break;
                        case 2:
                            navigationView.getMenu().findItem(R.id.nav_favo).setChecked(true);
                            break;
                        case 1:
                            navigationView.getMenu().findItem(R.id.nav_trips).setChecked(true);
                            break;
                        case 3:
                            navigationView.getMenu().findItem(R.id.nav_search).setChecked(true);
                            break;
                        case 4:
                            navigationView.getMenu().findItem(R.id.nav_usr).setChecked(true);
                            break;
                    }
                }
                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
//        btnnext =(ImageView) findViewById(R.id.start_image);
//        btnnext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,activity_introduction1.class);
//                startActivity(intent);
//
//            }
//        });


    }
