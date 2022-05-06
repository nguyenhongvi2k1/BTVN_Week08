package com.example.btvn_week08_lt.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.btvn_week08_lt.Fragment.FavoriteFragment;
import com.example.btvn_week08_lt.Fragment.HomeFragment;
import com.example.btvn_week08_lt.Fragment.SearchFragment;
import com.example.btvn_week08_lt.Fragment.TripsFragment;
import com.example.btvn_week08_lt.Fragment.UserFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new TripsFragment();
            case 2:
                return new FavoriteFragment();
            case 3:
                return new SearchFragment();
            case 4:
                return new UserFragment();
            default:
                return new HomeFragment();

        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
