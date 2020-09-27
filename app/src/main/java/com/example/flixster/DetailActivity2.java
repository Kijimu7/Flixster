package com.example.flixster;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        String title = getIntent().getStringExtra("title");
    }
}