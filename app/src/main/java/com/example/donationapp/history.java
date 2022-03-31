package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //changing statusbar color
        statusbar.blackiconstatusbar(history.this,R.color.light_bg);


        //home  btn
        NeumorphImageButton home=findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(history.this,donorhomepage.class);
                startActivity(i);
            }
        });


        //profile btn
        NeumorphImageButton proflie=findViewById(R.id.lib_btn);
        proflie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(history.this,userinformationpage.class);
                startActivity(i);
            }
        });


    }
}