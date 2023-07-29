package com.example.all_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class CustomToolBar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tool_bar);


         androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case
                    R.id.newgrp:
                Toast.makeText(this, "New Group", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.broadcast:
                Toast.makeText(this, "Broadcast", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.setting:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.webwhatsapp:
                Toast.makeText(this, "Web WhatsApp", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}