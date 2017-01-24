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

public class InsureDriver extends Fragment
{
    EditText mEdtMaritalStatus,mEdtGender, mEdtAge,mEdtResult;
    //RadioGroup mRadioStatus,mRadioGender;
    // TextView mTxtResult;
    Button mBtnCheck;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_insure_driver,container,false);

        mEdtMaritalStatus= (EditText) v.findViewById(R.id.edtStatus);
        mEdtGender= (EditText) v.findViewById(R.id.edtGender);
        mEdtAge= (EditText) v.findViewById(R.id.edtAge);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);

        mBtnCheck= (Button) v.findViewById(R.id.btnCheck);

        mBtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marital_status,gender;
                int age;

                marital_status=mEdtMaritalStatus.getText().toString();

                gender=mEdtGender.getText().toString();

                age=Integer.parseInt(mEdtAge.getText().toString());

        /*int radioStatusID=mRadioStatus.getCheckedRadioButtonId();

        RadioButton mRadioStatusButton= (RadioButton) findViewById(radioStatusID);

        marital_status= mRadioStatusButton.getText().toString();

       int radioGenderID=mRadioGender.getCheckedRadioButtonId();

        RadioButton mRadioGenderButton= (RadioButton) findViewById(radioGenderID);

        gender=mRadioGenderButton.getText().toString();

        age=Integer.parseInt(mEdtAge.getText().toString());*/

                if(marital_status.equals("married"))
                {
                    mEdtResult.setText("Driver is insured");
                    mEdtMaritalStatus.setText("");
                    mEdtGender.setText("");
                    mEdtAge.setText("");
                }
                else if( marital_status.equals("unmarried") && gender.equals("male"))
                {
                    if(age>30)
                    {
                        mEdtResult.setText("Driver is insured");
                        mEdtMaritalStatus.setText("");
                        mEdtGender.setText("");
                        mEdtAge.setText("");
                    }
                    else {
                        mEdtResult.setText("Driver is NOT insured!!");
                        mEdtMaritalStatus.setText("");
                        mEdtGender.setText("");
                        mEdtAge.setText("");
                    }
                }
                else if( marital_status.equals("unmarried") && gender.equals("female"))
                {

                    if(age>25) {
                        mEdtResult.setText("Driver is insured");
                        mEdtMaritalStatus.setText("");
                        mEdtGender.setText("");
                        mEdtAge.setText("");
                    }
                    else {
                        mEdtResult.setText("Driver is NOT insured!!!");
                        mEdtMaritalStatus.setText("");
                        mEdtGender.setText("");
                        mEdtAge.setText("");
                    }
                }
            }
        });

        return v;
    }
}
