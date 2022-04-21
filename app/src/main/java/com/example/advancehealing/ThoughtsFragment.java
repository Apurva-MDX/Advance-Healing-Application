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
import android.widget.Toast;


public class ThoughtsFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_thoughts, container, false); //Presents the nav5 layout
        ImageButton button = (ImageButton) view.findViewById(R.id.backBtn); // Finds the 'backBtn' id from NAV3 section2 fragment.

        EditText edt = view.findViewById(R.id.editText);  // Finds the 'editText' id from the thoughts fragment.
        Button delete = view.findViewById(R.id.deleteBtn);  // Finds the 'deleteBtn' id from the thoughts fragment.

        delete.setOnClickListener(new View.OnClickListener() {  //Adds the OnClickListener to enable clicking/touch
            @Override
            public void onClick(View view) {  //when the button is clicked or touched
                String Text = edt.getText().toString();
                if (Text.isEmpty()){ //if the text is empty, it generates the text below.
                    Toast.makeText(getContext().getApplicationContext(), "Please enter your thoughts!", Toast.LENGTH_SHORT).show();
                }else {
                    edt.setText(""); //else, if the text is written on the textbox, it will become empty and generates a text message
                    Toast.makeText(getContext().getApplicationContext(), "You have destroyed your thoughts!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
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
    }
}}