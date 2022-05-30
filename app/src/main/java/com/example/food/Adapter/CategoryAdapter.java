package com.example.food.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.Activity.FindActivity;
import com.example.food.Model.CategoryModel;
import com.example.food.R;
import com.example.food.Util.DBLocal.DataLocalManager;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<CategoryModel> mListCategoryModel;
    private final Context mContext;

    public CategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<CategoryModel> list){
        this.mListCategoryModel = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModel categoryModel = mListCategoryModel.get(position);
        if (categoryModel == null)
            return;

        // Gán dữ liệu

        Picasso.get().load(categoryModel.getImage()).into(holder.img_itemCategory);
        holder.txt_itemCategoryName.setText(categoryModel.getCategoryName());
        // Xữ lý sự kiện nhấn vào item

        holder.layout_itemCategory.setOnClickListener(v -> {
            // Chuyển activity ở đây
            Intent intent = new Intent(mContext, FindActivity.class);
            intent.putExtra("id_category", categoryModel.getIdCategory());
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        if (mListCategoryModel != null)
            return mListCategoryModel.size();
        return 0;
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_itemCategory;
        private TextView txt_itemCategoryName;
        private LinearLayout layout_itemCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            // cài đặt id ở đây
            img_itemCategory = itemView.findViewById(R.id.img_itemCategory);
            txt_itemCategoryName = itemView.findViewById(R.id.txt_itemCategoryName);
            layout_itemCategory = itemView.findViewById(R.id.layout_itemCategory);
        }
    }
}
