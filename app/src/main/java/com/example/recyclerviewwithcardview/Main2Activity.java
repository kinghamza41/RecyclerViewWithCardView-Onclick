package com.example.recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    TextView textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.img2);
        textView3 = findViewById(R.id.tv3);
        textView4 = findViewById(R.id.tv4);
        imageView.setImageResource(getIntent().getIntExtra("imgname", 0));
        textView3.setText(getIntent().getStringExtra("txtheader"));
        textView4.setText(getIntent().getStringExtra("txtdesc"));
    }
}