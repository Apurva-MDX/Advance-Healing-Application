package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class IntentionsFragment extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_intentions, container, false); //Presents the Intention Fragment layout
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'backBtn' id from Intentions fragment.
        ImageButton button2 = (ImageButton) view.findViewById(R.id.reachingoutBtn); // Finds the 'reachingoutBtn' id from Intentions fragment.
        ImageButton button3 = (ImageButton) view.findViewById(R.id.stayinghonestBtn); // Finds the 'stayinghonestBtn' id from Intentions fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button2.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button3.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft5= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft5.replace(R.id.container_layout, new NAV5Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV5Fragment' fragment.
                ft5.commit(); //commits the changes
                break;
            case R.id.reachingoutBtn:
                FragmentTransaction ft6= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft6.replace(R.id.container_layout, new NAV5ReachingOut()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV5ReachingOut' fragment.
                ft6.commit(); //commits the changes
                break;
            case R.id.stayinghonestBtn:
                FragmentTransaction ft7= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft7.replace(R.id.container_layout, new NAV5StayingHonest()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV5StayingHonest' fragment.
                ft7.commit(); //commits the changes
                break;



        }
    }}