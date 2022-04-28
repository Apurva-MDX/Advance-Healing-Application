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
        NoteReceiver = rootview.findViewById(R.id.textViewReceiver);  //This is a text view that will retrieve/show the string values from NAV3Fragment
        NumReceiver = rootview.findViewById(R.id.textViewReceiver1);  //This is a text view that will retrieve/show the string values from NAV3Fragment
        Bundle bundle = this.getArguments();
        String num_pick=bundle.getString("numKey");  //As explained earlier, this 'key' was defined in NAV3 and its used here to retrieve the string data.
        String notes_pick=bundle.getString("notesKey");  //As explained earlier, this 'key' was defined in NAV3 and its used here to retrieve the string data.
        NumReceiver.setText(num_pick);  //Tells the textview to display the string values retrieved from the 'keys'.
        NoteReceiver.setText(notes_pick);  //Tells the textview to display the string values retrieved from the 'keys'.
        TextView textView = rootview.findViewById(R.id.textViewReceiver);  // Finds the 'textViewReceiver' id from the NAV3 section2 fragment.
        TextView textView1 = rootview.findViewById(R.id.textViewReceiver1);  // Finds the 'textViewReceiver1' id from the NAV3 section2 fragment.

        Button delete = rootview.findViewById(R.id.deleteMoodBtn);  // Finds the 'deleteRoutineBtn' id from the NAV3 section2 fragment.
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = textView.getText().toString(); //If the delete button is pressed, it will get the string value on the TextView

                textView.setText(""); //else, the text written on the TextView will become empty.
                textView1.setText(""); //else, the text written on the TextView will become empty.
                Toast.makeText(getContext().getApplicationContext(), "You have deleted your mood note!", Toast.LENGTH_SHORT).show();  //Once the button is pressed this toast message is shown.

            }
        });
        button.setOnClickListener(this); //calls the OnClickListener from within the class (line 16).
        return rootview;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                FragmentTransaction ft4= getFragmentManager().beginTransaction(); //if clicked, it begins the transaction
                ft4.replace(R.id.container_layout, new NAV3Fragment3()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'NAV3Fragment3' fragment.
                ft4.commit(); //commits the changes
                break;
        }
    }}