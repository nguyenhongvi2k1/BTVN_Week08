package com.example.btvn_week08_lt.Api;

import com.example.btvn_week08_lt.ApiInterface.UserService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//public class ApiClient {
//    private static Retrofit retrofit = null;

//    public static UserService getClient() {
//
//        // change your base URL
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("https://nhm204.fun")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        //Creating object for our interface
//        UserService api = retrofit.create(UserService.class);
//        return api; // return the APIInterface object
//    }
//
//}
public class ApiClient {
    private static Retrofit getRetrofit(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://nhm204.fun")
                .client(okHttpClient)
                .build();

        return retrofit;
    }


    public static UserService getUserService(){
        UserService userService = getRetrofit().create(UserService.class);
        return userService;
    }
}
