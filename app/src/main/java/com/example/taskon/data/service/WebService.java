package com.example.taskon.data.service;

import com.example.taskon.data.service.task.TaskService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

import javax.inject.Singleton;

@Module
@InstallIn(SingletonComponent.class)
public class WebService extends TaskService {

    @Provides
    @Singleton
    public WebService getInstance() {
        return new WebService();
    }
}
