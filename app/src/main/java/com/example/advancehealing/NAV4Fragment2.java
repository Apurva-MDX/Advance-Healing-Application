package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class NAV4Fragment2 extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_n_a_v4_section2, container, false); //Presents the nav3_section2 layout
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'backBtn' id from NAV3 section2 fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft4= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft4.replace(R.id.container_layout, new NAV4Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft4.commit(); //commits the changes
                break;
    }
}}