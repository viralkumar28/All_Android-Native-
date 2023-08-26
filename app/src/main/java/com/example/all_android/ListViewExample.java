package com.example.all_android;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ListViewExample extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        listView = findViewById(R.id.listview);
        arrNames.add("Viral");
        arrNames.add("Kumar");
        arrNames.add("Maurya");
        arrNames.add("Next");
        arrNames.add("Viral");
        arrNames.add("Kumar");
        arrNames.add("Maurya");
        arrNames.add("Next");
        arrNames.add("Viral");
        arrNames.add("Kumar");
        arrNames.add("Maurya");
        arrNames.add("Next");
        arrNames.add("Viral");
        arrNames.add("Kumar");
        arrNames.add("Maurya");
        arrNames.add("Next");

        ArrayAdapter<String> adapter= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(ListViewExample.this, "First Item Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}