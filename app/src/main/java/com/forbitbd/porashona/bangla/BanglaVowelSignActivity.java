package com.forbitbd.porashona.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View2Adapter;
import com.forbitbd.porashona.model.View1;
import com.forbitbd.porashona.model.View2;

import java.util.ArrayList;

public class BanglaVowelSignActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private View2Adapter adapter;
    private ArrayList<View2> view2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_vowel_sign);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view2List = new ArrayList<>();
        view2List.add(new View2("া","আ-কার"));
        view2List.add(new View2("ি","ই-কার"));
        view2List.add(new View2("ী","ঈ-কার"));
        view2List.add(new View2("ু","উ-কার"));
        view2List.add(new View2("ূ","ঊ-কার"));
        view2List.add(new View2("ৃ","ঋ-কার"));
        view2List.add(new View2("ে","এ-কার"));
        view2List.add(new View2("ৈ","ঐ-কার"));
        view2List.add(new View2("ো","ও-কার"));
        view2List.add(new View2("ৌ","ঔ-কার"));
        adapter = new View2Adapter(this,view2List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();

    }
}