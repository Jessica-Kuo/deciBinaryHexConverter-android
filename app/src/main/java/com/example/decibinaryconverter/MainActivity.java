//Jessica Kuo 2020
package com.example.decibinaryconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;

//use @style/AppTheme to set top app bar back

public class MainActivity extends AppCompatActivity {
    Button BinaryButton;
    Button HexButton;
    EditText decimalVal;
    TextView title;
    TextView decimalText;
    int decimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BinaryButton = (Button) findViewById(R.id.BinaryButton);
        HexButton = (Button) findViewById(R.id.HexButton);
        decimalVal = (EditText) findViewById(R.id.decimalVal);
        title = (TextView) findViewById((R.id.title));
        decimalText = (TextView) findViewById(R.id.decimalText);
    }

    public void openBinaryConversion(View view){
        decimal = Integer.parseInt(decimalVal.getText().toString());
        Intent binaryConversion = new Intent(MainActivity.this, BinaryConversion.class);
        binaryConversion.putExtra("key", decimal);

        startActivity(binaryConversion);
    }

    public void openHexConversion(View view){
        decimal = Integer.parseInt(decimalVal.getText().toString());
        Intent hexConversion = new Intent(MainActivity.this, HexConversion.class);
        hexConversion.putExtra("hex", decimal);

        startActivity(hexConversion);
    }


}