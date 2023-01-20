package com.mobileskills.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.zip.Inflater;

public class numberListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_list_view);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        String[] num;
        Intent numberList = getIntent();
        num = numberList.getStringArrayExtra("com.mobileskills.randomapp.numbers");
        ArrayAdapter<CharSequence> aa = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, num);
        myListView.setAdapter(aa);

    }


}
