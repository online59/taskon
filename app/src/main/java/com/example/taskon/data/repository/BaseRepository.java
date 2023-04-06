package com.example.taskon.data.repository;

import org.jetbrains.annotations.Nullable;

public abstract class BaseRepository<T> {

    public abstract T getService(@Nullable String url);

}
