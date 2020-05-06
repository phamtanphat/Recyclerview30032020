package com.example.recyclerview30032020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    // doi tuong cu the
    ArrayList<Food> mFoods;
    Button mBtnAdd;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1 : Định nghĩa đối tượng trong 1 dòng
        // 2 : Tạo 1 dòng item cho recyclerview
        // 3 : khởi tạo adapter gắn dữ liệu cho từng dòng
        // 4 : setup và map adapter vào cho recyclerview

        mRcvFood = findViewById(R.id.recyclerview);
        mBtnAdd = findViewById(R.id.buttonAdd);
        mFoods = Food.mock();
        // Doi tuong vo danh : anonymous class
        mFoodAdapter = new FoodAdapter(mFoods);
        mRcvFood.setHasFixedSize(true);
        mRcvFood.setItemViewCacheSize(20);
        mRcvFood.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRcvFood.setAdapter(mFoodAdapter);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewFood();
            }
        });
    }

    private void addNewFood() {
        mFoods.add(
                new Food(
                        "Mon an so " + count++,
                        "Quan " + new Random().nextInt(10) + 1,
                        new Random().nextInt(19001) + 10000,
                        R.drawable.hinh_mon_banh_khot
                ));
    }

}
