package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.NumberPicker;


public class NAV3Fragment extends Fragment implements View.OnClickListener{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_n_a_v3, container, false); //Presents the nav3 layout


        Button button = (Button) view.findViewById(R.id.historyBtn); // Finds the 'backBtn' id from NAV3 fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.historyBtn:
                FragmentTransaction ft3= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft3.replace(R.id.container_layout, new NAV3Fragment2()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft3.commit(); //commits the changes
                break;
        }
    }}