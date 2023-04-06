package com.example.taskon.data.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.BaseRepository;
import com.example.taskon.data.request.TaskRequestCall;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class BaseViewModel extends ViewModel {

    BaseRepository<TaskRequestCall> repository;

    private final static String url = "https://jsonplaceholder.typicode.com/";

    public BaseViewModel(BaseRepository<TaskRequestCall> repository) {
        this.repository = repository;
    }

    public MutableLiveData<List<Task>> getTaskList = new MutableLiveData<>();
    public void getAllTasks() {
        repository.getService(url).getAll().enqueue(new Callback<List<Task>>() {
            @Override
            public void onResponse(Call<List<Task>> call, Response<List<Task>> response) {
                getTaskList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Task>> call, Throwable t) {

            }
        });
    }

    public MutableLiveData<Task> getTask = new MutableLiveData<>();
    public void getTaskById(int id) {
        repository.getService(url).getById(id).enqueue(new Callback<Task>() {
            @Override
            public void onResponse(Call<Task> call, Response<Task> response) {
                getTask.postValue(response.body());
            }

            @Override
            public void onFailure(Call<Task> call, Throwable t) {

            }
        });
    }


}
