package com.example.all_android;

import android.app.AlertDialog;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AlertDialogBox extends AppCompatActivity {

 
    Button end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_box);

         end = findViewById(R.id.end);
         end.setOnClickListener(view -> new AlertDialog.Builder(AlertDialogBox.this)
                 .setIcon(R.drawable.warning)
                 .setTitle("END")
                 .setMessage("Are you sure?")
                 .setPositiveButton("YES", (dialogInterface, i) -> finish()).setNegativeButton("NO", (dialogInterface, i) -> dialogInterface.dismiss()).show());
    }
}