package com.example.advancehealing;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class NAV2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_n_a_v2, container, false);
        ImageButton button = (ImageButton) view.findViewById(R.id.music2Btn);
        Button button2 = (Button) view.findViewById(R.id.stopmusic2);// Finds the 'stopmusic2' id from NAV2 fragment.
        ImageButton button3 = (ImageButton) view.findViewById(R.id.music1Btn); // Finds the 'music1Btn' id from NAV2 fragment.
        Button button4 = (Button) view.findViewById(R.id.stopmusic1);// Finds the 'stopmusic1' id from NAV2 fragment.
        final MediaPlayer musicPlayer1 = MediaPlayer.create(getActivity(), R.raw.music1);  //The MediaPlayer is responsible for the whole music functionality.
        final MediaPlayer musicPlayer2 = MediaPlayer.create(getActivity(), R.raw.music2);  //The MediaPlayer is responsible for the whole music functionality.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlayer1.start();
            } //starts the music
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlayer1.pause();
            }  //pauses the music
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlayer2.start();
            }  //starts the music
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlayer2.pause();
            } //pauses the music
        });
        return view;
    } }