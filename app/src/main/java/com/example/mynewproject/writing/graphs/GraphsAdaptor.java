package com.example.mynewproject.writing.graphs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.writing.essay.EssayAdaptor;

public class GraphsAdaptor extends RecyclerView.Adapter<GraphsAdaptor.MyViewHolder> {
    public GraphsAdaptor(GraphsActivity graphsActivity) {
    }

    @NonNull
    @Override
    public GraphsAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_graphs2, parent, false);
        return new GraphsAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GraphsAdaptor.MyViewHolder holder, int position) {

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
