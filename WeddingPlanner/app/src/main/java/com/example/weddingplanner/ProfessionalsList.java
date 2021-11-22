package com.example.weddingplanner;
import android.content.Intent;
import android.net.Uri;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

public class ProfessionalsList extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.professionals_list);
        Button AvivzBtn =findViewById(R.id.avivzbtn);
        Button salamonBTN =findViewById(R.id.salamonBtn);
        Button GuyBTN =findViewById(R.id.GuyBtn);
        Button KhledBTN =findViewById(R.id.khledBtn);

        Button AmadoMap =findViewById(R.id.Amadomap);
        Button AmadoCall =findViewById(R.id.Amadocall);
        Button ValleyMap =findViewById(R.id.Valleymap);
        Button VAlleycall =findViewById(R.id.Valleycall);
        Button SitrosMap =findViewById(R.id.Sitrosmap);
        Button Sitroscall =findViewById(R.id.Sitroscall);
        Button AlecsanderMap =findViewById(R.id.Alecsandermap);
        Button AlecsaderCall =findViewById(R.id.Alecsandecall);


        Button Contact_Khaled=findViewById(R.id.content_dj_khled);
        Button content_Guy=findViewById(R.id.content_Guy);
        Button content_aviv=findViewById(R.id.content_aviv);
        Button content_salamon=findViewById(R.id.content_salamon);





        Switch switchDj=findViewById(R.id.switcDj);
        Switch  switchhalls=findViewById(R.id.switchHalls);
        Switch switch3=findViewById(R.id.switch3);
        final LinearLayout layoutdj=findViewById(R.id.LayoutDj);
        final LinearLayout layouthalls=findViewById(R.id.LayoutHalls);
        final LinearLayout layout3=findViewById(R.id.Layout3);



        switchDj.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                layoutdj.setVisibility(b ? View.VISIBLE : View.GONE);
            }
        });
        switchhalls.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                layouthalls.setVisibility(b ? View.VISIBLE : View.GONE);
            }
        });
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                layout3.setVisibility(b ? View.VISIBLE : View.GONE);
            }
        });
        AvivzBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0546558000";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        salamonBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0545559030";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        GuyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0546966819";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        KhledBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0543677239";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        AmadoCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0529120702";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        VAlleycall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "0776051497";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        Sitroscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "098995008";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        AlecsaderCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone  = "09833266";

                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+phone));
                startActivity(intent3);
            }
        });
        AmadoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:32.166319,34.825542");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        ValleyMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:32.188037,34.952887");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        SitrosMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:32.284581,34.894611");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        AlecsanderMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:32.402526,34.894988");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        content_aviv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION);
                contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                contactIntent
                        .putExtra(ContactsContract.Intents.Insert.NAME, "Contact Name")
                        .putExtra(ContactsContract.Intents.Insert.PHONE, "5555555555");

                startActivityForResult(contactIntent, 1);
            }
        });
        content_Guy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION);
                contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                contactIntent
                        .putExtra(ContactsContract.Intents.Insert.NAME, "Contact Name")
                        .putExtra(ContactsContract.Intents.Insert.PHONE, "5555555555");

                startActivityForResult(contactIntent, 1);
            }
        });
        content_salamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION);
                contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                contactIntent
                        .putExtra(ContactsContract.Intents.Insert.NAME, "Contact Name")
                        .putExtra(ContactsContract.Intents.Insert.PHONE, "5555555555");

                startActivityForResult(contactIntent, 1);
            }
        });
        Contact_Khaled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION);
                contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                contactIntent
                        .putExtra(ContactsContract.Intents.Insert.NAME, "Contact Name")
                        .putExtra(ContactsContract.Intents.Insert.PHONE, "5555555555");

                startActivityForResult(contactIntent, 1);
            }
        });


    }
}