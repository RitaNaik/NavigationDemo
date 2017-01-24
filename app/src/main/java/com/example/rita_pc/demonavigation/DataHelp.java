package com.example.rita_pc.demonavigation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RITA-PC on 26/12/2016.
 */

public class DataHelp
{
    SQLiteDatabase db;
    Context myContext;
    ArrayList<String> info=new ArrayList<>();

    public DataHelp(Context myContext) {
        this.myContext = myContext;
        SQLiteOpenHelper myHelper = new MyOpenHelper(this.myContext);
        this.db = myHelper.getWritableDatabase();
    }

    public void LoginInsert(String username, String password) {
        ContentValues con = new ContentValues();
        con.put("Username", username);
        con.put("Password", password);

        long newresult = db.insert(MyOpenHelper.L_TABLE_NAME, null, con);

        if (newresult >= 0) {
            mToast("Insertion Successful...");
        } else {
            mToast("Insertion fail!!!!!!");
        }

    }

    public Boolean checkLogin(String unm, String p) {
        Boolean result = false;

        Cursor c = db.rawQuery("Select * from Login", null);

        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    String uid = c.getString(c.getColumnIndex("Username"));
                    String pass = c.getString(c.getColumnIndex("Password"));

                    if (uid.equals(unm) && pass.equals(p)) {
                        result = true;
                        break;

                    }
                } while (c.moveToNext());

            }
        } else {
            result = false;
        }
        c.close();

        return result;
    }

    public void EmpInsert(String Eid, String Ename, String Edept) {
        ContentValues cv = new ContentValues();
        cv.put("Emp_ID", Integer.parseInt(Eid));
        cv.put("Emp_Name", Ename);
        cv.put("Emp_Department", Edept);

        long row = db.insert(MyOpenHelper.INFO_TABLE_NAME, null, cv);
        if (row >= 0) {
            mToast("Insertion Successful....");
        } else {
            mToast("Insertion Failed!!!!");
        }

    }

    public void EmpUpdate(String Eid, String Ename, String Edept) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Emp_ID", Integer.parseInt(Eid));
        contentValues.put("Emp_Name", Ename);
        contentValues.put("Emp_Department", Edept);

        String where = " Emp_ID =" + Eid;
        int result = db.update(MyOpenHelper.INFO_TABLE_NAME, contentValues, where, null);

        if (result >= 0) {
            mToast("Record Updated Successfully....");
        } else {
            mToast("Record NOT updated!!!!!");
        }

    }

    public void EmpDelete(String Eid) {
        String where = "Emp_ID =" + Eid;
        int check = db.delete(MyOpenHelper.INFO_TABLE_NAME, where, null);
        if (check == 0) {
            mToast("Record is NOT Deleted");
        } else {
            mToast("Record deleted Successfully...");
        }
        display();
    }

    public List<String> display()
    {
        info.clear();
        Cursor c=db.rawQuery("Select * from EmployeeInfo",null);


        if(c!=null)
        {
            if(c.moveToFirst())
            {
                do {
                    String id=c.getString(c.getColumnIndex("Emp_ID"));
                    String name=c.getString(c.getColumnIndex("Emp_Name"));
                    String dept=c.getString(c.getColumnIndex("Emp_Department"));
                    info.add(id+"  "+name+"  "+dept);
                }while(c.moveToNext());
            }
        }
        else
        {
            mToast("Table has no contents");
        }
        c.close();
        return info;
    }


    public void mToast(String msg)
    {
        Toast.makeText(myContext,msg, Toast.LENGTH_LONG).show();
    }

}
