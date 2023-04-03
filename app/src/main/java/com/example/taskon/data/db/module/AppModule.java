package com.example.taskon.data.db.module;

import com.example.taskon.data.db.task.RequestTask;
import com.example.taskon.data.di.TaskRepositoryImplementation;
import com.example.taskon.data.repository.TaskRepository;
import com.example.taskon.data.service.TaskService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

import javax.inject.Inject;
import javax.inject.Singleton;


@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Inject
    public TaskService taskService;

    @Provides
    @Singleton
    public RequestTask provideTaskRequest() {
        return taskService.getTaskWebService("https://jsonplaceholder.typicode.com/");
    }

    @Provides
    @Singleton
    public TaskService provideTaskService() {
        return new TaskService();
    }

    @Provides
    @Singleton
    public TaskRepository provideTaskRepository() {
        return new TaskRepositoryImplementation();
    }
}
