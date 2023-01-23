package com.example.mynewproject.complete_profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;

public class CompleteProfileRecycler_Adaptor extends RecyclerView.Adapter<CompleteProfileRecycler_Adaptor.MyViewHolder>{
    public CompleteProfileRecycler_Adaptor(CompleteProfile4 completeProfile4) {
    }

    @NonNull
    @Override
    public CompleteProfileRecycler_Adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complete_profile_recyclerview, parent, false);
        return new CompleteProfileRecycler_Adaptor.MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull CompleteProfileRecycler_Adaptor.MyViewHolder holder, int position) {

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
