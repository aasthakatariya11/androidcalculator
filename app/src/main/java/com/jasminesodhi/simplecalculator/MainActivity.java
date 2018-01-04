package com.jasminesodhi.simplecalculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    TextView result;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    EditText e1;
    EditText e2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        e1= (EditText) findViewById(R.id.first_number);
        e2= (EditText) findViewById(R.id.second_number);
        tv= (TextView) findViewById(R.id.textView_result);
    }

    void add(View view)
    {
        String s1= String.valueOf(e1.getText());
        String s2= String.valueOf(e2.getText());
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int z= x+y;
        tv.setText(z+"");


    }
    void subtract(View view) {
        String s1 = String.valueOf(e1.getText());
        String s2 = String.valueOf(e2.getText());
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int z = x - y;
        tv.setText(z + "");

    }
    void multiply(View view)
        {
            String s1= String.valueOf(e1.getText());
            String s2= String.valueOf(e2.getText());
            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            int z= x*y;
            tv.setText(z+"");


        }
    void divide(View view)
    {
        String s1= String.valueOf(e1.getText());
        String s2= String.valueOf(e2.getText());
        double x = Double.parseDouble(s1);
        double y = Double.parseDouble(s2);

            double z= x/y;
            tv.setText(z+"");



    }


}

