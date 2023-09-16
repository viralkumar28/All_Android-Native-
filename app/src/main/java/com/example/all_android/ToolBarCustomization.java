package com.example.all_android;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class ToolBarCustomization extends AppCompatActivity {

    Toolbar toolbar;
    private Object menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar_customization);

        toolbar = findViewById(R.id.toolbarcustom);
        //step 1
        setSupportActionBar(toolbar);
        //step 2: customization
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Welcome");
        }

    }
    //to show item menu on screen
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //to perform on clicks on menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId == R.id.newgrp){
            Toast.makeText(this, "New Group", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.broadcast) {
            Toast.makeText(this, "Broadcast", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.setting) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
        }else if(itemId == R.id.webwhatsapp){
            Toast.makeText(this, "Web WhatsApp", Toast.LENGTH_SHORT).show();
        }else{

        }
        return super.onOptionsItemSelected(item);
    }
}