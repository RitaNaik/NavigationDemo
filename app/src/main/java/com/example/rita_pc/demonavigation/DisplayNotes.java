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

public class DisplayNotes extends Fragment {

    EditText mEdtamount,mEdt500,mEdt100,mEdt50,mEdt20,mEdt10,mEdt5,mEdt1;
    Button mBtnDisplay;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_display_notes,container,false);

        mEdtamount= (EditText) v.findViewById(R.id.edtAmount);
        mEdt500= (EditText) v.findViewById(R.id.edt500);
        mEdt100= (EditText) v.findViewById(R.id.edt100);
        mEdt50= (EditText) v.findViewById(R.id.edt50);
        mEdt20= (EditText) v.findViewById(R.id.edt20);
        mEdt10= (EditText) v.findViewById(R.id.edt10);
        mEdt5= (EditText) v.findViewById(R.id.edt5);
        mEdt1= (EditText) v.findViewById(R.id.edt1);
        mBtnDisplay= (Button) v.findViewById(R.id.btnDisplay);

        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount, num;

                if (mEdtamount.getText().length() > 0) {
                    amount = Integer.parseInt(mEdtamount.getText().toString());
                    while (amount >= 500) {
                        num = amount / 500;
                        amount = amount % 500;
                        mEdt500.setText(String.valueOf(num));
                        break;
                    }
                    while (amount >= 100) {
                        num = amount / 100;
                        amount = amount % 100;
                        mEdt100.setText(String.valueOf(num));
                        break;
                    }
                    while (amount >= 50) {
                        num = amount / 50;
                        amount = amount % 50;
                        mEdt50.setText(String.valueOf(num));
                        break;
                    }
                    while (amount >= 20) {
                        num = amount / 20;
                        amount = amount % 20;
                        mEdt20.setText(String.valueOf(num));
                        break;
                    }
                    while (amount >= 10) {
                        num = amount / 10;
                        amount = amount % 10;
                        mEdt10.setText(String.valueOf(num));
                        break;
                    }
                    while (amount >= 5) {
                        num = amount / 5;
                        amount = amount % 5;
                        mEdt5.setText(String.valueOf(num));
                        break;
                    }

                    while (amount >= 1) {
                        num = amount / 1;
                        amount = amount % 1;
                        mEdt1.setText(String.valueOf(num));
                        break;
                    }
                } else {
                    Toast.makeText(getContext(), "Please enter the input", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;
    }
}
