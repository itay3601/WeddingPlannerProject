package com.example.weddingplanner;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Songs extends Activity {
    private MediaPlayer WhenMan;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);
        ToggleButton WhenAManBTN=findViewById(R.id.WhenAManBTN);
        ToggleButton youtube=findViewById(R.id.yotobe);
       WhenMan=MediaPlayer.create(this,R.raw.song);

       WhenAManBTN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked==true)
                   WhenMan.start();
               else WhenMan.stop();
           }
       });
       youtube.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked==true) {
                   Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");

                   Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                   mapIntent.setPackage("com.google.android.apps.maps");

                   startActivity(mapIntent);

               }
           }
       });
    }
}