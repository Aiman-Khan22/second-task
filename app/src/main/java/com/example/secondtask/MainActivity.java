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
import java.util.List;

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



//        arr.add(new Model("First"));
//        arr.add(new Model("Second"));
//        arr.add(new Model("Third"));
//        arr.add(new Model("Fourth"));
//        arr.add(new Model("Fifth"));
//        arr.add(new Model("sixth"));
//        arr.add(new Model("seventh"));
//        arr.add(new Model("eighth"));
//        arr.add(new Model("ninth"));




        adapter=new AdapterClass(ParentItemList(),cxt);
        rcv.setAdapter(adapter);





    }

    private List<Model> ParentItemList() {

        List<Model> itemList = new ArrayList<>();

        Model item = new Model("First", ChildItemList());
        itemList.add(item);
        Model item1 = new Model("Second", ChildItemList());
        itemList.add(item1);
        Model item2 = new Model("Third", ChildItemList());
        itemList.add(item2);
        Model item3 = new Model("Fourth", ChildItemList());
        itemList.add(item3);
        Model item4 = new Model("Fifth", ChildItemList());
        itemList.add(item4);
        Model item5 = new Model("sixth", ChildItemList());
        itemList.add(item5);
        Model item6 = new Model("seventh", ChildItemList());
        itemList.add(item6);
        Model item7 = new Model("eighth", ChildItemList());
        itemList.add(item7);


        return itemList;
    }
    private List<Model2> ChildItemList() {
        List<Model2> ChildItemList = new ArrayList<>();

        ChildItemList.add(new Model2("1","https://www.freeimages.com/photo/koldalen-4-1384902"));
        ChildItemList.add(new Model2("2","https://www.freeimages.com/photo/koldalen-4-1384902"));
        ChildItemList.add(new Model2("3","https://www.freeimages.com/photo/koldalen-4-1384902"));
        ChildItemList.add(new Model2("4","https://www.freeimages.com/photo/koldalen-4-1384902"));

        return ChildItemList;
    }

}