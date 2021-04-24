package com.forbitbd.porashona.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.View1Adapter;
import com.forbitbd.porashona.model.View1;

import java.util.ArrayList;

public class BanglaVowelActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private View1Adapter adapter;
    private ArrayList<View1> view1List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_vowel);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        view1List = new ArrayList<>();
        view1List.add(new View1("অ"));
        view1List.add(new View1("আ"));
        view1List.add(new View1("ই"));
        view1List.add(new View1("ঈ"));
        view1List.add(new View1("উ"));
        view1List.add(new View1("ঊ"));
        view1List.add(new View1("ঋ"));
        view1List.add(new View1("এ"));
        view1List.add(new View1("ঐ"));
        view1List.add(new View1("ও"));
        view1List.add(new View1("ঔ"));
        adapter = new View1Adapter(this,view1List);
        recyclerView.setAdapter(adapter);
    }
}
