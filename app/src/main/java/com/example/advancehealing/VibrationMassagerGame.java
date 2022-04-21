package com.example.advancehealing;

import static android.content.Context.VIBRATOR_SERVICE;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class VibrationMassagerGame extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_vibration_massager_game, container, false); //Presents the vibration game layout
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'backBtn' id from the fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 20).

        Button startButton = view.findViewById(R.id.startBtn); // Finds the 'startBtn' id from the vibration fragment.
        Button stopButton = view.findViewById(R.id.stopBtn); // Finds the 'stopBtn' id from the vibration fragment.
        Vibrator vibrator = (Vibrator) getActivity().getSystemService(VIBRATOR_SERVICE); //gets the vibration service from the system.

        startButton.setOnClickListener(new View.OnClickListener() {   //Adds the OnClickListener to enable clicking/touch
            @Override
            public void onClick(View view) { //when the button is clicked or touched

                long[] pattern = {0,200,10,500}; // My custom pattern of vibration is played (This is my own massager pattern)
            vibrator.vibrate(pattern, 0); //Keeps repeating the pattern
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {  //Adds the OnClickListener to enable clicking/touch
            @Override
            public void onClick(View view) {  //if the stop button is clicked or touched
                vibrator.cancel(); //The vibration stops.
            }
        });
        return view;

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft2= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft2.replace(R.id.container_layout, new NAV1Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV1Fragment' fragment.
                ft2.commit(); //commits the changes
                break;


    }
}}