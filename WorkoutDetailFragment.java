package com.gerryger.workout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState != null){
            workoutID = savedInstanceState.getLong("workoutID");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workouts = Workout.workouts[((int) workoutID)];
            title.setText(workouts.getName());

            TextView desc = (TextView) view.findViewById(R.id.textDescription);
            desc.setText(workouts.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putLong("workoutID", workoutID);
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }
}
