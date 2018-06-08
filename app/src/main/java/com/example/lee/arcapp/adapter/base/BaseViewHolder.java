package com.example.lee.arcapp.adapter.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

public class BaseViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    public final T binding;
    public BaseViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
