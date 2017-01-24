package com.example.rita_pc.demonavigation;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertInDB extends Fragment
{
    EditText mEdtUser,mEdtPass;
    DataHelp dh;
    Button mBtnLogin,mBtnRegister;
    private static final int REQUEST_CODE=10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_insert_in_db,container,false);
        mEdtUser = (EditText) v.findViewById(R.id.edtUser);
        mEdtPass= (EditText) v.findViewById(R.id.edtPass1);
        mBtnRegister= (Button) v.findViewById(R.id.btnRegister);
        mBtnLogin= (Button) v.findViewById(R.id.btnLogin);
        dh=new DataHelp(getContext());

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(getContext(),RegisterUser.class);
                startActivityForResult(i,REQUEST_CODE);
            }
        });

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(getContext(),ModifyData.class);
                Boolean result=dh.checkLogin(mEdtUser.getText().toString(),mEdtPass.getText().toString());


                if(result)
                {
                    mToast("Valid User");
                }
                else
                {
                    mToast("Invalid User");
                }
                startActivity(i);


            }
        });


    //@Override
    /*protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE)
        {
            if (data.hasExtra("Username"))//hasExtra() is used to check bundle data
            {
                String k = data.getExtras().getString("Username");
                Toast.makeText(this,"Username is"+k,Toast.LENGTH_LONG).show();



            }
        }
    }
*/

        return v;
    }
    public void mToast(String message)
    {
        Toast.makeText(getContext(),message,Toast.LENGTH_LONG).show();
    }


}
