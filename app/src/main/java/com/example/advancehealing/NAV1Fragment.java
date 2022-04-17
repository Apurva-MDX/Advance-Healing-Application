package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class NAV1Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_n_a_v1, container, false); // View object and presents NAV1 fragment as default.
        ImageButton button=(ImageButton) view.findViewById(R.id.fidgetBtn); // Finds the 'fidgetBtn' id from NAV1 fragment.
        button.setOnClickListener(new View.OnClickListener() { //Adds the OnClickListener.
            @Override
            public void onClick(View view) { //onClick method
                FragmentTransaction fr= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
    fr.replace(R.id.container_layout, new FidgetSpinnerGame()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                fr.commit(); //commits the changes
            }
        });
        return view; // returns the view
    }
}
