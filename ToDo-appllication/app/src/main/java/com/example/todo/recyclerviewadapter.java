package com.example.todo;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.RecycleViewHolder> {

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
