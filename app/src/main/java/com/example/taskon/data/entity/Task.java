package com.example.taskon.data.entity;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Task {

    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private int taskId;
    @SerializedName("title")
    private String task;
    @SerializedName("body")
    private String previousTask;

    public boolean isPresent() {
        return !task.isEmpty();
    }
}
