package com.mohsin.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splassh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splassh);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ii=new Intent(Splassh.this,MainActivity.class);
                startActivity(ii);
                finish();
            }
        },5000);
    }
}
