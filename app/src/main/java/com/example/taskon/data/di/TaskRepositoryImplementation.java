package com.example.taskon.data.di;

import com.example.taskon.data.db.task.TaskWebDB;
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

@Module
@InstallIn(SingletonComponent.class)
public class TaskRepositoryImplementation implements TaskRepository {

    @Provides
    @Singleton
    public TaskRepositoryImplementation getInstance() {
        return new TaskRepositoryImplementation();
    }

    @Inject
    public TaskWebDB taskWebDB;

    @Override
    public Call<List<Task>> getAllTasks() {
        return taskWebDB.getAll();
    }

    @Override
    public Call<Task> getTaskById(int id) {
        return taskWebDB.getById(id);
    }

    @Override
    public Call<Task> getTaskByUserId(int id) {
        return taskWebDB.getByUserId(id);
    }
}
