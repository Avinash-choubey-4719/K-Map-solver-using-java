package com.example.k_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch(Exception exception){
                    exception.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashScreen.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}