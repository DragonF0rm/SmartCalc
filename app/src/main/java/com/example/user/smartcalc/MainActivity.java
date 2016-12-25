package com.example.user.smartcalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTX;
    Button myBT;
    EditText ch1;
    EditText ch2;
    EditText ch3;

    static String SystemOfNumeration ( int a, int b, long c) {

        String ch = "";

        if ( a == 10) {

            switch(b) {

                case 2 : ch=Long.toString(c,2);

                    break;

                case 8 : ch=Long.toString(c,8);

                    break;

                case 16 : ch=Long.toString(c,16);

                    break;

            }

        }


        if ( a == 2) {

            String S = Long.toString(c);



            switch(b) {

                case 10 : ch = Long.toString(Long.parseLong(S, 2));

                    break;

                case 8 : ch = Long.toString((Long.parseLong(S, 2)),8);

                    break;

                case 16 : ch = Long.toString((Long.parseLong(S, 2)),16);

                    break;

            }

        }



        if ( a == 16) {

            String S = Long.toString(c);

            switch(b) {

                case 2 : ch = Long.toString((Long.parseLong(S, 16)),2);

                    break;

                case 8 : ch = Long.toString((Long.parseLong(S, 16)),8);

                    break;

                case 10 : ch = Long.toString(Long.parseLong(S, 16));

                    break;

            }

        }

        if ( a == 8) {

            String S = Long.toString(c);

            switch(b) {

                case 2 : ch = Long.toString((Long.parseLong(S, 8)),2);

                    break;

                case 10 : ch = Long.toString(Long.parseLong(S, 8));

                    break;

                case 16 : ch = Long.toString((Long.parseLong(S, 8)),16);

                    break;

            }

        }






        return ch;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTX = (TextView) findViewById(R.id.myTX);
        myBT = (Button) findViewById(R.id.myBT);
        ch1 = (EditText) findViewById(R.id.ch1);
        ch2 = (EditText) findViewById(R.id.ch2);
        ch3 = (EditText) findViewById(R.id.ch3);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String S1 = ch1.getText().toString();

                String S2 = ch2.getText().toString();

                String S3 = ch3.getText().toString();

                int a = Integer.parseInt(S1);

                int b = Integer.parseInt(S2);

                int c = Integer.parseInt(S3);

                String z = SystemOfNumeration(a, b ,c);

                myTX.setText(z);

            }
        };

        myBT.setOnClickListener(oclBtn);




    }

}