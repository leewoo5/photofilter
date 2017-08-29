package com.example.leewoo5629.photofilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

public class RecyclerActivity extends AppCompatActivity {

    private ImageView mImageView;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        mImageView = (ImageView) findViewById(R.id.imageView2);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);


    }
}
