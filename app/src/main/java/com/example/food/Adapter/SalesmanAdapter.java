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
import com.example.food.Model.SalerModel;
import com.example.food.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SalesmanAdapter extends RecyclerView.Adapter<SalesmanAdapter.SalesmanViewHolder> {
    private List<SalerModel> mListSalesman;
    private final Context mContext;

    public SalesmanAdapter(Context mContext) {
        this.mContext = mContext;
    }
    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<SalerModel> list){
        this.mListSalesman = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SalesmanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_salesman, parent, false);
        return new SalesmanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SalesmanViewHolder holder, int position) {
        SalerModel item = mListSalesman.get(position);
        if (item == null)
            return;
        // Code sử lý ở dây


        Picasso.get().load(item.getImage()).into(holder.img_itemSalesmanImage);

        holder.txt_itemSalesmanName.setText(item.getName_store());

        holder.layout_itemSalesmanLayout.setOnClickListener(new View.OnClickListener() {
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

    public static class SalesmanViewHolder extends RecyclerView.ViewHolder {
        private final LinearLayout layout_itemSalesmanLayout;
        private final ImageView img_itemSalesmanImage;
        private final TextView txt_itemSalesmanName;
        public SalesmanViewHolder(@NonNull View itemView) {
            super(itemView);
            layout_itemSalesmanLayout = itemView.findViewById(R.id.layout_itemSalesmanLayout);
            img_itemSalesmanImage = itemView.findViewById(R.id.img_itemSalesmanImage);
            txt_itemSalesmanName = itemView.findViewById(R.id.txt_itemSalesmanName);
        }
    }
}
