package com.example.labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView PlayerOneScore;
    TextView PlayerTwoScore;

    boolean PlayerOneCheck;
    boolean PlayerTwoCheck;

    String PlayerOneName;
    String PlayerTwoName;

    int PlayerOneCount;
    int PlayerTwoCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        PlayerOneName = intent.getStringExtra("PlayerOneName");
        PlayerTwoName = intent.getStringExtra("PlayerTwoName");

        PlayerOneScore = findViewById(R.id.PlayerOneScore);
        PlayerTwoScore = findViewById(R.id.PlayerTwoScore);

        PlayerOneScore.setText(PlayerOneName + "Score: ");
        PlayerTwoScore.setText(PlayerTwoName + "Score: ");

    }

    public void onHit(View v){

    }
}