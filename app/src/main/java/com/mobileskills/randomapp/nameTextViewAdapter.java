package com.mobileskills.randomapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class nameTextViewAdapter extends BaseAdapter{
    LayoutInflater mInflater;
    String[] numbers;

    public nameTextViewAdapter(LayoutInflater mInflater, String[] n) {
        this.numbers = n;
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int i) {
        return numbers[i];
    }

    @Override
    public long getItemId(int i) {
        return numbers[i].hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.name_text_view_adapter, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.numAdapterTextView);

        String name = numbers[i];

        nameTextView.setText(name);

        return v;
    }


}
