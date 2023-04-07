package com.example.taskon.data.api.task;

import com.example.taskon.data.entity.Task;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GetTask {

    @GET("posts")
    Call<List<Task>> getAll();

    @GET("posts/{id}")
    Call<Task> getById(@Path("id") int id);

    @GET("comments?postId={id}")
    Call<Task> getByUserId(@Path("id") int id);
}
