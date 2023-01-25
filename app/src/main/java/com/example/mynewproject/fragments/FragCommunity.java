package com.example.mynewproject.fragments;

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
import com.example.mynewproject.adaptors.AdaptorCommunity;
import com.example.mynewproject.adaptors.AdaptorPrepare;
import com.example.mynewproject.adaptors.AdaptorUpcoming;

public class FragCommunity extends Fragment {

    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    AdaptorCommunity adaptorCommunity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_community, container, false);
        recyclerView=view.findViewById(R.id.recylerview_community);
        CommunityRecyler();
        return view;
    }

    private void CommunityRecyler() {
        adaptorCommunity=new AdaptorCommunity(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptorCommunity);
    }
}
