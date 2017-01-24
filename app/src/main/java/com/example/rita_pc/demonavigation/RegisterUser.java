package com.example.rita_pc.demonavigation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterUser extends Activity
{
    EditText mEdtUsernm,mEdtPasswd;
    Button mBtnOk;
    DataHelp dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        mEdtUsernm = (EditText) findViewById(R.id.edtFirst);
        mEdtPasswd = (EditText) findViewById(R.id.edtPass1);

        dh = new DataHelp(this);
    }
    public void clickOK(View v)
    {
        Intent intent=new Intent(this,MainActivity.class);

        Bundle b=new Bundle();
        dh.LoginInsert(mEdtUsernm.getText().toString(),mEdtPasswd.getText().toString());

        b.putString("Username",mEdtUsernm.getText().toString());
        intent.putExtras(b);
        setResult(RESULT_OK,intent);

        finish();
    }
    
}
