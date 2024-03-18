package com.example.dwimahdini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;

public class penghubung extends RecyclerView.Adapter<tampilan_item> {


    Context context;
    List<item> items;

    public penghubung(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public tampilan_item onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new tampilan_item(LayoutInflater.from(context).inflate(R.layout.item_tampilan,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull tampilan_item holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getpicture());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}