package com.example.m14x.retrofitrecyclerview_itunes.Model;

import com.example.m14x.retrofitrecyclerview_itunes.Controller.ItunesService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by m14x on 04/18/2016.
 */
public class RetrofitInstance {


    public static final String BASE_URL = "http://itunes.apple.com";
    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public static ItunesService apiService = retrofit.create(ItunesService.class);
}
