package com.example.mynewproject.speaking.intoduction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.speaking.SpeakingAdaptor;

public class IntroductionAdaptor extends RecyclerView.Adapter<IntroductionAdaptor.MyViewHolder> {
    public IntroductionAdaptor(Introduction introduction) {
    }

    @NonNull
    @Override
    public IntroductionAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.introduction_recyclerview, parent, false);
        return new IntroductionAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IntroductionAdaptor.MyViewHolder holder, int position) {

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
