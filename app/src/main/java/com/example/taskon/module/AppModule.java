package com.example.taskon.module;

import com.example.taskon.data.db.task.TaskWebDB;
import com.example.taskon.data.di.TaskRepositoryImplementation;
import com.example.taskon.data.repository.TaskRepository;
import com.example.taskon.data.service.WebService;
import com.example.taskon.module.task.TaskRepositoryModule;
import com.example.taskon.module.task.TaskServiceModule;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

import javax.inject.Inject;
import javax.inject.Singleton;


@Module
@InstallIn(SingletonComponent.class)
public class AppModule implements TaskRepositoryModule, TaskServiceModule {

    @Inject
    public WebService webService;

    @Inject
    public TaskRepositoryImplementation taskRepositoryImplementation;

    @Inject
    public TaskWebDB taskWebDB;

    @Provides
    @Singleton
    @Override
    public TaskRepository provideTaskRepository() {
        return taskRepositoryImplementation;
    }

    @Provides
    @Singleton
    @Override
    public TaskWebDB provideTaskWebService() {
        return webService.getTaskWebService();
    }
}
