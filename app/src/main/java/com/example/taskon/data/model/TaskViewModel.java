package com.example.taskon.data.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.taskon.data.api.RetrofitCall;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.MainRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class TaskViewModel extends MyViewModel<Task> {

    private final MainRepository<RetrofitCall> repository;
    private String url;

    public TaskViewModel(MainRepository<RetrofitCall> repository) {
        this.repository = repository;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private final MutableLiveData<List<Task>> taskList = new MutableLiveData<>();
    private final MutableLiveData<Task> task = new MutableLiveData<>();

    @Override
    public LiveData<List<Task>> getAll() {

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

    @Override
    public LiveData<Task> getById(int id) {

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

    @Override
    public void deleteAll() {
        repository.getService(url).deleteAll();
    }

    @Override
    public void deleteById(int id) {
        repository.getService(url).deleteById(id);
    }

    @Override
    public void update(int id, Task obj) {
        repository.getService(url).updateTask(id, obj);
    }
}
