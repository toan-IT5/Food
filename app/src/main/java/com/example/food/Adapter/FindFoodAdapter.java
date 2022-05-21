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

import com.example.food.Activity.SalesmanDetailActivity;
import com.example.food.Model.SalesmanModel;
import com.example.food.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FindFoodAdapter extends RecyclerView.Adapter<FindFoodAdapter.FindFoodViewHolder>{
    private Context mContext;
    private List<SalesmanModel> mListSalesman;

    public FindFoodAdapter(Context mContext) {
        this.mContext = mContext;
    }
    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<SalesmanModel> mListSalesman){
        this.mListSalesman = mListSalesman;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FindFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_find_food, parent, false);
        return new FindFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FindFoodViewHolder holder, int position) {
        SalesmanModel item = mListSalesman.get(position);
        if (item == null)
            return;
        // xữ lý ở đây
        Picasso.get().load(item.getImage()).into(holder.img_findFoodImage);
        holder.txt_findShopName.setText(item.getName_store());
        holder.txt_findShopDescription.setText("300ml");
        holder.layout_findFoodLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SalesmanDetailActivity.class);
                intent.putExtra("obj_salesman", item);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListSalesman != null)
            return mListSalesman.size();
        return 0;
    }

    public class FindFoodViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_findFoodImage;
        private TextView txt_findShopName, txt_findShopDescription;
        private LinearLayout layout_findFoodLayout;

        public FindFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img_findFoodImage = itemView.findViewById(R.id.img_findFoodImage);
            txt_findShopName = itemView.findViewById(R.id.txt_findShopName);
            txt_findShopDescription = itemView.findViewById(R.id.txt_findShopDescription);
            layout_findFoodLayout = itemView.findViewById(R.id.layout_findFoodLayout);
        }
    }
}
