package com.example.konstantinospolychroniadis.onefinancialgroup;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {
    private long workoutId;
    // Required empty public constructor
    public WorkoutDetailFragment() { }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong("workoutId"); }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false); }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
            TextView amount = (TextView) view.findViewById(R.id.textAmount);
            amount.setText(workout.getAmount());
            TextView holder = (TextView) view.findViewById(R.id.textHolder);
            holder.setText(workout.getHolder());
            TextView help = (TextView) view.findViewById(R.id.textHelp);
            help.setText(workout.getHelp()); } }
    public void setWorkout(long id) { this.workoutId = id; }
    @Override
    public void onSaveInstanceState(Bundle savedInstateState) {
        savedInstateState.putLong("workoutId", workoutId); }
}
