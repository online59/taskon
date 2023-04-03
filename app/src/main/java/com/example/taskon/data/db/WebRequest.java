package com.example.taskon.data.db;

import com.example.taskon.data.entity.Task;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface WebRequest<T> {

    @GET("{path}")
    Call<T> get(@Path("path") String path);

    @POST("{path}")
    Call<T> post(@Path("path") String path);
}
