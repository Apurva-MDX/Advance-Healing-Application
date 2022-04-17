package com.example.advancehealing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
//Linking to the fragments
    BottomNavigationView bottomNavigationView;
    NAV1Fragment nav1Fragment=new NAV1Fragment();
    NAV2Fragment nav2Fragment=new NAV2Fragment();
    NAV3Fragment nav3Fragment=new NAV3Fragment();
    NAV4Fragment nav4Fragment=new NAV4Fragment();
    NAV5Fragment nav5Fragment=new NAV5Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //This and the line below are responsible for hiding the title bar.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction(); // Allows fragment transaction
        fragmentTransaction.add(R.id.container_layout, new NAV1Fragment()); //Opens Fragment 1 as default
        fragmentTransaction.commit(); //commits the transaction

        bottomNavigationView=findViewById(R.id.bottom_view); //Gets bottom view
        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav1Fragment).commit(); //sets NAV1 as default fragment when app opens.

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.games: //if the 'games' button is pressed, NAV1 fragment opens.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav1Fragment).commit();
                        return true;
                    case R.id.yoga: //if the 'meditation' button is pressed, NAV2 fragment opens.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav2Fragment).commit();
                        return true;
                    case R.id.moodchecker: //if the 'moodchecker' button is pressed, NAV3 fragment opens.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav3Fragment).commit();
                        return true;
                    case R.id.progression: //if the 'routine' button is pressed, NAV4 fragment opens.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav4Fragment).commit();
                        return true;
                    case R.id.grief: //if the 'grief' button is pressed, NAV5 fragment opens.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,nav5Fragment).commit();
                        return true;

                }
                return false;
            }
        });
    }
}