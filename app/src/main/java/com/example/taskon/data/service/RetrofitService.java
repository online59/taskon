package com.example.taskon.data.service;

import com.example.taskon.data.request.TaskRequestCall;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService extends BaseWebService<TaskRequestCall> {

    private Retrofit build(String url) {
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Override
    public TaskRequestCall getService(@Nullable String url) {
        return build(url).create(TaskRequestCall.class);
    }
}
