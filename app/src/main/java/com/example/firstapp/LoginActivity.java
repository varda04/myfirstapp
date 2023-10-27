package com.example.firstapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    Button btnLogin;
    EditText edtPassword;
    EditText edtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        setContentView(R.layout.login);
        edtUserName= findViewById(R.id.edtusename);
        edtPassword = findViewById(R.id.edtpass);
        btnLogin= findViewById(R.id.LOGIN);



        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                        String username= edtUserName.getText().toString();
                        String password= edtPassword.getText().toString();
                        if(username.equalsIgnoreCase(password)){
                            //nextractivity
                            Intent i= new Intent(LoginActivity.this, ContactListActivity.class);
                            startActivity(i);
                        }
                        else{
                            Toast.makeText(LoginActivity.this,
                            "username and password not the same",
                            Toast.LENGTH_SHORT).show();
                        }

            }
        });
    }
}
