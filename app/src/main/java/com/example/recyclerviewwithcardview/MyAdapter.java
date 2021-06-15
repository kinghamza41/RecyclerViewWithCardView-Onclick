package com.example.recyclerviewwithcardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<Model> data;
    Context context;

    public MyAdapter(ArrayList<Model> data, Context applicationContext) {
        this.data = data;
        this.context = applicationContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.singlerow, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Model temp = data.get(position);
        holder.textView1.setText(data.get(position).getHeader());
        holder.textView2.setText(data.get(position).getDesc());
        holder.imageView.setImageResource(data.get(position).getImgname());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("imgname", temp.getImgname());
                intent.putExtra("txtheader", temp.getHeader());
                intent.putExtra("txtdesc", temp.getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
