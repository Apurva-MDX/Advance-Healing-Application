package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class NAV5Fragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_n_a_v5, container, false); //Presents the 'fragment_n_a_v5' layout
        ImageButton button = (ImageButton) view.findViewById(R.id.introBtn); // Finds the 'introBtn' id from NAV5 layout.
        ImageButton button2 = (ImageButton) view.findViewById(R.id.intentionsBtn); // Finds the 'intentionsBtn' id from NAV5 layout.
        ImageButton button3 = (ImageButton) view.findViewById(R.id.storiesBtn); // Finds the 'storiesBtn' id from NAV5 layout.
        ImageButton button4 = (ImageButton) view.findViewById(R.id.thoughtsBtn); // Finds the 'thoughtsBtn' id from NAV5 layout.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button2.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button3.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button4.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.introBtn:
                FragmentTransaction ft5= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft5.replace(R.id.container_layout, new IntroductionFragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'IntroductionFragment' fragment.
                ft5.commit(); //commits the changes
                break;
            case R.id.intentionsBtn:
                FragmentTransaction ft6= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft6.replace(R.id.container_layout, new IntentionsFragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'IntentionsFragment' fragment.
                ft6.commit(); //commits the changes
                break;
            case R.id.storiesBtn:
                FragmentTransaction ft7= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft7.replace(R.id.container_layout, new StoriesFragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'StoriesFragment' fragment.
                ft7.commit(); //commits the changes
                break;
            case R.id.thoughtsBtn:
                FragmentTransaction ft8= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft8.replace(R.id.container_layout, new ThoughtsFragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'ThoughtsFragment' fragment.
                ft8.commit(); //commits the changes
                break;
        }
    }}