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

public class SimpleInterest extends Fragment
{
    EditText mEdtAmount,mEdtRate,mEdtPeriod,mEdtResult;
    Button mBtnCalculate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_simple_interest,container,false);

        mEdtAmount= (EditText) v.findViewById(R.id.edtAmount);
        mEdtRate= (EditText) v.findViewById(R.id.edtRate);
        mEdtPeriod= (EditText) v.findViewById(R.id.edtPeriod);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mBtnCalculate= (Button) v.findViewById(R.id.btnCalculate);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount,rate,period,SI;

                if(mEdtAmount.getText().length()>0 && mEdtRate.getText().length()>0) {
                    if (mEdtPeriod.getText().length() > 0) {
                        amount = Integer.parseInt(mEdtAmount.getText().toString());
                        rate = Integer.parseInt(mEdtRate.getText().toString());
                        period = Integer.parseInt(mEdtPeriod.getText().toString());

                        SI = (amount * rate * period) / 100;
                        mEdtResult.setText(String.valueOf(SI));
                    } else {
                        Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }
}
