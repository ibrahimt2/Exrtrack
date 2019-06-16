package com.ibrahimtmiraj.exrtrack;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

public class MainActivity<addExerciseFab> extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        //Add ItemSelectedListener to navView
        navView.setOnNavigationItemSelectedListener(this);

        //Default Fragment that opens when the app is opened
        loadFragment(new WorkoutFragment());
    }


    //Method to insert a fragment into the frame_container
    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }

        return false;
    }

    @Override
    //Triggered everytime the bottom navigation bar is pressed
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        //Gets the id of the menuItem that is selected and creates a new Fragment based on which
        //menuItem was pressed
        switch(menuItem.getItemId()) {
            case R.id.navigation_workout:
                fragment = new WorkoutFragment();
                break;

            case R.id.navigation_progress:
                fragment = new DashboardFragment();
                break;

            case R.id.navigation_dashboard:
                fragment = new DashboardFragment();
                break;

            case R.id.navigation_settings:
                fragment = new SettingsFragment();
                break;
        }

        //Loads the fragment associated with the pressed menuItem into the frame_container
        return loadFragment(fragment);
    }

    //Listeners on Workout Screen




}
