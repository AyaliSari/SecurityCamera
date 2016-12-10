package com.example.owner.securitycamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Settings extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button OKbutton,timeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        rg=(RadioGroup)findViewById(R.id.rgroup);


        OKbutton=(Button) findViewById(R.id.okBt);//pressing OK button return the user to the main manue
        OKbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(Settings.this,MainActivity.class);
                startActivity(i);
            }

        });

        timeButton=(Button) findViewById(R.id.timeBt);//pressing time button activate time manager
        timeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(Settings.this,TimeManager.class);
                startActivity(i);
            }

        });
    }

    public void rbclick(View v){//control the radio button
        int radiobuttonid=rg.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radiobuttonid);



    }
}
