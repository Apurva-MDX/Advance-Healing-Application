package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NAV3Fragment3 extends Fragment implements View.OnClickListener{
    View rootview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview =inflater.inflate(R.layout.fragment_n_a_v33, container, false);
        Button beginButton = rootview.findViewById(R.id.beginBtn);  // Finds the start / 'beginBtn' id from the NAV3 section3 fragment.
        beginButton.setOnClickListener(this); //calls the onClick method below.
        return rootview;
    }

    @Override
    public void onClick(View view) { //If clicked, the switch case below runs.
        switch (view.getId()) {
            case R.id.beginBtn:  //gets the 'beginBtn' id
                FragmentTransaction ft4= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft4.replace(R.id.container_layout, new NAV3Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV3Fragment' fragment.
                ft4.commit(); //commits the changes
                break;
        }
    }
}