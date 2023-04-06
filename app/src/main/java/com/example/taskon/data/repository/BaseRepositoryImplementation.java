package com.example.taskon.data.repository;

import com.example.taskon.data.request.TaskRequestCall;
import com.example.taskon.data.service.BaseWebService;
import org.jetbrains.annotations.Nullable;

public class BaseRepositoryImplementation extends BaseRepository<TaskRequestCall> {

    BaseWebService<TaskRequestCall> webService;

    public BaseRepositoryImplementation(BaseWebService<TaskRequestCall> webService) {
        this.webService = webService;
    }

    @Override
    public TaskRequestCall getService(@Nullable String url) {
        return webService.getService(url);
    }
}
