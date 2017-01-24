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

public class MonthlyTelephoneBill extends Fragment
{

    EditText mEdtCalls,mEdtBill;
    Button mBtnBill;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_monthly_telephone_bill,container,false);

        mEdtCalls= (EditText) v.findViewById(R.id.edtCalls);
        mEdtBill= (EditText) v.findViewById(R.id.edtBill);
        mBtnBill= (Button) v.findViewById(R.id.btnBill);

        mBtnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int calls;
                double bill;

                if (mEdtCalls.getText().length() > 0) {
                    calls = Integer.parseInt(mEdtCalls.getText().toString());
                    if (calls <= 100) {
                        bill = 200 * calls;
                        mEdtBill.setText(String.valueOf(bill));
                    } else if (calls > 100 && calls <= 150) {
                        calls = calls - 100;
                        bill = 200 + (0.60 * calls);
                        mEdtBill.setText(String.valueOf(bill));
                    } else if (calls > 150 && calls <= 200) {
                        calls = calls - 100;
                        bill = 200 + (0.50 * calls);
                        mEdtBill.setText(String.valueOf(bill));
                    } else if (calls > 200) {
                        calls = calls - 100;
                        bill = 200 + (0.40 * calls);
                        mEdtBill.setText(String.valueOf(bill));
                    }
                } else {
                    Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                }
            }
        });


        return v;
    }
}
