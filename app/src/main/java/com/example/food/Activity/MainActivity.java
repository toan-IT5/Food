package com.example.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.food.Adapter.CategoryAdapter;
import com.example.food.Adapter.ProgramTypeAdapter;
import com.example.food.Model.CategoryModel;
import com.example.food.Model.ProgramTypeModel;
import com.example.food.Model.SalesmanModel;
import com.example.food.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout_search;
    private ImageView img_mainBanner;
    private RecyclerView rcv_mainListCategory,rcv_mainListProgram ;
    private List<CategoryModel> mListCategoryModel;
    private List<ProgramTypeModel> mListProgramType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        getCategoryData();
        getProgramData();
        dataAssignment();
    }

    private void getProgramData() {
        mListProgramType = new ArrayList<>();
        List<SalesmanModel> mListSalesman = new ArrayList<>();
        SalesmanModel tmp = new SalesmanModel(
                1,
                "admin",
                "123",
                "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg",
                336516906,
                "Nguyễn Văn A",
                "Say Coffee",
                "D2, Nguyễn Gia Trí"
        );
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListSalesman.add(tmp);
        mListProgramType.add(new ProgramTypeModel(1, "Giãm giá sốc", mListSalesman));
        mListProgramType.add(new ProgramTypeModel(1, "Dịch vụ giá tốt", mListSalesman));

    }

    private void getCategoryData() {
        mListCategoryModel = new ArrayList<>();
        mListCategoryModel.add(new CategoryModel(0, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(1, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(2, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(3, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(4, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(5, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(6, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(7, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(8, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(9, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "Phở"));
        mListCategoryModel.add(new CategoryModel(10, "https://png.pngtree.com/png-clipart/20210701/ourmid/pngtree-pho-vietnam-food-travel-png-image_3546494.jpg", "bó"));

    }

    private void dataAssignment() {

        // Cài đặt hiển thị cảu recyclerView
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 4, RecyclerView.VERTICAL, false);
        rcv_mainListCategory.setLayoutManager(layoutManager);

        // cài đặt cho recyclerView hiển thị hết dữ liệu
        rcv_mainListCategory.setNestedScrollingEnabled(false);


        // Cài đặt dữ liệu cho recyclerView
        CategoryAdapter adapter = new CategoryAdapter(getApplicationContext());
        if (mListCategoryModel != null)
            adapter.setData(mListCategoryModel);
        rcv_mainListCategory.setAdapter(adapter);

        // Đẩy dữ liệu lên listProgram

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        rcv_mainListProgram.setLayoutManager(linearLayoutManager);

        ProgramTypeAdapter programTypeAdapter = new ProgramTypeAdapter(getApplicationContext());
        if (mListProgramType != null)
            programTypeAdapter.setData(mListProgramType);
        rcv_mainListProgram.setAdapter(programTypeAdapter);

    }

    private void mapping() {
        layout_search = findViewById(R.id.layout_search);
        img_mainBanner = findViewById(R.id.img_mainBanner);
        rcv_mainListCategory = findViewById(R.id.rcv_mainListCategory);
        rcv_mainListProgram = findViewById(R.id.rcv_mainListProgram);
    }
}