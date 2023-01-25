package com.example.mynewproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;

import com.example.mynewproject.adaptors.AdaptorLatestBlogs;
import com.example.mynewproject.adaptors.AdaptorUpcoming;
import com.example.mynewproject.complete_profile.CP4Adaptor;

public class FragExplore extends Fragment {

    LinearLayoutManager linearLayoutManager,linearLayoutManager2;
    RecyclerView recyclerView,recyclerView1;
    AdaptorUpcoming adapterupcoming;
    AdaptorLatestBlogs adaptorLatestBlogs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        recyclerView=view.findViewById(R.id.recylerview_upcoming);
        recyclerView1=view.findViewById(R.id.recylerview_latest_blogs);
       UpComingRecyler();
       LatestBlogsRecycler();
        return  view;
    }

    private void LatestBlogsRecycler() {

        adaptorLatestBlogs=new AdaptorLatestBlogs(this);
        linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(linearLayoutManager2);
        recyclerView1.setAdapter(adaptorLatestBlogs);
    }

    private void UpComingRecyler() {
        adapterupcoming=new AdaptorUpcoming(this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterupcoming);

    }

}
