package com.forbitbd.porashona.english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View1Adapter;
import com.forbitbd.porashona.model.View1;

import java.util.ArrayList;

public class SmallLetterActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<View1> view1List;
    private View1Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_letter);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view1List = new ArrayList<>();
        view1List.add(new View1("a"));
        view1List.add(new View1("b"));
        view1List.add(new View1("c"));
        view1List.add(new View1("d"));
        view1List.add(new View1("e"));
        view1List.add(new View1("f"));
        view1List.add(new View1("g"));
        view1List.add(new View1("h"));
        view1List.add(new View1("i"));
        view1List.add(new View1("j"));
        view1List.add(new View1("k"));
        view1List.add(new View1("l"));
        view1List.add(new View1("m"));
        view1List.add(new View1("n"));
        view1List.add(new View1("o"));
        view1List.add(new View1("p"));
        view1List.add(new View1("q"));
        view1List.add(new View1("r"));
        view1List.add(new View1("s"));
        view1List.add(new View1("t"));
        view1List.add(new View1("u"));
        view1List.add(new View1("v"));
        view1List.add(new View1("w"));
        view1List.add(new View1("x"));
        view1List.add(new View1("y"));
        view1List.add(new View1("z"));
        adapter = new View1Adapter(this, view1List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();

    }
}