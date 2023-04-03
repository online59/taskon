package com.example.taskon.data.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitService {

    public Retrofit build(String url) {
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }
}
