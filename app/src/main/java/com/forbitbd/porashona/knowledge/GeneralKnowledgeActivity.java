package com.forbitbd.porashona.knowledge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.porashona.MainActivity;
import com.forbitbd.porashona.R;
import com.forbitbd.porashona.adapter.CategoryAdapter;
import com.forbitbd.porashona.arabic.ArabicActivity;
import com.forbitbd.porashona.bangla.BanglaActivity;
import com.forbitbd.porashona.english.EnglishActivity;
import com.forbitbd.porashona.listener.CatClickListener;
import com.forbitbd.porashona.math.MathActivity;
import com.forbitbd.porashona.model.Category;
import com.forbitbd.porashona.poem.PoemActivity;

import java.util.ArrayList;

public class GeneralKnowledgeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_knowledge);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.bangla, "ফলের নাম"));
        categoryList.add(new Category(R.drawable.english, "ফুলের নাম"));
        categoryList.add(new Category(R.drawable.math, "পশুর নাম"));
        categoryList.add(new Category(R.drawable.arabic, "পাখির নাম"));
        categoryList.add(new Category(R.drawable.chora, "মানবদেহ"));
        categoryList.add(new Category(R.drawable.knowledge, "মাছের নাম"));
        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0) {

                } else if (position == 1) {

                }else if (position == 2){

                }else if (position == 3){

                }else if (position == 4){

                }else if (position == 5){

                }
            }
        });
        recyclerView.setAdapter(adapter);

    }
}