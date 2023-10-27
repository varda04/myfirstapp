package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView txtHlo;
    EditText edtTxtFName;
    EditText edtTxtLName;
    TextView txtemail;
    EditText edtTxtMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_contact_activity);

        txtHlo= findViewById(R.id.textViewHlo);
        edtTxtFName= findViewById(R.id.edttxtfname);
        edtTxtLName= findViewById(R.id.edttxtlname);
        txtemail=findViewById(R.id.textViewMail);
        edtTxtMail=findViewById(R.id.edttxtemail);

    }

    public void contact_list_activity(){

    }
    public void onBtnClick(View view){

        txtHlo.setText("hello "+edtTxtFName.getText().toString()+" "+edtTxtLName.getText().toString());

        txtemail.setText("you mail id has been set to: "+edtTxtMail.getText().toString());
    }


}