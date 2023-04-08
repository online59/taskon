package com.example.taskon.data.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.taskon.data.client.WebService;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.MainRepository;
import com.example.taskon.data.repository.WebRepositoryImplementation;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class TaskViewModel extends MainViewModel<TaskViewModel> {

    private static TaskViewModel instance;
    private final MainRepository<WebService> repository;
    private String url;
    private final MutableLiveData<List<Task>> taskList;
    private final MutableLiveData<Task> task;


    private TaskViewModel(MainRepository<WebService> repository) {
        this.repository = repository;
        taskList = new MutableLiveData<>();
        task = new MutableLiveData<>();
    }

    public static TaskViewModel getInstance(MainRepository<WebService> repository) {
        if (instance == null) {
            instance = new TaskViewModel(repository);
        }

        return instance;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public TaskViewModel viewModel() {
        return instance;
    }

    public LiveData<List<Task>> getAll() {

        repository.getDatabase().getRetrofitService(url).getAll().enqueue(new Callback<List<Task>>() {
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

    public LiveData<Task> getById(int id) {

        repository.getDatabase().getRetrofitService(url).getById(id).enqueue(new Callback<Task>() {
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

    public void deleteAll() {
        repository.getDatabase().getRetrofitService(url).deleteAll();
    }

    public void deleteById(int id) {
        repository.getDatabase().getRetrofitService(url).deleteById(id);
    }

    public void update(int id, Task obj) {
        repository.getDatabase().getRetrofitService(url).updateTask(id, obj);
    }

}
