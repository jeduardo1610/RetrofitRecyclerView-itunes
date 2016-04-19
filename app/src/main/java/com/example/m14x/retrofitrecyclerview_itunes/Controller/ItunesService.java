package com.example.m14x.retrofitrecyclerview_itunes.Controller;

import com.example.m14x.retrofitrecyclerview_itunes.Model.ResponseServer;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by m14x on 04/18/2016.
 */
public interface ItunesService {
    @GET("/search?term=rock")
    Call<ResponseServer> getContent();
}
