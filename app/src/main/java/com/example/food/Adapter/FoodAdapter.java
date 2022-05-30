package com.example.food.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.Model.FoodModel;
import com.example.food.R;
import com.example.food.Util.DBLocal.DataLocalManager;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{
    private Context mContext;
    private List<FoodModel> mListFood;

    public FoodAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<FoodModel> list){
        this.mListFood = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodModel item = mListFood.get(position);
        if (item == null)
            return;

        Picasso.get().load(item.getImage()).into(holder.img_itemFoodImage);
        holder.txt_itemFoodName.setText(item.getFood_name());

        holder.txt_itemFoodPrice.setText(String.format("%,d", item.getPrice()) + " đ");
        holder.layout_itemFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<FoodModel> tmp = DataLocalManager.getListFood();
                tmp.add(item);
                DataLocalManager.putListFood(tmp);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListFood != null)
            return mListFood.size();
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout layout_itemFood;
        private TextView txt_itemFoodName,txt_itemFoodPrice;
        private ImageView img_itemFoodImage;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_itemFoodName = itemView.findViewById(R.id.txt_itemFoodName);
            txt_itemFoodPrice = itemView.findViewById(R.id.txt_itemFoodPrice);
            img_itemFoodImage = itemView.findViewById(R.id.img_itemFoodImage);
            layout_itemFood = itemView.findViewById(R.id.layout_itemFood);
        }
    }
}
