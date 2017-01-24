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

public class CompoundInterest extends Fragment
{

    EditText mEdtAmount,mEdtRate,mEdtTime,mEdtYears,mEdtResult;
    Button mBtnCalculate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_compound_interest,container,false);

        mEdtAmount= (EditText) v.findViewById(R.id.edtAmount);
        mEdtRate= (EditText) v.findViewById(R.id.edtAnnualRate);
        mEdtTime= (EditText) v.findViewById(R.id.edtTime);
        mEdtYears= (EditText) v.findViewById(R.id.edtYears);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);

        mBtnCalculate= (Button) v.findViewById(R.id.btnCalculate);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double p,r,n,t,A,pow,N;
                p=Double.parseDouble(mEdtAmount.getText().toString());
                r=Double.parseDouble(mEdtRate.getText().toString());
                n=Double.parseDouble(mEdtTime.getText().toString());
                t=Double.parseDouble(mEdtYears.getText().toString());

                N=(1+(r/n));
                pow=n*t;
                A=p*(Math.pow(N,pow));
                mEdtResult.setText(String.valueOf(A));

            }
        });
        return v;

    }
}
