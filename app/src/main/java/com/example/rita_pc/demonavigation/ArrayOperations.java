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

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOperations extends Fragment
{

    EditText mEdtInput, mEdtDisplay, mEdtArray,mEdtOdd, mEdtEven;
    Button mBtnAdd, mBtnDisplay;
    ArrayList<Integer> myList = new ArrayList<Integer>();
    int result = 0, result1 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_array_operations,container,false);

        mEdtInput = (EditText) v.findViewById(R.id.edtInput);
        mEdtDisplay = (EditText) v.findViewById(R.id.edtSort);

        mEdtOdd = (EditText) v.findViewById(R.id.edtOdd);
        mEdtEven = (EditText) v.findViewById(R.id.edtEven);

        mEdtArray= (EditText) v.findViewById(R.id.edtArray);

        mBtnAdd = (Button) v.findViewById(R.id.btnAdd);
        mBtnDisplay = (Button) v.findViewById(R.id.btnDisplay);


        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEdtInput.getText().length()>0) {
                    int num = Integer.parseInt(mEdtInput.getText().toString());

                    myList.add(num);


                    mEdtInput.setText("");
                }
                else
                {
                    Toast.makeText(getContext(),"Please enter the number in field", Toast.LENGTH_LONG).show();
                }


            }

        });


        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdtArray.setText(String.valueOf(myList));
                Collections.sort(myList);
                mEdtDisplay.setText("Sorted Array is:" + myList);

                Integer array[] = myList.toArray(new Integer[myList.size()]);
                {
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            result = result + array[i];
                        } else {
                            result1 = result1 + array[i];
                        }

                    }
                    mEdtEven.setText("Sum Of Even values:" + result);
                    mEdtOdd.setText("Sum Of Odd values :" + result1);


                }
            }
        });

        return v;
    }
}
