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

public class CheckCharacter extends Fragment
{

    EditText mEdtInput, mEdtResult;
    Button mBtnCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_check_character,container,false);

        mEdtInput = (EditText) v.findViewById(R.id.edtInput);
        mEdtResult = (EditText) v.findViewById(R.id.edtResult);
        mBtnCheck = (Button) v.findViewById(R.id.btnCheck);


        mBtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(mEdtInput.getText().length()>0) {
                    char ch = mEdtInput.getText().charAt(0);
                    if (ch >= 48 && ch <= 57) {
                        mEdtResult.setText("Entered character is Digit");
                    } else if (ch >= 65 && ch <= 90) {
                        mEdtResult.setText("Entered character is Capital Letter");

                    } else if (ch >= 97 && ch <= 122) {
                        mEdtResult.setText("Entered character is Small Case Letter");

                    } else if (ch >= 0 && ch <= 47) {
                        mEdtResult.setText("Entered character is Special Symbol");

                    } else if (ch >= 58 && ch <= 64) {
                        mEdtResult.setText("Entered character is Special Symbol");

                    } else if (ch >= 91 && ch <= 96) {
                        mEdtResult.setText("Entered character is digit");

                    } else if (ch >= 123 && ch <= 127) {
                        mEdtResult.setText("Entered character is digit");


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
