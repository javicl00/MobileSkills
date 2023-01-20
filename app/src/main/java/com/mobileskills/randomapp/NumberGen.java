package com.mobileskills.randomapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumberGen extends AppCompatActivity {
    Intent actualIntent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_gen);

        Button generateBtn = (Button) findViewById(R.id.generarBtn);
        Button backBtn = (Button) findViewById(R.id.backBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String minNumber = ((EditText) findViewById(R.id.minNumberText)).getText().toString();
                String maxNumber = ((EditText) findViewById(R.id.maxNumberText)).getText().toString();
                if (minNumber.isEmpty() && maxNumber.isEmpty()) {
                    int randomNum = (int) (Math.random() * (100 - 0 + 1) + 0);
                    numbers.add(randomNum+"");
                    TextView randomNumView = (TextView) findViewById(R.id.numberTextView);
                    randomNumView.setText(String.valueOf(randomNum));
                    System.out.println(randomNum);
                    System.out.println("lista:\n");
                    for (int i = 0; i < numbers.size(); i++) {
                        System.out.println(numbers.get(i));
                    }
                    System.out.println("fin lista");

                } else if (minNumber.isEmpty()) {
                    int randomNum = (int) (Math.random() * (Integer.parseInt(maxNumber) - 0 + 1) + 0);
                    numbers.add(randomNum+"");
                    TextView randomNumView = (TextView) findViewById(R.id.numberTextView);
                    randomNumView.setText(String.valueOf(randomNum));
                    System.out.println(randomNum);
                } else if (maxNumber.isEmpty()) {
                    int randomNum = (int) (Math.random() * (100 - Integer.parseInt(minNumber) + 1) + Integer.parseInt(minNumber));
                    numbers.add(randomNum+"");
                    TextView randomNumView = (TextView) findViewById(R.id.numberTextView);
                    randomNumView.setText(String.valueOf(randomNum));
                    System.out.println(randomNum);


                } else {
                    int randomNum = (int) (Math.random() * (Integer.parseInt(maxNumber) - Integer.parseInt(minNumber) + 1) + Integer.parseInt(minNumber));
                    numbers.add(randomNum+"");
                    TextView randomNumView = (TextView) findViewById(R.id.numberTextView);
                    randomNumView.setText(String.valueOf(randomNum));
                    System.out.println(randomNum);


                }
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}