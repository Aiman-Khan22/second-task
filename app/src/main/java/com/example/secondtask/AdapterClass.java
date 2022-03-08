package com.example.secondtask;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.holder> {

    List<Model> obj;
    Context cxt;
    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    public AdapterClass(List<Model> obj, Context cxt) {
        this.obj = obj;
        this.cxt = cxt;
    }


    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Model parentItem = obj.get(position);
        Log.d("onBindViewHolder", "" + obj.toString());

        holder.name.setText(parentItem.getA());


        LinearLayoutManager layoutManager = new LinearLayoutManager(holder.rcv2.getContext(), LinearLayoutManager.HORIZONTAL, false);

        layoutManager.setInitialPrefetchItemCount(parentItem.getModel2List().size());

        Adapter_Class2 childItemAdapter = new Adapter_Class2(parentItem.getModel2List(), cxt);
        holder.rcv2.setLayoutManager(layoutManager);
        holder.rcv2.setAdapter(childItemAdapter);
        holder.rcv2.setRecycledViewPool(viewPool);


    }


    @Override
    public int getItemCount() {
        return obj.size();
    }


    class holder extends RecyclerView.ViewHolder {

        TextView name;
        RecyclerView rcv2;
        public holder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            rcv2 = itemView.findViewById(R.id.rcv2);
        }
    }
}



