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
    Button saveRoutine, history_Btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_n_a_v3, container, false); //Presents the nav3 layout
        initview();
        return rootView;
    }

    private void initview() {
        numPick= rootView.findViewById(R.id.numberPicker);
        Addnotes= rootView.findViewById(R.id.notes);
        saveRoutine= rootView.findViewById(R.id.saveBtn);
        saveRoutine.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.saveBtn){
            Bundle bundle = new Bundle();
            String num_pick = numPick.getText().toString();
            String add_notes = Addnotes.getText().toString();
            bundle.putString("numKey",num_pick);
            bundle.putString("notesKey",add_notes);
            NAV3Fragment2 nav3Fragment2 = new NAV3Fragment2();
            nav3Fragment2.setArguments(bundle);
            Toast.makeText(getContext().getApplicationContext(), "You have recorded your mood!", Toast.LENGTH_SHORT).show();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, nav3Fragment2).commit();
        }

        }

    }
