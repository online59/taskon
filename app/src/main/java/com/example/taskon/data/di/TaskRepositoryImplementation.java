package com.example.taskon.data.di;

import com.example.taskon.data.db.task.RequestTask;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.TaskRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Call;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

public class TaskRepositoryImplementation implements TaskRepository {

    @Inject
    public RequestTask requestTask;

    @Override
    public Call<List<Task>> getAllTasks() {
        return requestTask.getAll();
    }

    @Override
    public Call<Task> getTaskById(int id) {
        return requestTask.getById(id);
    }

    @Override
    public Call<Task> getTaskByUserId(int id) {
        return requestTask.getByUserId(id);
    }
}
