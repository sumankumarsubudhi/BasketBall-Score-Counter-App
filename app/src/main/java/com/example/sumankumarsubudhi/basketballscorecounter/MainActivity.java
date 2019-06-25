
package com.example.sumankumarsubudhi.basketballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sumankumarsubudhi.basketballscorecounter.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void scoreThreeA(View view){
        scoreTeamA=scoreTeamA+3;
        displayA(scoreTeamA);
    }
    public void scoreTwoA(View view){
        scoreTeamA=scoreTeamA+2;
        displayA(scoreTeamA);
    }
    public void scoreFreeThrowA(View view){
        scoreTeamA=scoreTeamA+1;
        displayA(scoreTeamA);
    }
    public void displayA (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    protected void onCreateB(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamB(0);
    }
    public void scoreThreeB(View view){
        scoreTeamB=scoreTeamB+3;
        displayB(scoreTeamB);
    }
    public void scoreTwoB(View view){
        scoreTeamB=scoreTeamB+2;
        displayB(scoreTeamB);
    }
    public void scoreFreeThrowB(View view){
        scoreTeamB=scoreTeamB+1;
        displayB(scoreTeamB);
    }
    public void displayB (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }

    /**
     *  Reset the value of both the Teams.
     */
    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}