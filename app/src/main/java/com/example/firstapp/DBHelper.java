package com.example.firstapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

//Database creation and linkage

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="Contact_db";
    public static final int DB_VERSION=1;
//    super(context,name,factory,version)
    public DBHelper(@Nullable Context context){
        //this method creates the database
        super(context,DB_NAME, null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //creation of table
        String query= "create table contact(firstname text(20), lastname text(20), mobileno text(10), email text(30), dob text(20))";
        sqLiteDatabase.execSQL(query);

    }

    public void insertContact(String firstName,
                              String lastName,
                              String mobileNo,
                              String emailAddress,
                              String dob){
        SQLiteDatabase db= getWritableDatabase();
//put function()
        ContentValues cv= new ContentValues();
        cv.put("firstname", firstName);
        cv.put("lastname", lastName);
        cv.put("mobileno", mobileNo);
        cv.put("email", emailAddress);
        cv.put("dob", dob);

        //syntax for putting contentvalues: cv.put ("column_name", local variable pertaining to that column)
        //check constraints of db.insert()
        long id= db.insert("contact",null, cv);
        Log.d("test", id+"");

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
