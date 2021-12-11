package com.nymul.digitalbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btndigi,btndigi2,btndigi3,btndigi4,btndigi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btndigi =findViewById(R.id.btndigi);
        btndigi2 =findViewById(R.id.btndigi2);
        btndigi3 =findViewById(R.id.btndigi3);
        btndigi4 =findViewById(R.id.btndigi4);
        btndigi5 =findViewById(R.id.btndigi5);


        btndigi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                btndigi.setText("Digital Bangladesh implies the broad use of computers, and embodies the modern philosophy of effective and useful use of technology in terms of implementing the promises in education, health, job placement and poverty reduction.");
            }
        });

        btndigi2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                btndigi2.setText("This component will deal with three broad issues of Digital Bangladesh namely i) access to market, ii) promotion of ICT business to support Digital Bangladesh and iii) ICT as an export oriented sector.\nThe government further emphasized on the four elements of “Digital Bangladesh Vision” which are human resource development, people involvement, civil services and use of information technology in business.");
            }
        });

        btndigi3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                btndigi3.setText("Bangladesh has significantly changed in the e-governance system in the last decade both in public and private sectors. Now a day's almost all ministries are under fiber optic cable which provides high speed internet connection within the office. Internet service has been spreading up all over the country.");
            }
        });
        btndigi4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                btndigi4.setText("Sylhet is all set to become Bangladesh's first Wifi city because, a week from now, the service will be available for free at 126 points across the city.");
            }
        });

        btndigi5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                btndigi5.setText("Vision Group is a leading manufacturer and exporter of woven and knit apparels from Bangladesh with an annual turnover of about 70 million US dollars.");
            }
        });


    }
}