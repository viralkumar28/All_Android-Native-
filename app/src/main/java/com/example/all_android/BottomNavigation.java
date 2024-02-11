package com.example.all_android;

import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.all_android.NavFragment.*;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import org.jetbrains.annotations.NotNull;

public class BottomNavigation extends AppCompatActivity {

    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bnView = findViewById(R.id.bnView);
        bnView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home) {
                loadFrag(new HomeFragment(), false);
            } else if (id == R.id.nav_search) {
                loadFrag(new SearchFragment(), false);
            } else if (id == R.id.nav_utilize) {
                loadFrag(new UtilityFragment(), false);
            } else if (id == R.id.nav_contact) {
                loadFrag(new ContactFragment(), false);
            } else { //Profile
                loadFrag(new ProfileFragment(), true);
            }
            return true;
        });

        bnView.setSelectedItemId(R.id.nav_profile);

    }


    //reduced data redundancy
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag)
            ft.add(R.id.containerFL, fragment);
        else
            ft.replace(R.id.containerFL,fragment);
        ft.commit();
    }
}