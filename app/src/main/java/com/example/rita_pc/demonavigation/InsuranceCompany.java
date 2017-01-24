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

public class InsuranceCompany extends Fragment
{
    EditText mEdtHealth, mEdtAge, mEdtLivesIn, mEdtGender, mEdtResult;
    Button mBtnCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_insurance_company,container,false);

        mEdtHealth = (EditText) v.findViewById(R.id.edtHealth);
        mEdtAge = (EditText) v.findViewById(R.id.edtAge);
        mEdtLivesIn = (EditText) v.findViewById(R.id.edtLivesIn);
        mEdtGender = (EditText) v.findViewById(R.id.edtGender);
        mEdtResult = (EditText) v.findViewById(R.id.edtCheck);

        mBtnCheck = (Button) v.findViewById(R.id.btnCheck);

        mBtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String health, lives_In, gender;
                int age;
                if (mEdtHealth.getText().length() > 0 && mEdtLivesIn.getText().length() > 0) {
                    if (mEdtGender.getText().length() > 0 && mEdtAge.getText().length() > 0) {
                        health = mEdtHealth.getText().toString();
                        lives_In = mEdtLivesIn.getText().toString();
                        gender = mEdtGender.getText().toString();
                        age = Integer.parseInt(mEdtAge.getText().toString());

                        if (health.equals("excellent") && (age >= 25 && age <= 35)) {
                            if (lives_In.equals("city") && gender.equals("male")) {
                                mEdtResult.setText("Person should be insured.." + " " + " Premium rate is Rs.4 per 1000.." + " " + "Maximum Amount is Rs.2 Lakhs");
                            } else if (lives_In.equals("city") && gender.equals("female")) {
                                mEdtResult.setText("Person should be insured.." + " " + " Premium rate is Rs.3 per 1000.." + " " + "Maximum Amount is Rs.1 Lakh");
                            }
                        } else if (health.equals("poor") && (age >= 25 && age <= 35)) {
                            if (lives_In.equals("village") && gender.equals("male")) {
                                mEdtResult.setText("Person should be insured.." + " " + " Premium rate is Rs.6 per 1000.." + " " + "Maximum Amount is Rs.10,000");
                            } else {
                                mEdtResult.setText("Person should NOT be insured..");
                            }
                        } else {
                            mEdtResult.setText("Person should NOT be insured..");
                        }
                    } else {
                        Toast.makeText(getContext(), "Please enter input in all the fields", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Please enter input in all the fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }
}
