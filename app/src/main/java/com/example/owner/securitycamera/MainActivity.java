package com.example.owner.securitycamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {


    ImageButton button1,button2,button3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

         //       Intent i=new Intent(MainActivity.this,LiveCamera.class);//activate camera button
          //      startActivity(i);
            }

        });


        button2=(ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(MainActivity.this,Diary.class);//activate diary button
                startActivity(i);
            }
        });

        button3=(ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(MainActivity.this,Settings.class);//activate settings button
                startActivity(i);
            }
        });
    }


}
