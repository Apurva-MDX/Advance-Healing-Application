package com.example.advancehealing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class FireworkGame extends AppCompatActivity {

    int maxX,maxY;
    RelativeLayout layout;
    RelativeLayout.LayoutParams lp;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firework_game);


        ImageButton button = (ImageButton) findViewById(R.id.backBtn); // Finds the 'backBtn' id from the fragment.
        button.setOnClickListener(new View.OnClickListener() {   //Adds the OnClickListener to enable clicking/touch
            @Override
            public void onClick(View view) { //when the button is clicked or touched

                getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, new NAV1Fragment()).commit();
            }
        });

        getSupportActionBar().hide(); // to hide action bar

        // to set orientation to potrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // to get max value for x, y coordinates
        setMaxCoordinates();

        // initializing relative layout
        layout = (RelativeLayout) findViewById(R.id.layout);

        // layout params
        lp = new RelativeLayout.LayoutParams(maxX, maxY);

        // to populate stars randomly on screen
        populateStarsRandomly();

        // on touch listener for relative layout
        layout.setOnTouchListener((view, motionEvent) -> {
            // get coordinates
            int x = (int) motionEvent.getX() - 250;
            int y = (int) motionEvent.getY() - 250;

            // on touch
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                burstFireworks(x,y);
            }
            return true;
        });

    }

    // to burst fireworks
    private void burstFireworks(int x, int y) {
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(maxX, maxY);
        // creating lottieAnimation view
        LottieAnimationView cracker = new LottieAnimationView(this);
        cracker.setLayoutParams(lp);
        // initializing lottie view from json file
        cracker.setAnimation(R.raw.fireworks);
        // setting height and width of lottie file
        cracker.getLayoutParams().height = 500;
        cracker.getLayoutParams().width = 500;
        // setting positions of lottie file
        cracker.setX(x);
        cracker.setY(y);
        // adding lottieanimationview to relative layout (which I imported in the Gradle)
        layout.addView(cracker);
        cracker.playAnimation();
        // function to generate sound
        burstSound();
    }

    // function to generate crackers sound
    private void burstSound() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.burst);
        mp.start();
    }

    // function to populate stars randomly on screen
    private void populateStarsRandomly() {

        float x,y;

        // random class to generate random coordinates
        Random random = new Random();
        // for loop to place 100 stars randomly
        for(int i=0; i<100; ++i){
            // generating random x coordinate
            x = random.nextInt(maxX);
            // generating random y coordinate
            y = random.nextInt(maxY);
            // placing star in x,y coordinate
            populateXY(x,y);
        }
    }

    // function to create and place star in x,y coordinates
    private void populateXY(float x, float y) {
        // creating imageview
        ImageView ivStar = new ImageView(this);
        ivStar.setLayoutParams(lp);
        // initializing image from drawable
        ivStar.setImageResource(R.drawable.star);
        // setting height and width of image
        ivStar.getLayoutParams().height = 15;
        ivStar.getLayoutParams().width = 15;
        // setting positions of image
        ivStar.setX(x);
        ivStar.setY(y);
        // adding imageview to relative layout
        layout.addView(ivStar);
    }

    // setting max coordinates of screen
    private void setMaxCoordinates() {
        Display disp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        disp.getSize(mdispSize);
        maxX = mdispSize.x;
        maxY = mdispSize.y;
    }



}