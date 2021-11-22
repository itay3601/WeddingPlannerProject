package com.example.weddingplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Calendar;

public class Calander_pic extends Activity {

    Calendar cal;
    int Year;
    int Month;
    int Day;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calander);
        final CalendarView cal1=findViewById(R.id.calender);
        Button BTn=findViewById(R.id.calenderbtn);
      cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
          @Override
          public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
              cal=Calendar.getInstance();
              cal.set(year,month,dayOfMonth,8,0);

          }
      });
        BTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/date");

                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", cal.getTimeInMillis());
                intent.putExtra("allDay", false);
                intent.putExtra("rrule", "FREQ=YEARLY");
                intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
                intent.putExtra("title", "Weddin Day!!!");
                startActivity(intent);



            }
        });

    }
}
