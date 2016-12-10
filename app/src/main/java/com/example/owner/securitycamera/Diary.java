package com.example.owner.securitycamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diary extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        button=(Button) findViewById(R.id.buttonAve);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(Diary.this,WachingVideo.class);
                startActivity(i);
            }

        });

    }
}
