package com.example.btvn_week08_lt.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.btvn_week08_lt.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FragmentMaps extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_map);
        SupportMapFragment mapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.map = googleMap;
//        LatLng Maharashtra = new LatLng(19.169257, 73.341601);
//        map.addMarker(new MarkerOptions().position(Maharashtra).title("Maharashtra"));
//        map.moveCamera(CameraUpdateFactory.newLatLng(Maharashtra));

        // Set default position
        // Add a marker in Sydney and move the camera
        LatLng vietnam = new LatLng(14.0583, 108.2772); // 14.0583° N, 108.2772° E
        this.map.addMarker(new MarkerOptions().position(vietnam).title("Marker in Vietnam"));
        this.map.moveCamera(CameraUpdateFactory.newLatLng(vietnam));
        this.map.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(latLng);
                markerOptions.title(latLng.latitude + " : "+ latLng.longitude);
                // Clear previously click position.
                googleMap.clear();
                // Zoom the Marker
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10));
                // Add Marker on Map
                googleMap.addMarker(markerOptions);
            }
        });
    }
}
