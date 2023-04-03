package com.example.taskon.module.task;

import com.example.taskon.data.repository.TaskRepository;

public interface TaskRepositoryModule {
    TaskRepository provideTaskRepository();
}
