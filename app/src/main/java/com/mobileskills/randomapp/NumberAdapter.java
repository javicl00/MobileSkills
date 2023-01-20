package com.mobileskills.randomapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NumberAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] numbers;

    public NumberAdapter(Context c, String[] i) {
        numbers = i;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

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
        TextView numTextView = (TextView) v.findViewById(R.id.numAdapterTextView);

        String name = numbers[i];




        return v;
    }


}
