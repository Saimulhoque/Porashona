package com.forbitbd.porashona.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View1Adapter;
import com.forbitbd.porashona.model.View1;

import java.util.ArrayList;

public class BanglaConsonantActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private View1Adapter adapter;
    private ArrayList<View1> view1List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_consonant);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view1List = new ArrayList<>();
        view1List.add(new View1("ক"));
        view1List.add(new View1("খ"));
        view1List.add(new View1("গ"));
        view1List.add(new View1("ঘ"));
        view1List.add(new View1("ঙ"));
        view1List.add(new View1("চ"));
        view1List.add(new View1("ছ"));
        view1List.add(new View1("জ"));
        view1List.add(new View1("ঝ"));
        view1List.add(new View1("ঞ"));
        view1List.add(new View1("ঠ"));
        view1List.add(new View1("ড"));
        view1List.add(new View1("ঢ"));
        view1List.add(new View1("ণ"));
        view1List.add(new View1("ত"));
        view1List.add(new View1("থ"));
        view1List.add(new View1("দ"));
        view1List.add(new View1("ধ"));
        view1List.add(new View1("ন"));
        view1List.add(new View1("প"));
        view1List.add(new View1("ফ"));
        view1List.add(new View1("ব"));
        view1List.add(new View1("ভ"));
        view1List.add(new View1("ম"));
        view1List.add(new View1("য"));
        view1List.add(new View1("র"));
        view1List.add(new View1("ল"));
        view1List.add(new View1("শ"));
        view1List.add(new View1("ষ"));
        view1List.add(new View1("স"));
        view1List.add(new View1("হ"));
        view1List.add(new View1("ড়"));
        view1List.add(new View1("ঢ়"));
        view1List.add(new View1("য়"));
        view1List.add(new View1("ৎ"));
        view1List.add(new View1("ং"));
        view1List.add(new View1("ঃ"));
        view1List.add(new View1("ঁ"));
        adapter = new View1Adapter(this,view1List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();
    }

}