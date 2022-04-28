package com.example.advancehealing;

import android.content.Context;
import android.content.SharedPreferences;
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

public class NAV3Fragment extends Fragment implements View.OnClickListener{
    View rootView;
    EditText numPick, Addnotes;
    Button saveRoutine;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_n_a_v3, container, false); //Presents the nav3 layout
        initview(); //calls the method below
        return rootView;
    }

    private void initview() {
        numPick= rootView.findViewById(R.id.numberPicker); //defines 'numPick' as the EditText 'numberPicker' id
        Addnotes= rootView.findViewById(R.id.notes);  //defines 'Addnotes' as the EditText 'notes' id
        saveRoutine= rootView.findViewById(R.id.saveBtn);  //defines 'saveBtn' as the Button 'saveBtn' id
        saveRoutine.setOnClickListener(this); //calls the onClick method below for button actions
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.saveBtn){  // If the 'saveBtn' button is pressed,
            Bundle bundle = new Bundle();  //Uses a bundle
            String num_pick = numPick.getText().toString();  //gets the value of the number in string
            String add_notes = Addnotes.getText().toString();  //gets the value of the notes/text in string
            bundle.putString("numKey",num_pick);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("notesKey",add_notes);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            NAV3Fragment2 nav3Fragment2 = new NAV3Fragment2(); //defines the second fragment/ section for this NAV
            nav3Fragment2.setArguments(bundle); //Permits the second fragment (nav3Fragment2) to retrieve the bundle
            Toast.makeText(getContext().getApplicationContext(), "You have recorded your mood!", Toast.LENGTH_SHORT).show(); //Once the button is clicked this toast message is shown.
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, nav3Fragment2).commit(); //Takes me to the second fragment (nav3Fragment2).
        }

    }

}