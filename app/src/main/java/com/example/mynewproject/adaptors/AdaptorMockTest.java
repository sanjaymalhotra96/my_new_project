package com.example.mynewproject.adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynewproject.R;
import com.example.mynewproject.activities.ListeningActivity;


public class AdaptorMockTest extends RecyclerView.Adapter<AdaptorMockTest.MyViewHolder> {

    public AdaptorMockTest(ListeningActivity listeningActivity) {
    }

    @NonNull
    @Override
    public AdaptorMockTest.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylcerview_listening_mocktest, parent, false);
        return new AdaptorMockTest.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorMockTest.MyViewHolder holder, int position) {

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