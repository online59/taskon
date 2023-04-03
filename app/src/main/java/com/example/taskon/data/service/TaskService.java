package com.example.taskon.data.service;

import com.example.taskon.data.db.WebRequest;
import com.example.taskon.data.db.task.RequestTask;
import com.example.taskon.data.service.RetrofitService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Inject;

public class TaskService extends RetrofitService{

    private String URL = "https://jsonplaceholder.typicode.com/";

    public RequestTask getTaskWebService(String url) {
        return createService(url);
    }

    private RequestTask createService(String url) {
        return build(url).create(RequestTask.class);
    }
}

