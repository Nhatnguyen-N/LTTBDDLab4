package com.example.listviewdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LanguageAdapter extends BaseAdapter {
    public LanguageAdapter(Context ctx, int layoutItem, ArrayList<Language> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItem;
    ArrayList<Language> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tx1);
        TextView tvShopName = view.findViewById(R.id.tx2);
        ImageView imgGoods = view.findViewById(R.id.logo);

        tvName.setText(arrayList.get(i).getName());
        tvShopName.setText(arrayList.get(i).getShopNames());
        imgGoods.setImageResource(arrayList.get(i).getImage());
        return view;
    }
}
