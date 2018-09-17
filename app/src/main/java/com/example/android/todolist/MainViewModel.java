package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private LiveData<List<TaskEntry>> mTasks;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mTasks = AppDatabase.getInstance(application).taskDao().getAllTasks();
    }

    public LiveData<List<TaskEntry>> getTasks(){
        return mTasks;
    }
}
