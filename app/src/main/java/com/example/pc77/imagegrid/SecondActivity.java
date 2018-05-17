package com.example.pc77.imagegrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        img=findViewById(R.id.icon);
        Intent i=getIntent();
        img.setImageResource(i.getIntExtra("image",0));
    }
}
