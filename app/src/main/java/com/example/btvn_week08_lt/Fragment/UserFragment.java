package com.example.btvn_week08_lt.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.btvn_week08_lt.Activity.LoginActivity;
import com.example.btvn_week08_lt.Activity.MyProfileActivity;
import com.example.btvn_week08_lt.Activity.RegisterActivity;
import com.example.btvn_week08_lt.Activity.activity_introduction1;
import com.example.btvn_week08_lt.R;

public class UserFragment extends Fragment {

    TextView myProfile;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        myProfile = (TextView) view.findViewById(R.id.tvMyProfile);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyProfileActivity.class);
                startActivity(intent);
            }
        });
        return view;


    }
}
