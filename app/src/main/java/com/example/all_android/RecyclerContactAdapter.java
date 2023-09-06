package com.example.all_android;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.textName.setText(arrContacts.get(position).name);
        holder.textNumber.setText(arrContacts.get(position).number);

        holder.llRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_update_layout);
                EditText textInputEditText_name = dialog.findViewById(R.id.txtInputEditText_Name);
                EditText textInputEditText_contact = dialog.findViewById(R.id.txtInputEditText_Contact);
                Button buttonSubmitAction = dialog.findViewById(R.id.submit_Details);
                TextView tv = dialog.findViewById(R.id.txtTitle);

                tv.setText("Update Contact");
                buttonSubmitAction.setText("Update");
                textInputEditText_name.setText(arrContacts.get(position).name);
                textInputEditText_contact.setText(arrContacts.get(position).number);

                buttonSubmitAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="", number="";
                        if(!textInputEditText_name.getText().toString().equals("")){
                            name = textInputEditText_name.getText().toString();
                        }else{
                            Toast.makeText(context, "Please enter name", Toast.LENGTH_SHORT).show();
                        }
                        if(!textInputEditText_contact.getText().toString().equals("")){
                            number = textInputEditText_contact.getText().toString();
                        }else{
                            Toast.makeText(context, "Please enter number", Toast.LENGTH_SHORT).show();
                        }
                        arrContacts.set(position, new ContactModel(name, number));
                        notifyItemChanged(position);
                        dialog.dismiss();

                    }
                });

                dialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textName, textNumber;
        ImageView imgContact;
        LinearLayout llRow;
        public ViewHolder(View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.contactName);
            textNumber = itemView.findViewById(R.id.contactNumber);
            imgContact = itemView.findViewById(R.id.contactImage);
            llRow = itemView.findViewById(R.id.llRow);
        }
    }
}
