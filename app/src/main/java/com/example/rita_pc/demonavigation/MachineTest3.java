package com.example.rita_pc.demonavigation;

import android.content.Intent;
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

public class MachineTest3 extends Fragment {
    EditText mEdtUser, mEdtPass;
    Button mBtnCancel, mBtnOk;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_machine_test3, container, false);

        mEdtUser = (EditText) v.findViewById(R.id.edtUser);
        mEdtPass = (EditText) v.findViewById(R.id.edtPass);

        mBtnCancel = (Button) v.findViewById(R.id.btnCancel);
        mBtnOk = (Button) v.findViewById(R.id.btnOk);

        mBtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdtUser.setText("");
                mEdtPass.setText("");
            }
        });

        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mEdtPass.getText().toString();
                String pass = mEdtPass.getText().toString();
                if (user.equals("android") && (pass.equals("android"))) {
                    Intent intent = new Intent(getContext(), SelectProduct.class);
                    Bundle b = new Bundle();
                    b.putString("UserName", user);


                    //Add the set of extended data to the intent and start it
                    intent.putExtras(b);//putExtra() hold the value in intent object

                    startActivity(intent);//It is used because we dont want to come back to first Activity
                    //startActivityForResult(intent,REQUEST_CODE);//It is used because we have to come back to the first activity for displaying result.

                } else {
                    Toast.makeText(getContext(), "Invalid UserName or Password!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;
    }
}
