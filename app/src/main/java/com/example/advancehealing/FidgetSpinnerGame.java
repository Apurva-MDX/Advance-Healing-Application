package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class FidgetSpinnerGame extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_fidget_spinner_game, container, false); //Presents the fidget spinner game layout
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'fidgetBtn' id from NAV1 fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft2= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft2.replace(R.id.container_layout, new NAV1Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft2.commit(); //commits the changes
                break;
    }
}}