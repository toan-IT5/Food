package com.example.food.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.food.Adapter.FoodAdapter;
import com.example.food.Model.FoodModel;
import com.example.food.Model.SalesmanModel;
import com.example.food.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class SalesmanDetailActivity extends AppCompatActivity {
    private ImageView img_salesmanBackground;
    private TextView txt_salesmanDetailName, txt_salesmanDetailAddress;
    private RecyclerView rcv_listSalesmanDetail;
    private SalesmanModel salesmanModel;
    private List<FoodModel> mListFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salesman_detail);
        mapping();
        getData();
        setData();
    }

    private void setData() {
        if (salesmanModel == null)
            return;
        Picasso.get().load(salesmanModel.getImage()).into(img_salesmanBackground);
        txt_salesmanDetailName.setText(salesmanModel.getName_store());
        txt_salesmanDetailAddress.setText(salesmanModel.getAddress());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        rcv_listSalesmanDetail.setLayoutManager(layoutManager);

        FoodAdapter adapter = new FoodAdapter(getApplicationContext());
        if (mListFood != null)
            adapter.setData(mListFood);

        rcv_listSalesmanDetail.setAdapter(adapter);

    }

    private void getData() {
        salesmanModel = (SalesmanModel) getIntent().getSerializableExtra("obj_salesman");

        mListFood = new ArrayList<>();
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));
        mListFood.add(new FoodModel(1,"Phở",25000,"https://cdn.tgdd.vn/Files/2017/03/18/962092/an-lien-3-bat-pho-voi-cong-thuc-nau-pho-nay-202201261419401397.jpg","Phở được làm từ bò"));



    }

    private void mapping() {
        img_salesmanBackground = findViewById(R.id.img_salesmanBackground);
        txt_salesmanDetailName = findViewById(R.id.txt_salesmanDetailName);
        txt_salesmanDetailAddress = findViewById(R.id.txt_salesmanDetailAddress);
        rcv_listSalesmanDetail = findViewById(R.id.rcv_listSalesmanDetail);
    }
}