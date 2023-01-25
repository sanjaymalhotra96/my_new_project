package com.example.mynewproject.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.fragments.FragVideos;

public class AdaptorVideos extends RecyclerView.Adapter<AdaptorVideos.MyViewHolder> {
    public AdaptorVideos(FragVideos fragVideos) {
    }

    @NonNull
    @Override
    public AdaptorVideos.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_videos, parent, false);
        return new AdaptorVideos.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorVideos.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
