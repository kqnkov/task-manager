package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> mTask;

    public AddTaskViewModel(AppDatabase appDatabase, int taskId) {
        mTask = appDatabase.taskDao().getTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask() {
        return mTask;
    }
}
