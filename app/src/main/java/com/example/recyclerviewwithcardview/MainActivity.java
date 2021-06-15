package com.example.recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(dataqueue(), getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<Model> dataqueue() {
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setHeader("C Programming");
        obj1.setDesc("Desktop Programming");
        obj1.setImgname(R.mipmap.ic_launcher);
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setHeader("C Programming");
        obj2.setDesc("Desktop Programming");
        obj2.setImgname(R.mipmap.ic_launcher);
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setHeader("C Programming");
        obj3.setDesc("Desktop Programming");
        obj3.setImgname(R.mipmap.ic_launcher);
        holder.add(obj3);


        Model obj4 = new Model();
        obj4.setHeader("C Programming");
        obj4.setDesc("Desktop Programming");
        obj4.setImgname(R.mipmap.ic_launcher);
        holder.add(obj4);


        Model obj5 = new Model();
        obj5.setHeader("C Programming");
        obj5.setDesc("Desktop Programming");
        obj5.setImgname(R.mipmap.ic_launcher);
        holder.add(obj5);
        return holder;

    }
}