package com.example.taskon.data.service;

import javax.annotation.Nullable;

public abstract class BaseWebService<T> {

    public abstract T getService(@Nullable String url);
}
