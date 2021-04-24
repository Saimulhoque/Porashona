package com.forbitbd.porashona.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.model.View2;

import java.util.List;

public class View2Adapter extends RecyclerView.Adapter<View2Adapter.MyViewHolder> {

    private Context context;
    private List<View2> view2List;

    public View2Adapter(Context context, List<View2> view2List) {
        this.context = context;
        this.view2List = view2List;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.viewitem2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        View2 view2 = view2List.get(position);
        holder.textView1.setText(view2.getLetter());
        holder.textView2.setText(view2.getTitle());
    }

    @Override
    public int getItemCount() {
        return view2List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView1, textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.letter);
            textView2 = itemView.findViewById(R.id.title);
        }
    }
}
