package com.forbitbd.porashona.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View2Adapter;
import com.forbitbd.porashona.model.View2;

import java.util.ArrayList;

public class BanglaFolaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private View2Adapter adapter;
    private ArrayList<View2> view2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_fola);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view2List = new ArrayList<>();
        view2List.add(new View2("ব","ব-ফলা"));
        view2List.add(new View2("ম","ম-ফলা"));
        view2List.add(new View2("্য","য-ফলা"));
        view2List.add(new View2("্র","র-ফলা"));
        view2List.add(new View2("ল","ল-ফলা"));
        view2List.add(new View2("`","রেফ"));
        view2List.add(new View2("্","হসন্ত"));

        adapter = new View2Adapter(this,view2List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();
    }
}
