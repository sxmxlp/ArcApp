package com.example.lee.arcapp.adapter.item.base;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.example.lee.arcapp.adapter.base.BaseViewHolder;

public interface Item<T> {
    @LayoutRes int getLayout();
    void bind(BaseViewHolder holder, T data);
    BaseViewHolder createViewHolder(@NonNull ViewGroup parent);
}
