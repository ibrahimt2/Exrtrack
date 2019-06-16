package com.ibrahimtmiraj.exrtrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class WorkoutFragment extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_workout, null);
        FloatingActionButton addExerciseFab = view.findViewById(R.id.addExerciseFab);

        //Adds OnClickListener to the addExerciseFab
        addExerciseFab.setOnClickListener(new View.OnClickListener() {
            @Override
            //Executes when addExerciseFab is pressed
            public void onClick(View view) {
                //Goes to ExerciseInProgressActivity from the WorkoutFragment
                Intent goToExerciseInProgress = new Intent(getActivity(), ExerciseInProgressActivity.class);
                startActivity(goToExerciseInProgress);
            }
        });

        return view;
    }

}
