package com.example.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.food.Adapter.FindFoodAdapter;
import com.example.food.Model.SalerModel;
import com.example.food.R;

import java.util.ArrayList;
import java.util.List;

public class FindActivity extends AppCompatActivity {
    private RecyclerView rcv_findList;
    private List<SalerModel> mListSalesman;
    private int id_category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        mapping();
        getData();
        setData();
    }

    private void getData() {
        id_category = getIntent().getIntExtra("id_category", 0);

        mListSalesman.add(new SalerModel(
                1,
                "admin",
                "123",
                "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg",
                336516906,
                "Say Coffee",
                "D2, Nguyễn Gia Trí"
        ));
        mListSalesman.add(new SalerModel(
                1,
                "admin",
                "123",
                "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg",
                336516906,
                "Say Coffee",
                "D2, Nguyễn Gia Trí"
        ));
        mListSalesman.add(new SalerModel(
                1,
                "admin",
                "123",
                "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg",
                336516906,
                "Say Coffee",
                "D2, Nguyễn Gia Trí"
        ));
        mListSalesman.add(new SalerModel(
                1,
                "admin",
                "123",
                "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg",
                336516906,
                "Say Coffee",
                "D2, Nguyễn Gia Trí"
        ));
    }

    private void setData() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        rcv_findList.setLayoutManager(layoutManager);

        // Khởi tạo adapter
        FindFoodAdapter adapter = new FindFoodAdapter(getApplicationContext());
        if (mListSalesman != null)
            adapter.setData(mListSalesman);

        // gán adapter lên rcv
        rcv_findList.setAdapter(adapter);
    }

    private void mapping() {
        mListSalesman = new ArrayList<>();
        rcv_findList = findViewById(R.id.rcv_findList);
    }
}