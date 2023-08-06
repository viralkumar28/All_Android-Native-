package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImpliciteIntents extends AppCompatActivity {
        Button share;
        TextView quote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicite_intents);

        share = findViewById(R.id.share);
        quote = findViewById(R.id.textViewQuote);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sharetxt = quote.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, sharetxt);
                startActivity(intent);
            }
        });
    }
}