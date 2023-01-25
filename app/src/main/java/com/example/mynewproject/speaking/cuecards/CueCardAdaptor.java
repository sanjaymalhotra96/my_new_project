package com.example.mynewproject.speaking.cuecards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.speaking.intoduction.IntroductionAdaptor;

public class CueCardAdaptor extends RecyclerView.Adapter<CueCardAdaptor.MyViewHolder> {
    public CueCardAdaptor(CueCards1 cueCards1) {
    }

    @NonNull
    @Override
    public CueCardAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuecard_recyclerview, parent, false);
        return new CueCardAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CueCardAdaptor.MyViewHolder holder, int position) {

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
