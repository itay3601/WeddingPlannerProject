package com.example.weddingplanner;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;



public class menuPage extends Activity {
    Uri imageuri;


    final int CAMERA_REQUEST = 1;
    Bitmap bitmap;
    ImageView imageView;
    int requestCode=1;
    final int cameraReacqst=1;


    Intent camera;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        Button Galery=findViewById(R.id.galery);
        Button test=findViewById(R.id.test);
         imageView=findViewById(R.id.Imageview);
         Button songBtn=findViewById(R.id.songBtn);
         final TextView Weddin=findViewById(R.id.weddin);
         Button weddinday=findViewById(R.id.WeddinDay);
         Button professionalList=findViewById(R.id.ProfessionalsListBtn);
         ImageButton cameraBtn=findViewById(R.id.Camera);

         Weddin.setText("the weddin of "+getIntent().getStringExtra("BrideName")+" and "+getIntent().getStringExtra("GroomName"));
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST);
            }
        });

          professionalList.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent2=new Intent(menuPage.this,ProfessionalsList.class);

                  startActivity(intent2);


              }
          });
          songBtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent3=new Intent(menuPage.this,Songs.class);
                  startActivity(intent3);
              }
          });


        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(menuPage.this,Clock.class);
                startActivity(intent3);

            }
        });
        weddinday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(menuPage.this,Weddin_day.class);
                startActivity(intent);
            }
        });

            Galery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);

                }
            });


    }


    public static final int PICK_IMAGE = 100;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode==CAMERA_REQUEST && resultCode==RESULT_OK) {
            bitmap = (Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
        else if ((requestCode==PICK_IMAGE)&&resultCode==RESULT_OK){
            imageuri=data.getData();

        imageView.setImageURI(imageuri);}

    }
    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }

        }

        private void OpenGalery(){
        Intent Galery =new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(Galery,PICK_IMAGE);
        }




    }






