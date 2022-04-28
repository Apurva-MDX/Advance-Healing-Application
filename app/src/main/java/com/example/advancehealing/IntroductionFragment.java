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


public class IntroductionFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_introduction, container, false); //Presents the nav5 introduction layout (.xml)
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'backBtn' id
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 16).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn: // Finds the 'backBtn' id
                FragmentTransaction ft5= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft5.replace(R.id.container_layout, new NAV5Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV5Fragment' fragment.
                ft5.commit(); //commits the changes
                break;
    }
}}