package com.example.test;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
public final int LOAD_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
    Intent intent= new Intent(MainActivity.this, HomeActivity.class);
     startActivity(intent);
     finish();
    }
    },LOAD_TIME);



    }
}