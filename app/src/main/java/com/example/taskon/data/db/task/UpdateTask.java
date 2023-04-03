package com.example.taskon.data.db.task;

import com.example.taskon.data.entity.Task;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UpdateTask {

    @POST("{path}")
    void updateTask(@Path("path") String path, Task task);
}
