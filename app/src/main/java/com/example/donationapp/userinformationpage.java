package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class userinformationpage extends AppCompatActivity {

    ImageView prohome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinformationpage);



//        change status bar color
        statusbar.blackiconstatusbar(userinformationpage.this,R.color.light_bg);

        // home button
        prohome=findViewById(R.id.prohome);
        prohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(userinformationpage.this,donorhomepage.class);
                startActivity(i);
            }
        });


    }
}