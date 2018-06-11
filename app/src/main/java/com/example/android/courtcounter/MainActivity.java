package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_score;
import static com.example.android.courtcounter.R.id.team_b_score;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when +3 button is clicked
     */

    public void threePointsTemA (View view){
        scoreTeamA =scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * This method is called when +2 button is clicked
     */

    public void twoPointsTeamA (View view) {
        scoreTeamA =scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }



    /**
     * This method is called when free throw button is clicked
     */

    public void oneThrowTeamA (View view){
        scoreTeamA =scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }





    /**
     * Displays the given score for Team b.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when +3 button is clicked
     */

    public void threePointsTemB (View view){
        scoreTeamB =scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * This method is called when +2 button is clicked
     */

    public void twoPointsTeamB (View view) {
        scoreTeamB =scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }



    /**
     * This method is called when free throw button is clicked
     */

    public void oneThrowTeamB (View view){
        scoreTeamB =scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    public void resetResult (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}





