package com.example.secondtask;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Class2 extends RecyclerView.Adapter<Adapter_Class2.holder2> {
    Context context;
    List<Model2> obj2;



    public Adapter_Class2(List<Model2> obj2, Context context) {
        this.obj2 = obj2;
        this.context = context;
    }


    @NonNull
    @Override
    public holder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.inner_layout, parent, false);
        return new Adapter_Class2.holder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder2 holder, int position) {
      Model2  current = obj2.get(position);

        holder.textView.setText(String.valueOf(current.getB()));
Glide.with(context).load(current.getImagee()).into(holder.image);
        Log.d("hello", "" +String.valueOf(current.getImagee()));
    }

    @Override
    public int getItemCount() {
        return obj2.size();
    }

    public class holder2 extends RecyclerView.ViewHolder {
       TextView textView;ImageView image;

        public holder2(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            image = itemView.findViewById(R.id.image);

        }
    }
}
