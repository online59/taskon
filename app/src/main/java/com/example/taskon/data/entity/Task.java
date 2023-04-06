package com.example.taskon.data.entity;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public abstract class Task {

    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private int taskId;
    @SerializedName("title")
    private String task;
    @SerializedName("body")
    private String previousTask;

    // 0 for complete, 1 for normal, -1 for overdue, 99 for on-hold
    private int status;

    public boolean isNormal() {
        return status == 1;
    }

    public boolean isOverDue() {
        return status == -1;
    }

    public boolean isComplete() {
        return status == 0;
    }

    public boolean isOnHold() {
        return status == 99;
    }
}
