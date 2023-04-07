package com.example.taskon.data.request;

import com.example.taskon.data.request.task.BaseTaskOperations;

public interface RetrofitCall extends WebRequestCall {

    BaseTaskOperations requestTask();
}
