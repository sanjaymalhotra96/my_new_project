package com.example.mynewproject.complete_profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;



public class CP4 extends Fragment {
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    CP4Adaptor completeProfileRecycler_adaptor;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.complete_profile4, container, false);
        recyclerView=view.findViewById(R.id.recylcerview);
        completeProfileRecycler_adaptor=new CP4Adaptor(this);
        gridLayoutManager=new GridLayoutManager(view.getContext(),3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(completeProfileRecycler_adaptor);
        return view;
    }
}