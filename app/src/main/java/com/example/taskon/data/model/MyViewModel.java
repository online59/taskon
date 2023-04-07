package com.example.taskon.data.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public abstract class MyViewModel<T> extends GetUrlViewModel {

    public abstract LiveData<List<T>> getAll();

    public abstract LiveData<T> getById(int id);

    public abstract void deleteAll();

    public abstract void deleteById(int id);

    public abstract void update(int id, T obj);
}
