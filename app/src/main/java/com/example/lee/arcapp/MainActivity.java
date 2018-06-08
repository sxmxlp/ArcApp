package com.example.lee.arcapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.example.lee.arcapp.adapter.MainContentAdapter;
import com.example.lee.arcapp.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBindg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBindg = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        String[] array = getResources().getStringArray(R.array.main_content);
        List<String> items = Arrays.asList(array);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        mBindg.rvContent.setAdapter(new MainContentAdapter(items));
        mBindg.rvContent.setLayoutManager(lm);
        mBindg.rvContent.setItemAnimator(new DefaultItemAnimator());
        mBindg.rvContent.addItemDecoration(new DividerItemDecoration(this, lm.getOrientation()));
    }
}
