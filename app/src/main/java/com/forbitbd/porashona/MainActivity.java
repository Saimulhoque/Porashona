package com.forbitbd.porashona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.porashona.adapter.CategoryAdapter;
import com.forbitbd.porashona.arabic.ArabicActivity;
import com.forbitbd.porashona.bangla.BanglaActivity;
import com.forbitbd.porashona.english.EnglishActivity;
import com.forbitbd.porashona.knowledge.GeneralKnowledgeActivity;
import com.forbitbd.porashona.listener.CatClickListener;
import com.forbitbd.porashona.math.MathActivity;
import com.forbitbd.porashona.model.Category;
import com.forbitbd.porashona.poem.PoemActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.bangla, "বাংলা"));
        categoryList.add(new Category(R.drawable.english, "ইংরেজি"));
        categoryList.add(new Category(R.drawable.math, "গনিত"));
        categoryList.add(new Category(R.drawable.arabic, "আরবী"));
        categoryList.add(new Category(R.drawable.chora, "ছড়া"));
        categoryList.add(new Category(R.drawable.knowledge, "সাধারণ জ্ঞান"));
        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, BanglaActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, EnglishActivity.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(MainActivity.this, MathActivity.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(MainActivity.this, ArabicActivity.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(MainActivity.this, PoemActivity.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(MainActivity.this, GeneralKnowledgeActivity.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }
}