package com.example.taskon.data.request.oper;

import com.example.taskon.data.entity.Task;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

public interface DeleteTask {

    @DELETE("post")
    void deleteAll();

    @DELETE("posts/{id}")
    void deleteById(@Path("id") int id);

    @DELETE("comments?postId={id}")
    void deleteByUserId(@Path("id") int id);
}
