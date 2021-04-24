package com.forbitbd.porashona.math;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.porashona.model.Category;
import com.forbitbd.porashona.adapter.CategoryAdapter;
import com.forbitbd.porashona.R;
import com.forbitbd.porashona.bangla.BanglaConsonantActivity;
import com.forbitbd.porashona.bangla.BanglaVowelActivity;
import com.forbitbd.porashona.bangla.BanglaVowelSignActivity;
import com.forbitbd.porashona.listener.CatClickListener;

import java.util.ArrayList;

public class MathActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.math,"বাংলা সংখ্যা"));
        categoryList.add(new Category(R.drawable.math,"ইংরেজি সংখ্যা"));
        categoryList.add(new Category(R.drawable.math,"গুণের নামতা"));
        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0){
                    Intent intent = new Intent(MathActivity.this, BanglaNumberActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(MathActivity.this, EnglishNumberActivity.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(MathActivity.this, NamtaActivity.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }
}