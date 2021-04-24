package com.forbitbd.porashona.arabic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View1Adapter;
import com.forbitbd.porashona.adapter.View2Adapter;
import com.forbitbd.porashona.model.View1;
import com.forbitbd.porashona.model.View2;

import java.util.ArrayList;

public class ArabicActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private View2Adapter adapter;
    private ArrayList<View2> view2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view2List = new ArrayList<>();
        view2List.add(new View2("ا","আলিফ"));
        view2List.add(new View2("","বা"));
        view2List.add(new View2("","তা"));
        view2List.add(new View2("","ছা"));
        view2List.add(new View2("","জিম"));
        view2List.add(new View2("","হা"));
        view2List.add(new View2("","খো"));
        view2List.add(new View2("","দাল"));
        view2List.add(new View2("","জাল"));
        view2List.add(new View2("","রো"));
        view2List.add(new View2("","ঝা"));
        view2List.add(new View2("","সিন"));
        view2List.add(new View2("","শিন"));
        view2List.add(new View2("","ছোয়াদ"));
        view2List.add(new View2("","দোয়াত"));
        view2List.add(new View2("","তোয়া"));
        view2List.add(new View2("","জোয়া"));
        view2List.add(new View2("","আঈন"));
        view2List.add(new View2("","গঈন"));
        view2List.add(new View2("","ফা"));
        view2List.add(new View2("","ক্বোফ"));
        view2List.add(new View2("","কাফ"));
        view2List.add(new View2("","লাম"));
        view2List.add(new View2("","মিম"));
        view2List.add(new View2("","নূন"));
        view2List.add(new View2("","ওয়াও"));
        view2List.add(new View2("","হা"));
        view2List.add(new View2("","হামযা"));
        view2List.add(new View2("","ইয়া"));
        view2List.add(new View2("","ইয়া"));
        adapter = new View2Adapter(this,view2List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();
    }
}