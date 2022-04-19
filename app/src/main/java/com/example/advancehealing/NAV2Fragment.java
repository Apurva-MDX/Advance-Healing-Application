package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class NAV2Fragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_n_a_v2, container, false);
        ImageButton button = (ImageButton) view.findViewById(R.id.music2Btn); // Finds the 'music2Btn' id from NAV2 fragment.
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.music2Btn:
                FragmentTransaction ft3= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft3.replace(R.id.container_layout, new NAV2Fragment2()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV2Fragment2' fragment.
                ft3.commit(); //commits the changes
                break;
    }
}}