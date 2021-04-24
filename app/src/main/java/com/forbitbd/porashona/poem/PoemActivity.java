package com.forbitbd.porashona.poem;

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

import java.util.ArrayList;

public class PoemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.bangla, "বাংলা ছড়া"));
        categoryList.add(new Category(R.drawable.english, "ইংরেজি ছড়া"));

        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0) {
                    Intent intent = new Intent(PoemActivity.this, BanglaActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(PoemActivity.this, EnglishActivity.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }
}