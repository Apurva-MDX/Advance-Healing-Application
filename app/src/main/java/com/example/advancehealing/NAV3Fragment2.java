package com.example.advancehealing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class NAV3Fragment2 extends Fragment implements View.OnClickListener{
    View rootview;
    TextView NumReceiver, NoteReceiver;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview =inflater.inflate(R.layout.fragment_n_a_v3_section2, container, false); //Presents the nav3_section2 layout
        ImageButton button = (ImageButton) rootview.findViewById(R.id.backBtn); // Finds the 'backBtn' id from NAV3 section2 fragment.
        NoteReceiver = rootview.findViewById(R.id.textViewReceiver);
        NumReceiver = rootview.findViewById(R.id.textViewReceiver1);
        Bundle bundle = this.getArguments();
        String num_pick=bundle.getString("numKey");
        String notes_pick=bundle.getString("notesKey");
        NumReceiver.setText(num_pick);
        NoteReceiver.setText(notes_pick);
        TextView textView = rootview.findViewById(R.id.textViewReceiver);  // Finds the 'days_display' id from the NAV4 section2 fragment.
        TextView textView1 = rootview.findViewById(R.id.textViewReceiver1);  // Finds the 'days_display' id from the NAV4 section2 fragment.

        Button delete = rootview.findViewById(R.id.deleteMoodBtn);  // Finds the 'deleteRoutineBtn' id from the NAV4 section2 fragment.
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = textView.getText().toString();

                textView.setText(""); //else, if the text is written on the textbox, it will become empty and generates a text message
                textView1.setText("");
                Toast.makeText(getContext().getApplicationContext(), "You have deleted your mood note!", Toast.LENGTH_SHORT).show();

            }
        });
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 14).
        return rootview;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft4= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft4.replace(R.id.container_layout, new NAV3Fragment3()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft4.commit(); //commits the changes
                break;
        }
    }}