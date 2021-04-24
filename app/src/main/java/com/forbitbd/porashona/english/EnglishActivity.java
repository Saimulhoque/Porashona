package com.forbitbd.porashona.english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.porashona.model.Category;
import com.forbitbd.porashona.adapter.CategoryAdapter;
import com.forbitbd.porashona.R;
import com.forbitbd.porashona.listener.CatClickListener;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.english,"বড় হাতের বর্ণ"));
        categoryList.add(new Category(R.drawable.english,"ছোট হাতের বর্ণ"));
        categoryList.add(new Category(R.drawable.english,"মাসের নাম"));
        categoryList.add(new Category(R.drawable.english,"ঋতুর নাম"));
        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0){
                    Intent intent = new Intent(EnglishActivity.this,CapitalLetterActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(EnglishActivity.this,SmallLetterActivity.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(EnglishActivity.this,EnglishMonthActivity.class);
                    startActivity(intent);
                }else if (position ==3){
                    Intent intent = new Intent(EnglishActivity.this,EnglishSeasonActivity.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);

    }
}