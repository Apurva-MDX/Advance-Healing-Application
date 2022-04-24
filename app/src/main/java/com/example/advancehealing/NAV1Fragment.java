package com.example.advancehealing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class NAV1Fragment extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_n_a_v1, container, false); // View object and presents NAV1 fragment as default.
        ImageButton button1 = (ImageButton) view.findViewById(R.id.fidgetBtn); // Finds the 'fidgetBtn' id from NAV1 fragment.
        ImageButton button2 = (ImageButton) view.findViewById(R.id.vibrationBtn); // Finds the 'vibrationBtn' id from NAV1 fragment.
        ImageButton button3 = (ImageButton) view.findViewById(R.id.fireworksBtn); // Finds the 'fireworksBtn' id from NAV1 fragment.
        ImageButton button4 = (ImageButton) view.findViewById(R.id.tictactoeBtn); // Finds the 'tictactoeBtn' id from NAV1 fragment.
        button1.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button2.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button3.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        button4.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fidgetBtn:
                FragmentTransaction ft1= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft1.replace(R.id.container_layout, new FidgetSpinnerGame()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft1.commit(); //commits the changes
                break;
            case R.id.vibrationBtn:
                FragmentTransaction ft2= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft2.replace(R.id.container_layout, new VibrationMassagerGame()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'VibrationMassagerGame' fragment.
                ft2.commit(); //commits the changes
                break;
            case R.id.fireworksBtn:
                Intent intent = new Intent(getActivity(), FireworkGame.class);
                startActivity(intent);
                break;
            case R.id.tictactoeBtn:
                FragmentTransaction ft4= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft4.replace(R.id.container_layout, new TicTacToeGame()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'TicTacToeGame' fragment.
                ft4.commit(); //commits the changes
                break;

        }
    }
}
