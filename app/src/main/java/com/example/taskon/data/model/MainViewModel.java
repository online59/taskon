package com.example.taskon.data.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public abstract class MainViewModel<T> extends ViewModel {

    public abstract T viewModel();
}
