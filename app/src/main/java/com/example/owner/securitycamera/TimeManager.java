package com.example.owner.securitycamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeManager extends AppCompatActivity {
Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_manager);


        button=(Button) findViewById(R.id.button123);//pressing the OK button return the user to settings page
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(TimeManager.this,Settings.class);
                startActivity(i);
            }

        });

        button2=(Button) findViewById(R.id.buttontill);//pressing the OK button return the user to settings page
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(TimeManager.this,TimeManager2.class);
                startActivity(i);
            }

        });
    }
}
