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

public class GradeOfSteel extends Fragment
{
    EditText mEdtHardness, mEdtCarbon, mEdtTensile, mEdtGrade;
    Button mBtnGrade;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_grade_of_steel,container,false);

        mEdtHardness = (EditText) v.findViewById(R.id.edtHardness);
        mEdtCarbon = (EditText) v.findViewById(R.id.edtCarbon);
        mEdtTensile = (EditText) v.findViewById(R.id.edtTensile);
        mEdtGrade = (EditText) v.findViewById(R.id.edtGrade);

        mBtnGrade = (Button) v.findViewById(R.id.btnGrade);

        mBtnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hardness, tensile;
                double carbon;

                if (mEdtHardness.getText().length() > 0 && mEdtCarbon.getText().length() > 0) {
                    if (mEdtTensile.getText().length() > 0) {
                        hardness = Integer.parseInt(mEdtHardness.getText().toString());
                        carbon = Double.parseDouble(mEdtCarbon.getText().toString());
                        tensile = Integer.parseInt(mEdtTensile.getText().toString());
                        if (hardness > 50) {
                            if (carbon < 0.7) {
                                if (tensile > 5600) {
                                    mEdtGrade.setText("Grade is 10");
                                } else {
                                    mEdtGrade.setText("Grade is 9");
                                }
                            } else {
                                if (tensile > 5600) {
                                    mEdtGrade.setText("Grade is 7");
                                } else {
                                    mEdtGrade.setText("Grade is 6");
                                }
                            }
                        } else {
                            if (carbon < 0.7) {
                                if (tensile > 5600) {
                                    mEdtGrade.setText("Grade is 8");
                                } else {
                                    mEdtGrade.setText("Grade is 6");
                                }
                            } else {
                                if (tensile > 5600) {
                                    mEdtGrade.setText("Grade is 6");
                                } else {
                                    mEdtGrade.setText("Grade is 5");
                                }
                            }
                        }
                    } else {
                        Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;

    }
}
