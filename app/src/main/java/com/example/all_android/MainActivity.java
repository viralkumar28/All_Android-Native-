package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstValue, secondValue;
    TextView answer;
    Button add, sub, mul, div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue =  findViewById(R.id.editTextNumber);
        secondValue = findViewById(R.id.editTextNumber2);

        answer = findViewById(R.id.textViewResult);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSubtract);
        mul = findViewById(R.id.btnMultiply);
        div = findViewById(R.id.btnDivide);

        add.setOnClickListener(view -> {
            int first, second, result;
            first = Integer.parseInt(firstValue.getText().toString());
            second = Integer.parseInt(secondValue.getText().toString());
            result = first+second;
            answer.setText("Ans is = "+result);
        });
        sub.setOnClickListener(view -> {
            int first, second, result;
            first = Integer.parseInt(firstValue.getText().toString());
            second = Integer.parseInt(secondValue.getText().toString());
            result = first-second;
            answer.setText("Ans is = "+result);
        });
        mul.setOnClickListener(view -> {
            int first, second, result;
            first = Integer.parseInt(firstValue.getText().toString());
            second = Integer.parseInt(secondValue.getText().toString());
            result = first*second;
            answer.setText("Ans is = "+result);
        });
        div.setOnClickListener(view -> {
            int first, second, result;
            first = Integer.parseInt(firstValue.getText().toString());
            second = Integer.parseInt(secondValue.getText().toString());
            result = first/second;
            answer.setText("Ans is = "+result);
        });
    }
}