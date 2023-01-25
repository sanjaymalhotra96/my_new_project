package com.example.mynewproject.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.fragments.FragPrepare;

public class AdaptorPrepare extends RecyclerView.Adapter<AdaptorPrepare.MyViewHolder> {
    public AdaptorPrepare(FragPrepare fragPrepare) {
    }

    @NonNull
    @Override
    public AdaptorPrepare.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_latest_blogs, parent, false);
        return new AdaptorPrepare.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorPrepare.MyViewHolder holder, int position) {

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
