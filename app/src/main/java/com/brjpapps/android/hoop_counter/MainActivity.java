package com.brjpapps.android.hoop_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHomeTeam=0;
    int scoreAwayTeam=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHomeTeam(0);
        displayForAwayTeam(0);
    }

    public void addThreeForHomeTeam(View view) {
        scoreHomeTeam=scoreHomeTeam + 3;
        displayForHomeTeam(scoreHomeTeam);
    }

    public void addTwoForHomeTeam(View view) {
        scoreHomeTeam=scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    public void addOneForHomeTeam(View view) {
        scoreHomeTeam=scoreHomeTeam + 1;
        displayForHomeTeam(scoreHomeTeam);
    }
    public void subtractHomeTeamPoints (View view) {
        scoreHomeTeam=(scoreHomeTeam - 1);
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForAwayTeam(View view) {
        scoreAwayTeam=scoreAwayTeam + 3;
        displayForAwayTeam(scoreAwayTeam);
    }

    public void addTwoForAwayTeam(View view) {
        scoreAwayTeam=scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    public void addOneForAwayTeam(View view) {
        scoreAwayTeam=scoreAwayTeam + 1;
        displayForAwayTeam(scoreAwayTeam);
    }
    public void subtractAwayTeamPoints (View view) {
        scoreAwayTeam=(scoreAwayTeam - 1);
        displayForAwayTeam(scoreAwayTeam);
    }

    public void resetScore (View view) {
        scoreHomeTeam=0;
        scoreAwayTeam=0;
        displayForAwayTeam(scoreAwayTeam);
        displayForHomeTeam(scoreHomeTeam);
    }
}
