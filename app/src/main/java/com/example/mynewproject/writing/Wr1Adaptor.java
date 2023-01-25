package com.example.mynewproject.writing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.complete_profile.CP4Adaptor;

public class Wr1Adaptor extends RecyclerView.Adapter<Wr1Adaptor.MyViewHolder> {
    public Wr1Adaptor(Wr1 wr1) {
    }

    @NonNull
    @Override
    public Wr1Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay, parent, false);
        return new Wr1Adaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Wr1Adaptor.MyViewHolder holder, int position) {

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
