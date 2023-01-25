package com.example.mynewproject.writing.graphs;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.writing.essay.EssayAdaptor;

public class GraphsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    GraphsAdaptor graphsAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
        recyclerView=findViewById(R.id.recylerview_graphs2);
        GraphsRecyler();
    }

    private void GraphsRecyler() {

        graphsAdaptor=new GraphsAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(graphsAdaptor);
    }
}