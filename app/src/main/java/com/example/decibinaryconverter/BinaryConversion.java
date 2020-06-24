package com.example.decibinaryconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.*;

import androidx.appcompat.app.AppCompatActivity;

public class BinaryConversion extends AppCompatActivity {
    TextView title;
    TextView binaryResult;
    int temp;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binary_conversion);
        title = (TextView) findViewById(R.id.title);
        binaryResult = (TextView) findViewById(R.id.binaryResult);

        Intent binaryConversion = getIntent();
        temp = binaryConversion.getIntExtra("key", -1);
        result = Integer.toBinaryString(temp);

        binaryResult.setText(result);
    }
    }
