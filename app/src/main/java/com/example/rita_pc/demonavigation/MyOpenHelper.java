package com.example.rita_pc.demonavigation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RITA-PC on 26/12/2016.
 */

public class MyOpenHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "EmployeeDatabase";
    private static final int DATABASE_VERSION = 1;
    public static final String L_TABLE_NAME = "Login";
    public static final String INFO_TABLE_NAME = "EmployeeInfo";
    Context context;

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create table Login(Username Text,Password Text)");
        sqLiteDatabase.execSQL("Create table EmployeeInfo(Emp_ID Integer,Emp_Name Text,Emp_Department Text)");

        /*ContentValues cv = new ContentValues();
        cv.put("Username", "rita");
        cv.put("Password", "naik");

        long result = sqLiteDatabase.insert(L_TABLE_NAME, null, cv);

        if (result >= 0) {
            mToast("Insertion Successful....");
        } else {
            mToast("Insertion fail!!!!!!!!!");
        }
    }
    public void mToast(String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("Drop table if exists " + L_TABLE_NAME);
        sqLiteDatabase.execSQL("Drop table if exists " + INFO_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
