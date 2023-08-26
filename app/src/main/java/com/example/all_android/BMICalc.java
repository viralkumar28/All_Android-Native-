package com.example.all_android;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BMICalc extends AppCompatActivity {

    TextView result;
    EditText edWeight, edHeight;
    Button submitResult;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);

        edHeight = findViewById(R.id.height);
        edWeight = findViewById(R.id.weight);
        result = findViewById(R.id.textresult);
        submitResult = findViewById(R.id.submitBtn);

        submitResult.setOnClickListener(view -> {
            int height =  Integer.parseInt(edHeight.getText().toString());
            int weight = Integer.parseInt(edWeight.getText().toString());
            double bmi = (double) weight /(height*height);
            if(bmi>25){
                result.setText("You are overweight");
            }else if(bmi<18){
                result.setText("You are underweight");
            }else{
                result.setText("You are healthy");
            }

        });



    }
}