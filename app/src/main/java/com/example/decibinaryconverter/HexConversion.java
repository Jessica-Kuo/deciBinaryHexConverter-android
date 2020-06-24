package com.example.decibinaryconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.*;

import androidx.appcompat.app.AppCompatActivity;

public class HexConversion extends AppCompatActivity {
    TextView title;
    TextView hexResult;
    int temp;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hex_conversion);
        title = (TextView) findViewById(R.id.title);
        hexResult = (TextView) findViewById(R.id.hexResult);

        Intent hexConversion = getIntent();
        temp = hexConversion.getIntExtra("hex", -1);
        result = Integer.toHexString(temp);

        hexResult.setText(result.toUpperCase());
    }
}
