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
import android.widget.TextView;
import android.widget.Toast;

public class CheckEvenOrOdd extends Fragment
{
    EditText mEdtNumber,mEdtResult;
    Button mBtnCheck;
    TextView mTxtResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_check_even_or_odd,container,false);

        mEdtNumber= (EditText) v.findViewById(R.id.edtNumber);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mBtnCheck= (Button) v.findViewById(R.id.btnCheck);

        mBtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no;
                if(mEdtNumber.getText().length()>0) {
                    no = Integer.parseInt(mEdtNumber.getText().toString());
                    if (no % 2 == 0) {
                        mEdtResult.setText("Number is Even");
                    } else {
                        mEdtResult.setText("Number is Odd");
                    }
                }
                else {
                    Toast.makeText(getContext(), "Please enter input in all the fields", Toast.LENGTH_LONG).show();
                }
            }
        });


        return v;


    }
}
