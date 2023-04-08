package com.example.taskon.data.client;

import com.example.taskon.data.api.RetrofitCall;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebService {

    public WebService() {

    }

    private Retrofit buildService(String url) {
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public RetrofitCall getRetrofitService(@Nullable String url) {
        return buildService(url).create(RetrofitCall.class);
    }
}
