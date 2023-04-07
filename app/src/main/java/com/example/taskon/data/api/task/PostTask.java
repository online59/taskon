package com.example.taskon.data.api.task;

import com.example.taskon.data.entity.Task;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PostTask {

    @POST("posts/{id}")
    void updateTask(@Path("id") int id, @Body Task task);
}
