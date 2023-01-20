package com.mobileskills.randomapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NumberAdapter extends BaseAdapter {

    LayoutInflater mInflater;

    public NumberAdapter(Context c) {
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return numbers.size();
    }

    @Override
    public Object getItem(int i) {
        return numbers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return numbers.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.name_text_view_adapter, null);
        TextView numTextView = (TextView) v.findViewById(R.id.numAdapterTextView);
        String name = numbers.get(i);




        return v;
    }


}
