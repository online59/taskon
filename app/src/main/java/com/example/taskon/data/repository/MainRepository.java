package com.example.taskon.data.repository;

import org.jetbrains.annotations.Nullable;

public abstract class MainRepository<T> {

    public abstract T getDatabase();

}
