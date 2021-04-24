package com.forbitbd.porashona.english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View1Adapter;
import com.forbitbd.porashona.model.View1;

import java.util.ArrayList;

public class CapitalLetterActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<View1> view1List;
    private View1Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_letter);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view1List = new ArrayList<>();
        view1List.add(new View1("A"));
        view1List.add(new View1("B"));
        view1List.add(new View1("C"));
        view1List.add(new View1("D"));
        view1List.add(new View1("E"));
        view1List.add(new View1("F"));
        view1List.add(new View1("G"));
        view1List.add(new View1("H"));
        view1List.add(new View1("I"));
        view1List.add(new View1("J"));
        view1List.add(new View1("K"));
        view1List.add(new View1("L"));
        view1List.add(new View1("M"));
        view1List.add(new View1("N"));
        view1List.add(new View1("O"));
        view1List.add(new View1("P"));
        view1List.add(new View1("Q"));
        view1List.add(new View1("R"));
        view1List.add(new View1("S"));
        view1List.add(new View1("T"));
        view1List.add(new View1("U"));
        view1List.add(new View1("V"));
        view1List.add(new View1("W"));
        view1List.add(new View1("X"));
        view1List.add(new View1("Y"));
        view1List.add(new View1("Z"));
        adapter = new View1Adapter(this, view1List);
        recyclerView.setAdapter(adapter);
        recyclerView.stopScroll();

    }
}