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

public class GrossSalaryCalculation extends Fragment {

    EditText mEdtSalary,mEdtGross;
    Button mBtnCalculate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_gross_salary_calculation,container,false);

        mEdtSalary= (EditText) v.findViewById(R.id.edtSalary);
        mEdtGross= (EditText) v.findViewById(R.id.edtGross);
        mBtnCalculate= (Button) v.findViewById(R.id.btnCalculate);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sal;
                if (mEdtSalary.getText().length() > 0) {
                    sal = Integer.parseInt(mEdtSalary.getText().toString());
                    double GrossSalary;
                    if (sal > 1 && sal < 4000) {
                        double hra = 0.1, da = 0.5, pf = 0.15, tax = 0.02;
                        GrossSalary = (sal + (sal * hra) + (sal * da)) - ((pf * sal) + (sal * tax));
                        mEdtGross.setText(String.valueOf(GrossSalary));
                    } else if (sal >= 4001 && sal <= 8000) {
                        double hra = 0.2, da = 0.6, pf = 0.1, tax = 0.05;
                        GrossSalary = (sal + (sal * hra) + (sal * da)) - ((pf * sal) + (sal * tax));
                        mEdtGross.setText(String.valueOf(GrossSalary));
                    } else if (sal >= 8001 && sal <= 12000) {
                        double hra = 0.25, da = 0.7, pf = 0.1, tax = 0.08;
                        GrossSalary = (sal + (sal * hra) + (sal * da)) - ((pf * sal) + (sal * tax));
                        mEdtGross.setText(String.valueOf(GrossSalary));
                    } else if (sal > 12000) {
                        double hra = 0.3, da = 0.8, pf = 0.15, tax = 0.1;
                        GrossSalary = (sal + (sal * hra) + (sal * da)) - ((pf * sal) + (sal * tax));
                        mEdtGross.setText(String.valueOf(GrossSalary));
                    }
                } else {
                    Toast.makeText(getContext(), "Please enter the input in all fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;

    }
}
