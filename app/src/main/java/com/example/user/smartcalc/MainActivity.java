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

    static String SystemOfNumeration ( String a, String b, String c) {

        int n = 0;

        int p = 0;

        int q = 0;

        String N1 = "-1234567890abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUV";

        String ch = "";

        for ( int i = 0; i < a.length(); i++) {

            for ( int z = 0; z < N1.length(); z++) {

                if ( a.charAt(i) == N1.charAt(z) ) {

                    q ++;

                } } }

        for ( int i = 0; i < b.length(); i++) {

            for ( int z = 0; z < N1.length(); z++) {

                if ( b.charAt(i) == N1.charAt(z) ) {

                    p ++;

                } } }

        if ( q != a.length() || p != b.length() || (q != a.length() && p != b.length()) || Integer.parseInt(c, 32) % 32 >= Integer.parseInt(a)) {

            ch = "Неправильные вxодные данные";
        }



        else if ( q == a.length() && p == b.length()) {


            if ( (Integer.parseInt(a) < 2 || Integer.parseInt(a) > 32)  || (Integer.parseInt(b) > 32 || Integer.parseInt(b) < 2) || (Integer.parseInt(a) < 2 && Integer.parseInt(b) > 32) || (Integer.parseInt(b) < 2 && Integer.parseInt(a) > 32) ) {


                if (Integer.parseInt(a) < 2) {

                    ch = "Системы счисления с основанием " + a + " не существует";

                }

                if ( Integer.parseInt(b) > 32) {

                    ch = "Системы счисления с основанием " + b + " не существует";
                }

                if (Integer.parseInt(a) < 2 && Integer.parseInt(b) > 32) {

                    ch = "Таких систем счисления не существует";
                }

                if ( Integer.parseInt(b) < 2) {

                    ch = "Системы счисления с основанием " + b + " не существует";
                }

                if ( Integer.parseInt(a) > 32) {

                    ch = "Системы счисления с основанием " + a + " не существует";
                }

                if (Integer.parseInt(b) < 2 && Integer.parseInt(a) > 32) {

                    ch = "Таких систем счисления не существует";
                }

            }

            else  {

                for ( int i = 0; i < c.length(); i++) {

                    for ( int z = 0; z < N1.length(); z++) {

                        if ( c.charAt(i) == N1.charAt(z) ) {

                            n ++;

                        } } }

                if ( n == c.length()) {

                    ch = Long.toString(Long.parseLong(c, Integer.parseInt(a)), Integer.parseInt(b));

                }

                else {

                    ch = "Недопустимый символ"; } } }

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

                String z = SystemOfNumeration(S1, S2 ,S3);

                myTX.setText(z);

            }
        };

        myBT.setOnClickListener(oclBtn);




    }

}