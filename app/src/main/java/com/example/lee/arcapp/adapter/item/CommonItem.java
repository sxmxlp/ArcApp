package com.example.lee.arcapp.adapter.item;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lee.arcapp.BR;
import com.example.lee.arcapp.R;
import com.example.lee.arcapp.adapter.base.BaseViewHolder;
import com.example.lee.arcapp.adapter.item.base.Item;
import com.example.lee.arcapp.databinding.ListItemCommonBinding;
import com.example.lee.arcapp.util.ActivityUtils;

public final class CommonItem implements Item<String> {
    private static CommonItem INSTANCE;
    private CommonItem() {

    }

    public static CommonItem factory() {
        synchronized (CommonItem.class) {
            if (INSTANCE == null) {
                INSTANCE = new CommonItem();
            }
            return INSTANCE;
        }
    }

    @Override
    public int getLayout() {
        return R.layout.list_item_common;
    }

    @Override
    public void bind(final BaseViewHolder holder, String data) {
        holder.binding.setVariable(BR.item, data);
        holder.binding.executePendingBindings();
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.startActivity(v.getContext(), holder.getLayoutPosition());
            }
        });
    }

    @Override
    public BaseViewHolder createViewHolder(@NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemCommonBinding binding = DataBindingUtil.inflate(inflater, getLayout(), parent, false);
        return new BaseViewHolder<>(binding);
    }
}
