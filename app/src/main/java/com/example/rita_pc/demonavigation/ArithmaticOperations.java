package com.example.rita_pc.demonavigation;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ArithmaticOperations extends Fragment
{
    EditText mEdtResult,mEdtFirst,mEdtSecond;
    Spinner s;
    Button mBtnDisplay;
    String item;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_arithmatic_operations,container,false);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mEdtFirst= (EditText) v.findViewById(R.id.edtFirst);
        mEdtSecond= (EditText) v.findViewById(R.id.edtSecond);

        mBtnDisplay= (Button) v.findViewById(R.id.btnDisplay);

        s= (Spinner) v.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.Operations,R.layout.support_simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                item=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double no1,no2,result;

                if(mEdtFirst.getText().length()>0) {
                    no1 = Integer.parseInt(mEdtFirst.getText().toString());
                    no2 = Integer.parseInt(mEdtSecond.getText().toString());

                    if (item.equals("Addition")) {
                        result = no1 + no2;
                        mEdtResult.setText("Addition is :" + result);
                    } else if (item.equals("Subtraction")) {
                        result = no1 - no2;
                        mEdtResult.setText("Subtraction is :" + result);
                    } else if (item.equals("Multiplication")) {
                        result = no1 * no2;
                        mEdtResult.setText("Multiplication is :" + result);
                    } else if (item.equals("Division")) {
                        result = no1 / no2;
                        mEdtResult.setText("Division is :" + result);
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
