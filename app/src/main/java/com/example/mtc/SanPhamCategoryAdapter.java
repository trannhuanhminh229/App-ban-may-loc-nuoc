package com.example.mtc;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SanPhamCategoryAdapter extends RecyclerView.Adapter<SanPhamCategoryAdapter.SanPhamCategoryViewHolder> {

    private Context mContext;
    private List<SanPhamCategory> mlistSanPhamCategory;
    private SanPhamAdapter sanPhamAdapter;


//    public SanPhamCategoryAdapter(List<SanPhamCategory> mlistSanPhamCategory) {
//
//        this.mlistSanPhamCategory = mlistSanPhamCategory;
//    }
//
    public SanPhamCategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

//    public SanPhamCategoryAdapter(TrangChuFragment trangChuFragment) {
//    }

    public void setData(List<SanPhamCategory> list) {
        this.mlistSanPhamCategory =list;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public SanPhamCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sanpham_category, parent, false);
        return new SanPhamCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanPhamCategoryViewHolder holder, int position) {
        SanPhamCategory sanPhamCategory = mlistSanPhamCategory.get(position);
        if (sanPhamCategory == null) {
            return;
        }

        holder.textView.setText(sanPhamCategory.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcvSanPham.setLayoutManager((linearLayoutManager));

        sanPhamAdapter = new SanPhamAdapter(    mContext, getListItemSanPham());
        sanPhamAdapter.setData(getListItemSanPham());

        SanPhamAdapter sanPhamAdapter = new SanPhamAdapter(mContext, getListItemSanPham());
        sanPhamAdapter.setData(sanPhamCategory.getList());

        holder.rcvSanPham.setAdapter(sanPhamAdapter);

    }

    private List<SanPham> getListItemSanPham() {
        List<SanPham> list = new ArrayList<>();
        return list;

    }

    @Override
    public int getItemCount() {
        if (mlistSanPhamCategory != null) {
            return mlistSanPhamCategory.size();
        }
        return 0;
    }

    public static class SanPhamCategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private RecyclerView rcvSanPham;

        public SanPhamCategoryViewHolder(@NonNull View itemView) {

            super(itemView);
            textView = itemView.findViewById(R.id.name_sanpham_category);
            rcvSanPham = itemView.findViewById(R.id.rcv_sanpham);
        }
    }

}
