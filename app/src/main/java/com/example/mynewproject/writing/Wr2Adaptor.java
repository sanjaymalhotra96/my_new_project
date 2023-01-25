package com.example.mynewproject.writing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;

public class Wr2Adaptor extends RecyclerView.Adapter<Wr2Adaptor.MyViewHolder> {
    public Wr2Adaptor(Wr2 wr2) {
    }

    @NonNull
    @Override
    public Wr2Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_graphs, parent, false);
        return new Wr2Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Wr2Adaptor.MyViewHolder holder, int position) {

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
