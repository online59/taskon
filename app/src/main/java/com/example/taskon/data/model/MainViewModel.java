package com.example.taskon.data.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.MainRepository;
import com.example.taskon.data.api.RetrofitCall;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class MainViewModel extends ViewModel {

    MainRepository<RetrofitCall> repository;

    private final static String url = "https://jsonplaceholder.typicode.com/";

    public MainViewModel(MainRepository<RetrofitCall> repository) {
        this.repository = repository;
    }

    private final MutableLiveData<List<Task>> taskList = new MutableLiveData<>();

    public LiveData<List<Task>> getAllTasks() {
        repository.getService(url).getAll().enqueue(new Callback<List<Task>>() {
            @Override
            public void onResponse(Call<List<Task>> call, Response<List<Task>> response) {
                taskList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Task>> call, Throwable t) {

            }
        });

        return taskList;
    }

    private final MutableLiveData<Task> task = new MutableLiveData<>();

    public LiveData<Task> getTaskById(int id) {
        repository.getService(url).getById(id).enqueue(new Callback<Task>() {
            @Override
            public void onResponse(Call<Task> call, Response<Task> response) {
                task.postValue(response.body());
            }

            @Override
            public void onFailure(Call<Task> call, Throwable t) {

            }
        });

        return task;
    }


}
