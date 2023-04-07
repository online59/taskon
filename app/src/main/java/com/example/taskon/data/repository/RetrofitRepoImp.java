package com.example.taskon.data.repository;

import com.example.taskon.data.request.WebRequestCall;
import com.example.taskon.data.service.WebService;
import org.jetbrains.annotations.Nullable;

public class RetrofitRepoImp extends MainRepository<WebRequestCall> {

    WebService webService;

    public RetrofitRepoImp(WebService webService) {
        this.webService = webService;
    }

    @Override
    public WebRequestCall getService(@Nullable String url) {
        return webService.getService(url);
    }
}
