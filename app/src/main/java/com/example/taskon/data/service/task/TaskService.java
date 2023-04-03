package com.example.taskon.data.service.task;

import com.example.taskon.data.db.WebDB;
import com.example.taskon.data.db.task.TaskWebDB;
import com.example.taskon.data.entity.Task;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class TaskService {

    private static final String URL = "https://jsonplaceholder.typicode.com/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public TaskWebDB getTaskWebService() {
        return createService();
    }

    private WebDB createService() {
        return retrofit.create(WebDB.class);
    }
}

