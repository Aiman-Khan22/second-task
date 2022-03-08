package com.example.secondtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Class2 extends RecyclerView.Adapter <Adapter_Class2.holder2>
{
    Context context;
    ArrayList<Model2> obj2;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Adapter_Class2(ArrayList<Model2> obj2, Context context) {
        this.obj2= obj2;
        this.context=context;
    }

    public ArrayList<Model2> getObj2()
    {
        return obj2;
    }

    public void setObj2(ArrayList<Model2> obj2)
    {
        this.obj2= obj2;
    }



    @NonNull
    @Override
    public holder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.inner_layout,parent,false);
        return new Adapter_Class2.holder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder2 holder, int position) {

        holder.image.setImageResource(obj2.get(position).getB());
        holder.image2.setImageResource(obj2.get(position).getC());
        holder.image3.setImageResource(obj2.get(position).getD());
    }

    @Override
    public int getItemCount() {
        return obj2.size();
    }

    public class holder2 extends RecyclerView.ViewHolder{
ImageView image;
ImageView image2;
ImageView image3;

        public holder2(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            image2=itemView.findViewById(R.id.image);
            image3=itemView.findViewById(R.id.image);

        }
    }
}
