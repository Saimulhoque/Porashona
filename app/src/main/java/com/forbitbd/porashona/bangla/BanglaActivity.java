package com.forbitbd.porashona.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.porashona.listener.CatClickListener;
import com.forbitbd.porashona.model.Category;
import com.forbitbd.porashona.adapter.CategoryAdapter;
import com.forbitbd.porashona.R;

import java.util.ArrayList;

public class BanglaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.banglavowel,"স্বরবর্ণ"));
        categoryList.add(new Category(R.drawable.bangla,"স্বরচিহ্ন"));
        categoryList.add(new Category(R.drawable.bangla,"ব্যঞ্জনবর্ণ"));
        categoryList.add(new Category(R.drawable.bangla,"ফলার পরিচয়"));
        categoryList.add(new Category(R.drawable.bangla,"ঋতু"));
        categoryList.add(new Category(R.drawable.bangla,"মাস"));
        adapter = new CategoryAdapter(this, categoryList, new CatClickListener() {
            @Override
            public void CatItemCLick(int position) {
                if (position == 0){
                    Intent intent = new Intent(BanglaActivity.this,BanglaVowelActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(BanglaActivity.this,BanglaVowelSignActivity.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(BanglaActivity.this,BanglaConsonantActivity.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(BanglaActivity.this,BanglaFolaActivity.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(BanglaActivity.this,SeasonActivity.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(BanglaActivity.this,BanglaMonthActivity.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }
}