package com.example.taskon.module.task;

import com.example.taskon.data.db.task.TaskWebDB;

public interface TaskServiceModule {

    TaskWebDB provideTaskWebService();
}
