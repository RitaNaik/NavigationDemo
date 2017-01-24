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
import android.widget.TextView;
import android.widget.Toast;

public class MachineTest2 extends Fragment
{
    EditText mEdtProductName, mEdtProductPrice, mEdtProductQuantity;//mEdtDisplayPrice,mEdtTotal,mEdtDisp;
    Button mBtnSAveProduct,mBtnTotal;
    Spinner spinner;
    TextView mTxtDispPrice,mTxtDispTotal,mTxtDisp,mTxtDisp1,mTxtDisp2,mTxtDisp3,mTxtDisp4;
    int counter = 0,quantity=0,total=0;
    String[] productName = new String[5];
    Integer[] price = new Integer[5];


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_machine_test2,container,false);

        mEdtProductName = (EditText) v.findViewById(R.id.edtProductName);
        mEdtProductPrice = (EditText) v.findViewById(R.id.edtProductPrice);
        //mEdtDisplayPrice= (EditText) findViewById(R.id.edtPrice);
        mEdtProductQuantity = (EditText) v.findViewById(R.id.edtQty);
        // mEdtTotal= (EditText) findViewById(R.id.edtTotal);
        // mEdtDisp= (EditText) findViewById(R.id.edtDisp);

        mTxtDisp= (TextView) v.findViewById(R.id.txtDisp);
        mTxtDispPrice= (TextView) v.findViewById(R.id.txtDispPrice);
        mTxtDispTotal= (TextView) v.findViewById(R.id.txtDispAmount);
        mTxtDisp1= (TextView) v.findViewById(R.id.txtDisp1);
        mTxtDisp2= (TextView) v.findViewById(R.id.txtDisp2);
        mTxtDisp3= (TextView) v.findViewById(R.id.txtDisp3);
        mTxtDisp4= (TextView) v.findViewById(R.id.txtDisp4);

        mBtnSAveProduct = (Button) v.findViewById(R.id.btnSave);
        mBtnTotal= (Button) v.findViewById(R.id.btnTotal);
        spinner = (Spinner) v.findViewById(R.id.spinner);


        mBtnSAveProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter !=5)
                {
                    productName[counter] = mEdtProductName.getText().toString();
                    price[counter]=Integer.parseInt(mEdtProductPrice.getText().toString());
                    //Toast.makeText(this, "Product is" + productName[counter], Toast.LENGTH_LONG).show();
                    //Toast.makeText(this, "Product is" + productName, Toast.LENGTH_LONG).show();
                    mEdtProductName.setText("");
                    mEdtProductPrice.setText("");
                    counter++;

                }
                else
                {
                    mEdtProductName.setText("");
                    mEdtProductPrice.setText("");
                    Toast.makeText(getContext(),"Array is full",Toast.LENGTH_SHORT).show();
                    mEdtProductName.setClickable(false);
                    mEdtProductName.setEnabled(false);
                    mEdtProductName.setFocusable(false);

                    mEdtProductPrice.setClickable(false);
                    mEdtProductPrice.setEnabled(false);
                    mEdtProductPrice.setFocusable(false);
                }
                ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(getContext(), android.R.layout.simple_spinner_dropdown_item, productName);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner.setAdapter(adapter);

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                    {
                        // String selected=parent.getItemAtPosition(position).toString();
                        // mEdtDisplayPrice.setText(String.valueOf(price[position]));
                        mTxtDispPrice.setText("Rs."+String.valueOf(price[i]));
                        //quantity=Integer.parseInt(mEdtProductQuantity.getText().toString());
       /*int pos=spinner.getSelectedItemPosition();
        if(pos==0)
        {
            total=quantity*price[pos];
            mEdtTotal.setText(String.valueOf(total));
        }
        switch (position)
        {
            case 0:
                    total=quantity*price[position];
                    mEdtTotal.setText(String.valueOf(total));
                    break;
        }*/

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }
        });

        mBtnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                quantity=Integer.parseInt(mEdtProductQuantity.getText().toString());
                int pos=spinner.getSelectedItemPosition();
                int id= (int) spinner.getSelectedItemId();
                switch (pos)
                {
                    case 0:
                        total=total+quantity*price[pos];
                        // mEdtTotal.setText(String.valueOf(total));
                        mTxtDispTotal.setText("Rs."+String.valueOf(total));
                        break;
                    case 1:
                        total=total+quantity*price[pos];
                        // mEdtTotal.setText(String.valueOf(total));
                        mTxtDispTotal.setText("Rs."+String.valueOf(total));
                        break;
                    case 2:
                        total=total+quantity*price[pos];
                        //mEdtTotal.setText(String.valueOf(total));
                        mTxtDispTotal.setText("Rs."+String.valueOf(total));
                        break;
                    case 3:
                        total=total+quantity*price[pos];
                        // mEdtTotal.setText(String.valueOf(total));
                        mTxtDispTotal.setText("Rs."+String.valueOf(total));
                        break;
                    case 4:
                        total=total+quantity*price[pos];
                        //mEdtTotal.setText(String.valueOf(total));
                        mTxtDispTotal.setText("Rs."+String.valueOf(total));
                        break;

                }
                //String selected=spinner.getItemAtPosition(pos).toString();
                //mTxtDisp.setText(String.valueOf(selected+" "+price[pos])+" "+quantity);
                if(id==0)
                {
                    String selected=spinner.getItemAtPosition(pos).toString();
                    mTxtDisp.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                }
                else if(id==1)
                {
                    String selected=spinner.getItemAtPosition(pos).toString();
                    mTxtDisp1.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                }
                else if(id==2)
                {
                    String selected=spinner.getItemAtPosition(pos).toString();
                    mTxtDisp2.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                }
                else if(id==3)
                {
                    String selected=spinner.getItemAtPosition(pos).toString();
                    mTxtDisp3.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                }
                else if(id==4)
                {
                    String selected=spinner.getItemAtPosition(pos).toString();
                    mTxtDisp4.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                }


              /* String selected=spinner.getItemAtPosition(pos).toString();
               String selected1=spinner.getItemAtPosition(pos).toString();
               //mEdtDisp.setText(String.valueOf(selected+" "+String.valueOf(price[pos])+" "+pos));
                mTxtDisp.setText(String.valueOf(selected+"  "+price[pos])+"  "+quantity);
                mTxtDisp1.setText(String.valueOf(selected1+"  "+price[pos])+"  "+quantity);*/



            }
        });

        return v;
    }
}
