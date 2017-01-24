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

public class ArmStrongNo extends Fragment
{
    EditText mEdtDisplay;
    Button mBtnDisplay;
    ArrayList myList=new ArrayList();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.activity_arm_strong_no,container,false);

        mEdtDisplay= (EditText) v.findViewById(R.id.edtDisplay);
        mBtnDisplay= (Button) v.findViewById(R.id.btnDisplay);

        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=1;i<500;i++)
                {
                    int temp=i,mod=0,sum=0;
                    while(temp!=0)
                    {
                        mod = temp % 10;
                        sum = sum + (mod * mod * mod);
                        temp = temp / 10;
                    }
                    if (sum == i)
                    {

                        myList.add(i);

                    }
                }
                mEdtDisplay.setText(String.valueOf(myList));
            }
        });
        return v;
    }
}
