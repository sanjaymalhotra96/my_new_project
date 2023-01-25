package com.example.mynewproject.speaking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;


public class SpeakingAdaptor extends RecyclerView.Adapter<SpeakingAdaptor.MyViewHolder> {
    public SpeakingAdaptor(Speaking1 speaking1) {
    }

    @NonNull
    @Override
    public SpeakingAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.speaking_recyclerview, parent, false);
        return new SpeakingAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakingAdaptor.MyViewHolder holder, int position) {

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
