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

public class FahrenheitToCelcius extends Fragment {

    EditText mEdtInput,mEdtOutput;
    Button mBtnCalculate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_fahrenheit_to_celcius,container,false);

        mEdtInput= (EditText) v.findViewById(R.id.edtInput);
        mEdtOutput= (EditText) v.findViewById(R.id.edtOutput);

        mBtnCalculate= (Button) v.findViewById(R.id.btnCalculate);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float fah,cel;
                if(mEdtInput.getText().length()>0) {
                    fah = Float.parseFloat(mEdtInput.getText().toString());
                    cel = (fah - 32) * 5 / 9;
                    mEdtOutput.setText(String.valueOf(cel));
                }
                else {
                    Toast.makeText(getContext(), "Please enter the input", Toast.LENGTH_LONG).show();
                }
            }
        });



        return v;
    }
}
