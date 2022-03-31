package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;

import soup.neumorphism.NeumorphFloatingActionButton;

public class homepage extends AppCompatActivity {
private TextView logotext;
private NeumorphFloatingActionButton logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //changing statusbar color
        statusbar.blackiconstatusbar(homepage.this,R.color.light_bg);


        //assigning variables id

        logotext=(TextView)findViewById(R.id.logo_text);
        logo= findViewById(R.id.logo);

        //adding splashscreen animation

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent i = new Intent( homepage.this,login.class);
                ActivityOptions option=ActivityOptions.makeSceneTransitionAnimation(homepage.this,
                        Pair.create(logo,"logo"),
                Pair.create(logotext, "logoText"));
                startActivity(i,option.toBundle());
            }
        },1000);
    }
}