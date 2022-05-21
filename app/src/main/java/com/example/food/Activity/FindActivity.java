package com.example.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.food.Adapter.FindFoodAdapter;
import com.example.food.Model.SalesmanModel;
import com.example.food.R;

import java.util.ArrayList;
import java.util.List;

public class FindActivity extends AppCompatActivity {
    private RecyclerView rcv_findListFood;
    private List<SalesmanModel> mListSalesman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        mapping();
        setData();
    }

    private void setData() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        rcv_findListFood.setLayoutManager(layoutManager);

        // Khởi tạo adapter
        FindFoodAdapter adapter = new FindFoodAdapter(getApplicationContext());
        if (mListSalesman != null)
            adapter.setData(mListSalesman);

        // gán adapter lên rcv
        rcv_findListFood.setAdapter(adapter);
    }

    private void mapping() {
        mListSalesman = new ArrayList<>();
        rcv_findListFood = findViewById(R.id.rcv_findListFood);
    }
}