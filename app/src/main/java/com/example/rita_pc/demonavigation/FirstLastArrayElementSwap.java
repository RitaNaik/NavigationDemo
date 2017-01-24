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

import java.util.ArrayList;
import java.util.Collections;

public class FirstLastArrayElementSwap extends Fragment {

    EditText mEdtArray,mEdtBefore,mEdtAfter;
    Button mBtnAdd,mBtnSwap;
    ArrayList<Integer> myList=new ArrayList<Integer>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_first_last_array_element_swap,container,false);

        mEdtArray= (EditText) v.findViewById(R.id.edtElements);
        mEdtBefore= (EditText) v.findViewById(R.id.edtBefore);
        mEdtAfter= (EditText) v.findViewById(R.id.edtAfter);

        mBtnAdd= (Button) v.findViewById(R.id.btnAdd);
        mBtnSwap= (Button) v.findViewById(R.id.btnSwap);


        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int values;
                values=Integer.parseInt(mEdtArray.getText().toString());
                myList.add(values);
                mEdtBefore.setText(String.valueOf(myList));

            }
        });
        mBtnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Collections.swap(myList,0,myList.size()-1);
                mEdtAfter.setText(String.valueOf(myList));

            }
        });
        return v;
    }

}
