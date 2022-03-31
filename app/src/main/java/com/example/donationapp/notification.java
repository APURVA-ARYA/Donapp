package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphImageButton;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //changing statusbar color

        statusbar.blackiconstatusbar(notification.this, R.color.light_bg);



        //home  btn
        NeumorphImageButton home=findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(notification.this,donorhomepage.class);
                startActivity(i);
            }
        });


        //history btn
        NeumorphImageButton history=findViewById(R.id.history_btn);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(notification.this,history.class);
                startActivity(i);
            }
        });


        //profile btn
        NeumorphImageButton proflie=findViewById(R.id.lib_btn);
        proflie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(notification.this,userinformationpage.class);
                startActivity(i);
            }
        });



    }
}