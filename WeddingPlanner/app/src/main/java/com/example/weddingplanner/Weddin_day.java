package com.example.weddingplanner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Calendar;

import androidx.annotation.Nullable;


public class Weddin_day extends Activity {
    Calendar cal;

AlarmClock alarmClock;
ContactsContract itay;

    android.net.Uri Uri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weddin_day);
        ImageButton btn1=findViewById(R.id.Btn1);
        ImageButton btn2=findViewById(R.id.Btn2);
        ImageButton btn3=findViewById(R.id.Btn3);
        ImageButton btn4=findViewById(R.id.Btn4);
        ImageButton btn5=findViewById(R.id.Btn5);
        ImageButton btn6=findViewById(R.id.Btn6);
        ImageButton btn7=findViewById(R.id.Btn7);
        TextView text1=findViewById(R.id.text1);
        TextView text2=findViewById(R.id.text2);
        TextView text3=findViewById(R.id.text3);
        TextView text4=findViewById(R.id.text4);
        TextView text5=findViewById(R.id.text5);
        TextView text6=findViewById(R.id.text6);
        TextView text7=findViewById(R.id.text7);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Weddin_day.this,Clock.class);
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Weddin_day.this,Clock.class);
                startActivity(intent);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Weddin_day.this,Clock.class);
                startActivity(intent);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Weddin_day.this,Clock.class);
                startActivity(intent);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Weddin_day.this,Clock.class);
                startActivity(intent);

            }
        });



        text1.setText(getIntent().getStringExtra("hour")+":"+getIntent().getStringExtra("minut"));}



    }

