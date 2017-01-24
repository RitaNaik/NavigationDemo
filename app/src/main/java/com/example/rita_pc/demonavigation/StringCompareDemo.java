package com.example.rita_pc.demonavigation;

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

public class StringCompareDemo extends Fragment
{
    EditText mEdtFirst,mEdtSecond;
    Button mBtnCheck;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_string_compare_demo,container,false);

        mEdtFirst= (EditText) v.findViewById(R.id.edtFirstStr);
        mEdtSecond= (EditText) v.findViewById(R.id.edtSecondStr);
        mBtnCheck= (Button) v.findViewById(R.id.btnCheck);

        mBtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1,str2;
                str1=mEdtFirst.getText().toString();
                str2=mEdtSecond.getText().toString();
                if(str1.equals(str2))
                {
                    Toast.makeText(getContext(),"Two Strings Are Equal....",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getContext(),"Two Strings Are NOT Equal!!!!!",Toast.LENGTH_LONG).show();
                }
            }
        });




        return v;
    }
}
