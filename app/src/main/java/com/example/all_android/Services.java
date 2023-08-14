package com.example.all_android;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat;

public abstract class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Intent intent = new Intent(this, ServiceExample.class);
        ContextCompat.startForegroundService(this, intent);


    }


    public abstract int onStart(Intent intent, int flags, int startId);
}