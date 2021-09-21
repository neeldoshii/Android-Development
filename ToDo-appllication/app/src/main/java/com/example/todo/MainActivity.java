package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.todo.Adapter.ToDoListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ToDolistRecyclerview = findViewById(R.id.ToDolistRecyclerview);
        ToDolistRecyclerview.setLayoutManager(new LinearLayoutManager(this));
//        String ToDolist = ("Data");
        String ToDolist [] = {"Bring vegetables today.", "Study for 1 hour","Go to bed maybe","Just keep quiet","Time to be lonely","Die you idiot moron","Bring vegetables today.", "Study for 1 hour","Go to bed maybe","Just keep quiet","Time to be lonely","Die you idiot moron"};
        ToDolistRecyclerview.setAdapter(new ToDoListAdapter(ToDolist));
    }
}