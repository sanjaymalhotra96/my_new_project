package com.example.mynewproject.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.activities.VideoCourses;

public class AdaptorVedioCourses extends RecyclerView.Adapter<AdaptorVedioCourses.MyViewHolder> {
    public AdaptorVedioCourses(VideoCourses videoCourses) {
    }

    @NonNull
    @Override
    public AdaptorVedioCourses.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_video_courses, parent, false);
        return new AdaptorVedioCourses.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorVedioCourses.MyViewHolder holder, int position) {

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
