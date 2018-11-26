package com.techexchange.mobileapps.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /**
         * Displays the given score for Team A.
         */

        int scoreTeamA = 0;
        int scoreTeamB = 0;

        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_A_score);
            scoreView.setText(String.valueOf(score));
        }

        public void addOnePointTeamA(View view){
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);

        }
        public void addTwoPointsTeamA(View view){
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);

        }
        public void addThreePointsTeamA(View view){
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);

        }
        public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_B_score);
            scoreView.setText(String.valueOf(score));
        }

        public void addOnePointTeamB(View view){
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);

        }
        public void addTwoPointsTeamB(View view){
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);

        }
        public void addThreePointsTeamB(View view){
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);

        }

        public void resetTeamScore(View view){
            scoreTeamA = 0;
            scoreTeamB = 0;

            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }

