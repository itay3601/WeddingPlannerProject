package com.example.weddingplanner;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Calendar;


public class Clock extends Activity {
    int hour;
    int minute;
    AlarmManager Alarmmanager;
    AlarmClock AlarmClock;
    TimePicker alrmTimePiker;
    TextView update_text;
    Context context;
    PendingIntent pedding_intent;
    int Flag=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock);
        this.context=this;

        Alarmmanager=(AlarmManager) getSystemService(ALARM_SERVICE);
        alrmTimePiker=(TimePicker)findViewById(R.id.time);
        final Calendar calander=Calendar.getInstance();
        Button OK=findViewById(R.id.OK);



alrmTimePiker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        hour=alrmTimePiker.getCurrentHour();
         minute =alrmTimePiker.getCurrentMinute();
        Toast.makeText(Clock.this,hour+":"+minute,Toast.LENGTH_SHORT).show();

    }
});

       OK.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {




                    hour=alrmTimePiker.getCurrentHour();
                    minute=alrmTimePiker.getCurrentMinute();
               Toast.makeText(Clock.this,hour+":"+minute,Toast.LENGTH_SHORT).show();

               Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);

               i.putExtra(AlarmClock.EXTRA_HOUR, 6);
               i.putExtra(AlarmClock.EXTRA_MINUTES, minute);

               startActivity(i);





               }

       });

    }





}
