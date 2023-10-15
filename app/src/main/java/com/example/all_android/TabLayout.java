package com.example.all_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.example.all_android.Adapters.ViewPagerMessengerAdapter;

public class TabLayout extends AppCompatActivity {

    com.google.android.material.tabs.TabLayout tab;
    ViewPager viewPager;
    ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);
        //for sliding effect
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
    }
}