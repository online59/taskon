package com.example.taskon.data.client;

import com.example.taskon.data.api.RetrofitCall;

import javax.annotation.Nullable;

public interface WebService {

    RetrofitCall getService(@Nullable String url);
}
