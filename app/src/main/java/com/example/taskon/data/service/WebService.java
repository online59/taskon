package com.example.taskon.data.service;

import com.example.taskon.data.request.WebRequestCall;

import javax.annotation.Nullable;

public abstract class WebService {

    public abstract WebRequestCall getService(@Nullable String url);
}
