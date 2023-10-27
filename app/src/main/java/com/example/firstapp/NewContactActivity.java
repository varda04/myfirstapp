package com.example.firstapp;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.contentcapture.DataRemovalRequest;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewContactActivity extends AppCompatActivity {
    private EditText edtFname, edtLname, edtMobileno, edtEmail;
    TextView edtDOB;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.new_contact_activity);

        edtFname= findViewById(R.id.editfirstname);
        edtLname=findViewById(R.id.editlastname);
        edtMobileno=findViewById(R.id.editmobileno);
        edtEmail=findViewById(R.id.editemailaddress);
        edtDOB=findViewById(R.id.editdateofbirth);
        login=findViewById(R.id.saveid);

        edtDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper db = new DBHelper(NewContactActivity.this);
                db.insertContact(edtFname.getText().toString(),
                        edtLname.getText().toString(),
                        edtMobileno.getText().toString(),
                        edtEmail.getText().toString(),
                        edtDOB.getText().toString());

            }
        });

    }

    public void showDatePicker(){
        DatePickerDialog dpd= new DatePickerDialog(NewContactActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        edtDOB.setText(date+"/"+(month+1)+"/"+year);
                    }
                    }, 2023, 9, 27);
                dpd.show();
                }
    }
