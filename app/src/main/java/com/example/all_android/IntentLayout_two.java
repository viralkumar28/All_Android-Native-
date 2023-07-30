package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentLayout_two extends AppCompatActivity {

    TextView learn, neet;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_layout_two);

        learn = findViewById(R.id.learn);
        neet = findViewById(R.id.neet);
        Intent intent = getIntent();
        data = intent.getStringExtra("dataname");

        learn.setText("Practice to "+data);
        neet.setText("Learn with "+data);
    }
}