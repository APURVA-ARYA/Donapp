package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphFloatingActionButton;
import soup.neumorphism.NeumorphImageButton;

public class donorhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorhomepage);


        //changing statusbar color
        statusbar.blackiconstatusbar(donorhomepage.this,R.color.light_bg);

//food button
        NeumorphButton donorfood= findViewById(R.id.donorfood_btn);
        donorfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(donorhomepage.this,fooddonor.class);
                startActivity(i);
            }
        });


        //clothes button

        NeumorphButton donorcloth= findViewById(R.id.donorcloth_btn);
        donorcloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(donorhomepage.this,DonorClothes.class);
                startActivity(i);
            }
        });

        //history btn
        NeumorphImageButton history=findViewById(R.id.history_btn);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(donorhomepage.this,history.class);
                startActivity(i);
            }
        });


        //profile btn
        NeumorphImageButton proflie=findViewById(R.id.lib_btn);
       proflie.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(donorhomepage.this,userinformationpage.class);
               startActivity(i);
           }
       });


       //notification
        NeumorphFloatingActionButton notification=findViewById(R.id.donor_profile);
      notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(donorhomepage.this,notification.class);
                startActivity(i);
            }
        });

    }
}