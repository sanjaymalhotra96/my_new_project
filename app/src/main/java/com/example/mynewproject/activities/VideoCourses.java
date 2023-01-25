package com.example.mynewproject.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.adaptors.AdaptorVedioCourses;
import com.example.mynewproject.listening.Lt1Adaptor;

public class VideoCourses extends AppCompatActivity {
    RecyclerView recyclerView;
    AdaptorVedioCourses adaptorVedioCourses;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_courses);
        recyclerView=findViewById(R.id.recylerview_video_courses);
        VedioCoursesRecyler();
    }

    private void VedioCoursesRecyler() {

        adaptorVedioCourses=new AdaptorVedioCourses(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorVedioCourses);
    }
}