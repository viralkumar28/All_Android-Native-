package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onClickListners extends AppCompatActivity {

    Button btnFirst, btnWay;
    TextView txtSecond, txtWayOne, txtThird, txtWayTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click_listners);

        btnFirst = findViewById(R.id.btnFirst);
        btnWay = findViewById(R.id.btnWay);
        txtSecond = findViewById(R.id.txtSecond);
        txtWayOne = findViewById(R.id.txtWay1);
        txtThird = findViewById(R.id.txtThird);
        txtWayTwo = findViewById(R.id.txtWay2);

        btnFirst.setOnClickListener(view -> Toast.makeText(onClickListners.this, "First Button is Clicked", Toast.LENGTH_SHORT).show());
        btnWay.setOnClickListener(view -> Toast.makeText(onClickListners.this, "Way button is clicked", Toast.LENGTH_SHORT).show());
        txtSecond.setOnClickListener(view -> Toast.makeText(onClickListners.this, "Second txt is clicked", Toast.LENGTH_SHORT).show());
        txtWayOne.setOnClickListener(view -> Toast.makeText(onClickListners.this, "Way one is clicked", Toast.LENGTH_SHORT).show());
        txtThird.setOnClickListener(view -> Toast.makeText(onClickListners.this, "Third text is clicked", Toast.LENGTH_SHORT).show());
        txtWayTwo.setOnClickListener(view -> Toast.makeText(onClickListners.this, "Second way is clicked", Toast.LENGTH_SHORT).show());
    }
}