package com.forbitbd.porashona.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.model.View1;

import java.util.List;

public class View1Adapter extends RecyclerView.Adapter<View1Adapter.MyViewHolder> {

    private Context context;
    private List<View1> view1List;

    public View1Adapter(Context context, List<View1> view1List) {
        this.context = context;
        this.view1List = view1List;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.viewitem1,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        View1 view1 = view1List.get(position);
        holder.textView.setText(view1.getLetter());
    }

    @Override
    public int getItemCount() {
        return view1List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.letter);
        }
    }
}
