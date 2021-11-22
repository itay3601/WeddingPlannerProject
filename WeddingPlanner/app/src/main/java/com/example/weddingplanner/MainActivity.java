package com.example.weddingplanner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next=findViewById(R.id.next);
        final EditText BrideName=findViewById(R.id.BrideName);
        Button Data=findViewById(R.id.Date);


        final  EditText GroomName=findViewById(R.id.GroomName);

        next.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String groomName = GroomName.getText().toString();

                String brideName  = BrideName.getText().toString();

                Intent intent=new Intent(MainActivity.this,menuPage.class);

                intent.putExtra("GroomName",groomName);

                intent.putExtra("BrideName",brideName);

                startActivity(intent);
            }
        });
        Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent=new Intent(MainActivity.this,Calander_pic.class);
               startActivity(intent);

            }
        });
    }



}
