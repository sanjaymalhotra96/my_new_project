package com.example.mynewproject.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.adaptors.AdaptorVedioCourses;
import com.example.mynewproject.adaptors.AdaptorVedioView;
import com.example.mynewproject.listening.Lt1Adaptor;

public class Vv1 extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
   AdaptorVedioView adaptorVedioView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.essay_vedioview_fragment, container, false);
        recyclerView=view.findViewById(R.id.recylerview_vedioview_essay);
        VedioViewRecyler();
        return view;
    }

    private void VedioViewRecyler() {

        adaptorVedioView=new AdaptorVedioView(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorVedioView);
    }
}
