package com.example.mynewproject.writing.essay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.writing.Wr1Adaptor;

public class EssayAdaptor extends RecyclerView.Adapter<EssayAdaptor.MyViewHolder> {
    public EssayAdaptor(EssayActivity essayActivity) {
    }

    @NonNull
    @Override
    public EssayAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_essay2, parent, false);
        return new EssayAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EssayAdaptor.MyViewHolder holder, int position) {

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
