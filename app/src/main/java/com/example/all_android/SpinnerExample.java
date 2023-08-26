package com.example.all_android;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SpinnerExample extends AppCompatActivity {


    AutoCompleteTextView autoCompleteTextView;
    Spinner spinner;
    ArrayList<String> arrID = new ArrayList<>();
    ArrayList<String> language = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example);

        //AutoComplete
        autoCompleteTextView = findViewById(R.id.autoCompleteTxt);
        language.add("hindi");
        language.add("english");
        language.add("gujarati");
        ArrayAdapter<String> lanAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,language);
        autoCompleteTextView.setAdapter(lanAdapter);
        autoCompleteTextView.setThreshold(1);

        //Spinner
        spinner = findViewById(R.id.sp);
        arrID.add("Viral");
        arrID.add("Kumar");
        arrID.add("Maurya");
        arrID.add("Next");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrID);
        spinner.setAdapter(spinnerAdapter);
    }
}