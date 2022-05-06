package com.example.btvn_week08_lt.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.btvn_week08_lt.Activity.ActivityTripToItaly;
import com.example.btvn_week08_lt.Activity.MyProfileActivity;
import com.example.btvn_week08_lt.Activity.TripToAmericaActivity;
import com.example.btvn_week08_lt.R;

public class TripsFragment extends Fragment {

    private FrameLayout btn_Italy, btn_Amarica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trips, container, false);

        btn_Italy = (FrameLayout) view.findViewById(R.id.frameLayout3);
        btn_Italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityTripToItaly.class);
                startActivity(intent);
            }
        });

        btn_Amarica = (FrameLayout) view.findViewById(R.id.frameLayout2);
        btn_Amarica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TripToAmericaActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
