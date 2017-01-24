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

import java.util.Random;

public class GenerateRandomNo extends Fragment {

    EditText mEdtResult;
    Button mBtnGenerate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_generate_random_no,container,false);

        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mBtnGenerate= (Button) v.findViewById(R.id.btnGenerate);

        mBtnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r=new Random();
                for(int i=10;i<100;i++)
                {
                    int num=r.nextInt(100)+1;
                    mEdtResult.setText(String.valueOf(num));
                }
            }
        });



        return v;
    }
}
