package com.example.lee.arcapp.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.example.lee.arcapp.adapter.base.BaseAdapter;
import com.example.lee.arcapp.adapter.base.BaseViewHolder;
import com.example.lee.arcapp.adapter.item.CommonItem;
import com.example.lee.arcapp.adapter.item.base.Item;

import java.util.List;

public class MainContentAdapter extends BaseAdapter<String> {
    private List<String> items;

    public MainContentAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Item item = super.getItemByViewType(viewType);
        if (item != null) {
            return item.createViewHolder(parent);
        }
        return CommonItem.factory().createViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        String data = items.get(position);
        Item item = super.getItemByViewType(getItemViewType(position));
        item.bind(holder, data);
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return CommonItem.factory().getLayout();
    }
}
