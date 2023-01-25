package com.example.mynewproject.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.adaptors.AdaptorLiveClassess;
import com.example.mynewproject.adaptors.AdaptorVedioCourses;

public class LiveClassess extends AppCompatActivity {
    RecyclerView recyclerView;
    AdaptorLiveClassess adaptorLiveClassess;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_classess);
        recyclerView=findViewById(R.id.recylerview_live_classess);
        LiveClassesRecyler();
    }

    private void LiveClassesRecyler() {

        adaptorLiveClassess=new AdaptorLiveClassess(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorLiveClassess);
    }
}