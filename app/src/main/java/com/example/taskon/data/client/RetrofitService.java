package com.example.taskon.data.client;

import com.example.taskon.data.api.RetrofitCall;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService implements WebService {

    private Retrofit build(String url) {
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Override
    public RetrofitCall getService(@Nullable String url) {
        return build(url).create(RetrofitCall.class);
    }
}
