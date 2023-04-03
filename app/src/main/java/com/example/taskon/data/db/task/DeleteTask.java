package com.example.taskon.data.db.task;

public interface DeleteTask {

    void deleteAll();

    void deleteById(int id);

    void deleteByUserId(int id);
}
