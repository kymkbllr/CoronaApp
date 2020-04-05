package com.example.coronaapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface RestInterface {
    @GET("corona/countriesData")
    Call<Ülkeler> GetUlkeListesi(@Header("authorization") String auth);

    @GET("corona/totalData")
    Call<TotalData> GetTotalList(@Header("authorization") String auth);

    @GET("corona/coronaNews")
    Call<News> GetNews(@Header("authorization") String auth);


}

