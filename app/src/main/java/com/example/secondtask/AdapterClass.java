package com.example.secondtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.holder> {
    Adapter_Class2 adapter2;
    RecyclerView rcv2;
    Context cxt;
    ArrayList<Model2> arr2=new ArrayList<>();

    public Context getCxt() {
        return cxt;
    }

    public void setCxt(Context cxt) {
        this.cxt = cxt;
    }

    public AdapterClass(ArrayList<Model> obj, Context cxt)


    {
        this.obj = obj;
        this.cxt=cxt;
    }

    public ArrayList<Model> getObj() {
        return obj;
    }

    public void setObj(ArrayList<Model> obj) {
        this.obj = obj;
    }

    ArrayList<Model> obj;




    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.row_layout,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
     Model2 currentItem = arr2.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.rcv2.setLayoutManager(layoutManager);
        holder.rcv2.setHasFixedSize(true);



        holder.name.setText(obj.get(position).getA());
        arr2.add(new Model2(R.drawable.ic_launcher_foreground));
        arr2.add(new Model2(R.drawable.ic_launcher_foreground));
        arr2.add(new Model2(R.drawable.ic_launcher_foreground));
        adapter2=new Adapter_Class2(arr2,cxt);

        adapter2=new Adapter_Class2(
                arr2,cxt);
        rcv2.setAdapter(adapter2);
    }

    @Override
    public int getItemCount() {
        return obj.size();
    }


    class holder extends RecyclerView.ViewHolder{

        TextView name;
        RecyclerView rcv2;
        public holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            rcv2=itemView.findViewById(R.id.rcv2);
        }
    }
}



