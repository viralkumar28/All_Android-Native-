package com.example.all_android;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class RecyclerViewExample extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerContactAdapter adapter;
    FloatingActionButton floatingActionButton;
    ArrayList<ContactModel> arrContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_example);

        recyclerView = findViewById(R.id.recyclerContact);
        floatingActionButton = findViewById(R.id.btnOpenDialog);
        //always create layoutmanager for recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));
        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));
        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));
        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));
        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));
        arrContact.add(new ContactModel(R.drawable.img,"Viral","9687050151"));
        arrContact.add(new ContactModel(R.drawable.backside,"Kumar","9687050151"));
        arrContact.add(new ContactModel(R.drawable.image,"Maurya","9687050151"));
        arrContact.add(new ContactModel(R.drawable.calculator,"new","9687050151"));

        adapter = new RecyclerContactAdapter(this,arrContact);
        recyclerView.setAdapter(adapter);


        //Button Open Dialog (Floating action button)
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(RecyclerViewExample.this);
                dialog.setContentView(R.layout.add_update_layout);
                EditText textInputEditText_name = dialog.findViewById(R.id.txtInputEditText_Name);
                EditText textInputEditText_contact = dialog.findViewById(R.id.txtInputEditText_Contact);
                Button buttonSubmitAction = dialog.findViewById(R.id.submit_Details);

                buttonSubmitAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="", number="";
                        if(!textInputEditText_name.getText().toString().equals("")){
                            name = textInputEditText_name.getText().toString();
                        }else{
                            Toast.makeText(RecyclerViewExample.this, "Please enter name", Toast.LENGTH_SHORT).show();
                        }
                        if(!textInputEditText_contact.getText().toString().equals("")){
                            number = textInputEditText_contact.getText().toString();
                        }else{
                            Toast.makeText(RecyclerViewExample.this, "Please enter number", Toast.LENGTH_SHORT).show();
                        }
                        arrContact.add(new ContactModel(name, number));
                        adapter.notifyItemInserted(arrContact.size()-1);
                        recyclerView.scrollToPosition(arrContact.size()-1);
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}