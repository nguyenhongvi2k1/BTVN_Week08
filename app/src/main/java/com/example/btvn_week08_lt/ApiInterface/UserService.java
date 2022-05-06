package com.example.btvn_week08_lt.ApiInterface;

import com.example.btvn_week08_lt.Login.LoginRequest;
import com.example.btvn_week08_lt.Login.LoginResponse;
import com.example.btvn_week08_lt.Login.RegisterRequest;
import com.example.btvn_week08_lt.Login.RegisterResponse;
import com.example.btvn_week08_lt.Model.The_Slide_Items_Model_Class;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    String BASE_URL = "https://nhm204.fun";

    @POST("/api/v1/user/register")
    Call<RegisterResponse> userSignup(@Body RegisterRequest signupRequest);

    @POST("/api/v1/user/login")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

    @GET("/api/v1/tips?page=1")
    Call<The_Slide_Items_Model_Class> getTips();

//    @POST("/api/v1/user/register")
//    Call<RegisterResponse> userSignup(@Field("fullName") String name,
//                                      @Field("email") String email,
//                                      @Field("password") String password,
//                                      @Field("phoneNumber") String logintype);
}
