package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toasty extends AppCompatActivity {

    Button byDefault, simpleToast, nestedToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);

        byDefault = findViewById(R.id.bydefault);
        simpleToast = findViewById(R.id.simpleGravity);
        nestedToast = findViewById(R.id.newstedToast);

        byDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Toasty.this, "By Default Toast", Toast.LENGTH_SHORT).show();
            }
        });
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Toasty.this, "Simple Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });
        nestedToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Toasty.this, "Simple Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
                toast.show();
            }
        });


    }
}