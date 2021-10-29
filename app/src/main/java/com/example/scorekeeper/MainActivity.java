package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void teamScoreA() {
        TextView scoreText = (TextView) findViewById(R.id.team_a_score);
        scoreText.setText(String.valueOf(teamA));
    }

    public void tenPointA(View view) {
        teamA += 10;
        teamScoreA();
    }

    public void onePointA(View view) {
        teamA -= 1;
        teamScoreA();
    }

    public void teamScoreB() {
        TextView scoreText = (TextView) findViewById(R.id.team_b_score);
        scoreText.setText(String.valueOf(teamB));
    }

    public void tenPointB(View view) {
        teamB += 10;
        teamScoreB();
    }

    public void onePointB(View view) {
        teamB -= 1;
        teamScoreB();
    }

    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        teamScoreA();
        teamScoreB();
    }
}