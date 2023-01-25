package com.example.mynewproject.complete_profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;

public class CP4Adaptor extends RecyclerView.Adapter<CP4Adaptor.MyViewHolder>{
    public CP4Adaptor(CP4 completeProfile4) {
    }

    @NonNull
    @Override
    public CP4Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complete_profile_recyclerview, parent, false);
        return new CP4Adaptor.MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull CP4Adaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
