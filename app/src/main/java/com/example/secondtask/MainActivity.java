package com.example.secondtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rcv;
Context cxt;

AdapterClass adapter;

    ArrayList<Model> arr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=findViewById(R.id.recyclerview);
        rcv.setLayoutManager(new LinearLayoutManager(this));



        arr.add(new Model("First"));
        arr.add(new Model("Second"));
        arr.add(new Model("Third"));
        arr.add(new Model("Fourth"));
        arr.add(new Model("Fifth"));
        arr.add(new Model("sixth"));
        arr.add(new Model("seventh"));
        arr.add(new Model("eighth"));
        arr.add(new Model("ninth"));




        adapter=new AdapterClass(arr,cxt);
        rcv.setAdapter(adapter);





    }
}