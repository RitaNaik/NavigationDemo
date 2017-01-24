package com.example.rita_pc.demonavigation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ModifyData extends Activity
{
    DataHelp dh;
    EditText mEdtId, mEdtName, mEdtDept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_data);

        mEdtId = (EditText) findViewById(R.id.edtEmpID);
        mEdtName = (EditText) findViewById(R.id.edtEmpName);
        mEdtDept = (EditText) findViewById(R.id.edtEmpDept);

        dh = new DataHelp(this);
    }

    public void clickInsert(View v) {
        dh.EmpInsert(mEdtId.getText().toString(), mEdtName.getText().toString(), mEdtDept.getText().toString());
        mEdtId.setText("");
        mEdtName.setText("");
        mEdtDept.setText("");
    }

    public void clickUpdate(View v) {
        dh.EmpUpdate(mEdtId.getText().toString(), mEdtName.getText().toString(), mEdtDept.getText().toString());
    }

    public void clickDelete(View v) {
        dh.EmpDelete(mEdtId.getText().toString());
    }

    public void clickDisplay(View v) {
        Intent i = new Intent(this, DisplayRecords.class);
        Bundle b = new Bundle();
        List<String> names = this.dh.display();
        b.putStringArrayList("names", (ArrayList<String>) names);
        i.putExtras(b);
        startActivity(i);
    }

}
