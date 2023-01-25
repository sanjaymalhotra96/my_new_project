package com.example.mynewproject.speaking.cuecards;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;

public class CueCards1 extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    CueCardAdaptor cueCardAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cue_cards1);
        recyclerView=findViewById(R.id.cuecard_recyclerview);
        CueCardRecyler();
    }

    private void CueCardRecyler() {

        cueCardAdaptor=new CueCardAdaptor(this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cueCardAdaptor);
    }
}