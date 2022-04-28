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

public class NAV4Fragment extends Fragment implements View.OnClickListener{
    View rootView; //defines the view of NAV4 layout
    EditText days; //defines the EditText variable 'days'
    EditText time1,time2,time3;  //defines the EditText variables 'time1', 'time2' and 'time3'.
    EditText name1,name2,name3;  //defines the EditText variables 'name1', 'name2' and 'name3'.
    Button add;  //defines the variable 'add' button

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_n_a_v4, container, false); //Presents the nav4 layout
        initview(); //calls the method below.
        return rootView;
    }

    private void initview() {
        days= rootView.findViewById(R.id.enter_days);     //defines 'days' as the the EditText 'enter_days' id
        time1= rootView.findViewById(R.id.select_time1);   //defines 'time1' as the the EditText 'select_time1' id
        time2= rootView.findViewById(R.id.select_time2);   //defines 'time2' as the the EditText 'select_time2' id
        time3= rootView.findViewById(R.id.select_time3);   //defines 'time3' as the the EditText 'select_time3' id
        name1= rootView.findViewById(R.id.select_name1);   //defines 'name1' as the the EditText 'select_name1' id
        name2= rootView.findViewById(R.id.select_name2);   //defines 'name2' as the the EditText 'select_name2' id
        name3= rootView.findViewById(R.id.select_name3);   //defines 'name3' as the the EditText 'select_name3' id
        add= rootView.findViewById(R.id.addBtn);      //defines 'add' as the the Button 'addBtn' id
        add.setOnClickListener(this);         //Calls the onClick method below.
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.addBtn){  // If the 'addBtn' button is pressed,
            Bundle bundle = new Bundle();  //Uses a bundle
            String no_ofDaysEnter = days.getText().toString();  //gets the value of the string
            String morningtime = time1.getText().toString();   //gets the value of the string
            String afternoontime = time2.getText().toString();   //gets the value of the string
            String eveningtime = time3.getText().toString();   //gets the value of the string
            String morningname = name1.getText().toString();   //gets the value of the string
            String afternoonname = name2.getText().toString();   //gets the value of the string
            String eveningname = name3.getText().toString();   //gets the value of the string
            bundle.putString("noOfDays",no_ofDaysEnter);   //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("morningtime",morningtime);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("afternoontime",afternoontime);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("eveningtime",eveningtime);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("morningName",morningname);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("afternoonName",afternoonname);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            bundle.putString("eveningName",eveningname);  //The bundle takes the string values and defines a 'key' so I can refer it on the second fragment where the text values will be going to.
            NAV4Fragment2 nav4Fragment2 = new NAV4Fragment2();  //defines the second fragment/ section for this NAV
            nav4Fragment2.setArguments(bundle);  //Permits the second fragment (nav3Fragment2) to retrieve the bundle
            Toast.makeText(getContext().getApplicationContext(), "You have created your routine!", Toast.LENGTH_SHORT).show(); //Once the button is clicked this toast message is shown.
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, nav4Fragment2).commit();  //Takes me to the second fragment (nav4Fragment2).

        }

    }
}