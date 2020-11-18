package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import org.ros.node.NodeMain;
import org.ros.node.NodeMainExecutor;

public class HomeActivity extends AppCompatActivity {
    private ImageButton mowButton;
    private ImageButton buttonInfo;
    private ImageButton buttonControl;
    private ImageButton buttonSettings;
    private ImageButton buttonMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonSettings=   (ImageButton) findViewById(R.id.buttonSettings);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSetting();
            }
        });

        buttonControl=   (ImageButton) findViewById(R.id.buttonControl);
        buttonControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openControl();
            }
        });

        buttonInfo=   (ImageButton) findViewById(R.id.buttonInfo);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });

        mowButton =(ImageButton) findViewById(R.id.buttonMow);
        mowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeinmaeher();
            }
        });


        buttonMap =(ImageButton) findViewById(R.id.buttonMap);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

    }
    public void openMap(){
        Intent intent = new Intent(this, com.example.test.map.MapMain.class);
        startActivity(intent);
    }

    public void openSetting(){
        Intent intent = new Intent(this, einstellungen.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }
    public void openMeinmaeher(){
        Intent intent = new Intent(this, meinmaeher.class);
        startActivity(intent);
    }
    public void openControl(){
        Intent intent = new Intent(this, Steuerung.class);
        startActivity(intent);
    }
}