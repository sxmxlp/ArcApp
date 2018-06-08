package com.example.lee.arcapp.adapter.base;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;

import com.example.lee.arcapp.adapter.item.CommonItem;
import com.example.lee.arcapp.adapter.item.base.Item;

import java.util.HashMap;

public abstract class BaseAdapter<Data> extends RecyclerView.Adapter<BaseViewHolder> {

    private HashMap<Integer, Item> map = new HashMap<>();

    public BaseAdapter() {
        fillAllItemType();
    }

    private void fillAllItemType() {
        map.put(CommonItem.factory().getLayout(), CommonItem.factory());
    }

    protected Item getItemByViewType(@LayoutRes int viewType) {
        return map.get(viewType);
    }
}
