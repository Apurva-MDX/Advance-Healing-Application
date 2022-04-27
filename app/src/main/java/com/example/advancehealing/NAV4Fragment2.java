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
import android.widget.TextView;
import android.widget.Toast;


public class NAV4Fragment2 extends Fragment implements View.OnClickListener{
    View rootview;
    TextView days_display;
    TextView Time1, Time2, Time3;
    TextView Name1, Name2, Name3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview =inflater.inflate(R.layout.fragment_n_a_v4_section2, container, false); //Presents the nav3_section2 layout
        ImageButton button = (ImageButton) rootview.findViewById(R.id.backBtn); // Finds the 'backBtn' id from NAV3 section2 fragment.
        days_display = rootview.findViewById(R.id.days_display);
        Time1 = rootview.findViewById(R.id.time1);
        Time2 = rootview.findViewById(R.id.time2);
        Time3 = rootview.findViewById(R.id.time3);
        Name1 = rootview.findViewById(R.id.name1);
        Name2 = rootview.findViewById(R.id.name2);
        Name3 = rootview.findViewById(R.id.name3);
        Bundle bundle = this.getArguments();
        String no_ofDaysEnter=bundle.getString("noOfDays");
        String time1=bundle.getString("morningtime");
        String time2=bundle.getString("afternoontime");
        String time3=bundle.getString("eveningtime");
        String name1=bundle.getString("morningName");
        String name2=bundle.getString("afternoonName");
        String name3=bundle.getString("eveningName");
        days_display.setText(no_ofDaysEnter);
        Time1.setText(time1);
        Time2.setText(time2);
        Time3.setText(time3);
        Name1.setText(name1);
        Name2.setText(name2);
        Name3.setText(name3);
        TextView textView = rootview.findViewById(R.id.days_display);  // Finds the 'days_display' id from the NAV4 section2 fragment.
        TextView textView2 = rootview.findViewById(R.id.time1);  // Finds the 'days_display' id from the NAV4 section2 fragment.
        TextView textView3 = rootview.findViewById(R.id.time2);
        TextView textView4 = rootview.findViewById(R.id.time3);
        TextView textView5 = rootview.findViewById(R.id.name1);
        TextView textView6 = rootview.findViewById(R.id.name2);
        TextView textView7 = rootview.findViewById(R.id.name3);
        Button delete = rootview.findViewById(R.id.deleteRoutineBtn);  // Finds the 'deleteRoutineBtn' id from the NAV4 section2 fragment.
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = textView.getText().toString();

                textView.setText(""); //else, if the text is written on the textbox, it will become empty and generates a text message
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                textView5.setText("");
                textView6.setText("");
                textView7.setText("");
                Toast.makeText(getContext().getApplicationContext(), "You have deleted your routine!", Toast.LENGTH_SHORT).show();

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
                ft4.replace(R.id.container_layout, new NAV4Fragment()); //finds 'container_layout' from MainActivity FrameLayout and replaces with 'FidgetSpinerGame' fragment.
                ft4.commit(); //commits the changes
                break;
        }
    }}