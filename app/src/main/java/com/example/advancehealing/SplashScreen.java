package com.example.advancehealing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide(); ///This line is responsible for hiding the ActionBar.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); /// This line hides the TitleBar

        new Handler().postDelayed(new Runnable() {/// This handler is allows me to transition to the main activity after 4 seconds
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, MainActivity.class); ///This line tells the app to show MainActivity after SplashScreen
                startActivity(intent); ///This line starts the MainActivity
                finish(); ///This line ensures that once the SplashScreen is complete, it will not show again unless you restart the app.
            }
        }, 4000); ///This sets the SplashScreen to appear for 4 seconds.
    }
}