package com.example.rita_pc.demonavigation;

import android.content.Context;
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

public class AreaOfCircle extends Fragment
{
    EditText mEdtRadius,mEdtArea;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate
                (R.layout.activity_area_of_circle,container,false);

        mEdtRadius= (EditText) v.findViewById(R.id.edtRadius);
        mEdtArea= (EditText) v.findViewById(R.id.edtArea);
        mBtnResult= (Button) v.findViewById(R.id.btnArea);
        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double radius,area;

                if(mEdtRadius.getText().length()>0) {
                    radius = Integer.parseInt(mEdtRadius.getText().toString());
                    area = 3.14 * radius * radius;

                    mEdtArea.setText(String.valueOf(area));
                }
                else
                {
                    Toast.makeText(getContext(), "Please enter input in all the fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        return v;
    }
}
