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

public class LengthConversion extends Fragment
{
    EditText mEdtFeet, mEdtInches, mEdtCm;
    Button mBtnConvert;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_length_conversion,container,false);

        mEdtFeet = (EditText) v.findViewById(R.id.edtFeet);
        mEdtInches = (EditText) v.findViewById(R.id.edtInches);
        mEdtCm = (EditText) v.findViewById(R.id.edtCm);
        mBtnConvert = (Button) v.findViewById(R.id.btnConvert);

        mBtnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int feet, inches;
                double cm;

                if (mEdtFeet.getText().length() > 0 && mEdtInches.getText().length() > 0) {
                    feet = Integer.parseInt(mEdtFeet.getText().toString());
                    inches = Integer.parseInt(mEdtInches.getText().toString());

                    cm = (feet * 30.48) + (inches * 2.54);
                    mEdtCm.setText(String.valueOf(cm));

                } else {
                    Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                }
            }
        });




        return v;
    }
}
