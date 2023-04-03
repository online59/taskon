package com.example.taskon.data.repository;

import com.example.taskon.data.entity.Task;
import retrofit2.Call;

import java.util.List;

public interface TaskRepository {

    Call<List<Task>> getAllTasks();

    Call<Task> getTaskById(int id);

    Call<Task> getTaskByUserId(int id);
}
