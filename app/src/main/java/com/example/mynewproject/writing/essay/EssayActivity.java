package com.example.mynewproject.writing.essay;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.writing.Wr2Adaptor;

public class EssayActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    EssayAdaptor essayAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay);
        recyclerView=findViewById(R.id.recylerview_essay2);
        EssayRecyler();

    }

    private void EssayRecyler() {

        essayAdaptor=new EssayAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(essayAdaptor);
    }
}