package com.example.all_android;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentPractice extends AppCompatActivity {
        Button btnFragA, btnFragB, btnFragC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_practice);
        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        //Default Fragnment
        loadFragment(new BFragment(), 0);

        btnFragA.setOnClickListener(v -> {
            loadFragment(new AFragment(),1);
        });
        btnFragB.setOnClickListener(v -> {
            loadFragment(new BFragment(),1);
        });
        btnFragC.setOnClickListener(v -> {
            loadFragment(new CFragment(),1);
        });

    }

    public void loadFragment(Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if(flag == 0){
            ft.add(R.id.container, fragment);
        }else{
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }
}