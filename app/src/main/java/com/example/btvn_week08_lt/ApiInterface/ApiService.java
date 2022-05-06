package com.example.btvn_week08_lt.ApiInterface;

import com.example.btvn_week08_lt.Model.BestDeals;
import com.example.btvn_week08_lt.Model.Destination;
import com.example.btvn_week08_lt.Model.MyProfile;
import com.example.btvn_week08_lt.Model.Tip;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/api/v1/room/best-deal?page=1")
    Call<List<BestDeals>> getBestDeal();

    @GET("/api/v1/tips?page=1")
    Call<List<Tip>> getTips();

    @GET("/api/v1/destination?page=1")
    Call<List<Destination>> getDestination();

    @GET("/api/v1/user/profile")
    Call<MyProfile> getMyProfile();

}
