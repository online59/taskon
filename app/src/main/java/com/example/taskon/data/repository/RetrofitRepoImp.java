package com.example.taskon.data.repository;

import com.example.taskon.data.request.RetrofitCall;
import com.example.taskon.data.request.WebRequestCall;
import com.example.taskon.data.service.WebService;
import org.jetbrains.annotations.Nullable;

public class RetrofitRepoImp extends MainRepository<RetrofitCall> {

    WebService webService;

    public RetrofitRepoImp(WebService webService) {
        this.webService = webService;
    }

    @Override
    public RetrofitCall getService(@Nullable String url) {
        return webService.getService(url);
    }
}
