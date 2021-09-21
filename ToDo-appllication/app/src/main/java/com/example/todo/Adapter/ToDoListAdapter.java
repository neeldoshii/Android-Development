package com.example.todo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo.R;

public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListAdapter.RecycleViewHolder>{
    private String[] data;
    public ToDoListAdapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent,false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        String title =data[position];
        holder.texttitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkboxbtn;
        TextView texttitle;
        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            checkboxbtn = itemView.findViewById(R.id.checkboxbtn);
            texttitle = itemView.findViewById(R.id.texttitle);
        }
    }


}
