package com.example.recyclerviewwithcardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView1, textView2;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img1);
        textView1 = itemView.findViewById(R.id.tv1);
        textView2 = itemView.findViewById(R.id.tv2);
    }
}
