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

public class NAV4Fragment extends Fragment implements View.OnClickListener{
    View rootView;
    EditText days;
    EditText time1,time2,time3;
    EditText name1,name2,name3;
    Button add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_n_a_v4, container, false); //Presents the nav4 layout
        initview();
        return rootView;
    }

    private void initview() {
        days= rootView.findViewById(R.id.enter_days);
        time1= rootView.findViewById(R.id.select_time1);
        time2= rootView.findViewById(R.id.select_time2);
        time3= rootView.findViewById(R.id.select_time3);
        name1= rootView.findViewById(R.id.select_name1);
        name2= rootView.findViewById(R.id.select_name2);
        name3= rootView.findViewById(R.id.select_name3);
        add= rootView.findViewById(R.id.addBtn);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.addBtn){
            Bundle bundle = new Bundle();
            String no_ofDaysEnter = days.getText().toString();
            String morningtime = time1.getText().toString();
            String afternoontime = time2.getText().toString();
            String eveningtime = time3.getText().toString();
            String morningname = name1.getText().toString();
            String afternoonname = name2.getText().toString();
            String eveningname = name3.getText().toString();
            bundle.putString("noOfDays",no_ofDaysEnter);
            bundle.putString("morningtime",morningtime);
            bundle.putString("afternoontime",afternoontime);
            bundle.putString("eveningtime",eveningtime);
            bundle.putString("morningName",morningname);
            bundle.putString("afternoonName",afternoonname);
            bundle.putString("eveningName",eveningname);
            NAV4Fragment2 nav4Fragment2 = new NAV4Fragment2();
            nav4Fragment2.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, nav4Fragment2).commit();

        }

    }
}