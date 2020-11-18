package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import org.ros.RosCore.*;
import org.ros.android.RosActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import std_msgs.Char;

public class meinmaeher extends AppCompatActivity {


    private ImageButton buttonStartMow;
    private ImageButton buttonPauseMow;
    private ImageButton buttonStopMow;
    private ImageButton buttonGoHome;
    private final CharSequence start= "Starte Mähvorgang";
    private final CharSequence pausiere = "Pausiere Mähvorgang";
    private final CharSequence stoppe = "Stoppe Mähvorgang";
    private final CharSequence GoHome = "Fahre zur Ladestadion";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meinmaeher);

        // Toast starte Mähvorgang
        buttonStartMow = (ImageButton) findViewById(R.id.buttonStartMow);
        buttonStartMow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), start, Toast.LENGTH_LONG).show();
            }
        });
        // Toast pausiere Mähvorgang
        buttonPauseMow = (ImageButton) findViewById(R.id.buttonPauseMow);
        buttonPauseMow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), pausiere, Toast.LENGTH_LONG).show();
            }
        });

        // Toast stoppe Mähvorgang
        buttonStopMow = (ImageButton) findViewById(R.id.buttonStopMow);
        buttonStopMow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), stoppe, Toast.LENGTH_LONG).show();
            }
        });
        // Toast  Mäher kehrt zurück
        buttonGoHome = (ImageButton) findViewById(R.id.buttonGoHome);
        buttonGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), GoHome, Toast.LENGTH_LONG).show();
            }
        });


    }

}