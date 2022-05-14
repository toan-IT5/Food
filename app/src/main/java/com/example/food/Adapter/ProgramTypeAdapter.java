package com.example.food.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.Model.ProgramTypeModel;
import com.example.food.Model.SalesmanModel;
import com.example.food.R;

import java.util.List;

public class ProgramTypeAdapter extends RecyclerView.Adapter<ProgramTypeAdapter.ProgramTypeViewHolder> {
    private Context mContext;
    private List<ProgramTypeModel> mListProgramType;

    public ProgramTypeAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<ProgramTypeModel> list){
        this.mListProgramType = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProgramTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_program, parent, false);
        return new ProgramTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramTypeViewHolder holder, int position) {
        ProgramTypeModel item = mListProgramType.get(position);
        if (item == null)
            return;
        // Gán dữ liệu lên view
        holder.txt_itemProgramName.setText(item.getProgram_name());

        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcv_itemProgramList.setLayoutManager(layoutManager);

        SalesmanAdapter adapter = new SalesmanAdapter(mContext);
        if (item.getListSales() != null)
            adapter.setData(item.getListSales());
        holder.rcv_itemProgramList.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        if (mListProgramType != null)
            return mListProgramType.size();
        return 0;
    }

    public class ProgramTypeViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        private TextView txt_itemProgramName;
        private RecyclerView rcv_itemProgramList;
        public ProgramTypeViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.layout_itemProgramCategoryLayout);
            txt_itemProgramName = itemView.findViewById(R.id.txt_itemProgramName);
            rcv_itemProgramList = itemView.findViewById(R.id.rcv_itemProgramList);
        }
    }
}
