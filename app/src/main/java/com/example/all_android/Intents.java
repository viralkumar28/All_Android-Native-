package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intents extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        tv = findViewById(R.id.textViewIntent);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tv.getText().toString();
                Intent intent = new Intent(Intents.this, IntentLayout_two.class);
                intent.putExtra("dataname", data);
                startActivity(intent);
            }
        });
    }
}