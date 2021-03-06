package com.example.labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView PlayerOneScore;
    TextView PlayerTwoScore;
    TextView WhoIsPlaying;

    boolean PlayerOneCheck = true;
    boolean PlayerTwoCheck = false;
    boolean PlayerOneStand = false;
    boolean PlayerTwoStand = false;

    String PlayerOneName;
    String PlayerTwoName;

    ImageView img;

    int PlayerOneCount = 0;
    int PlayerTwoCount = 0;

    int [] arr = new int[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        PlayerOneName = intent.getStringExtra("PlayerOneName");
        PlayerTwoName = intent.getStringExtra("PlayerTwoName");
        WhoIsPlaying = findViewById(R.id.Playing);

        PlayerOneScore = findViewById(R.id.PlayerOneScore);
        PlayerTwoScore = findViewById(R.id.PlayerTwoScore);

        PlayerOneScore.setText(PlayerOneName + " Score: ");
        PlayerTwoScore.setText(PlayerTwoName + " Score: ");
        WhoIsPlaying.setText(PlayerOneName + " Turns");

        PlayerOneCheck = false;
        PlayerTwoCheck = true;

    }

    public void onHit(View v){
        arr[0] = R.drawable.one;
        arr[1] = R.drawable.two;
        arr[2] = R.drawable.three;
        arr[3] = R.drawable.four;
        arr[4] = R.drawable.five;
        arr[5] = R.drawable.six;
        arr[6] = R.drawable.seven;
        arr[7] = R.drawable.eight;
        arr[8] = R.drawable.nine;
        arr[9] = R.drawable.jack;
        arr[10] = R.drawable.queen;
        arr[11] = R.drawable.king;
        arr[12] = R.drawable.ace;

        img = findViewById(R.id.imageView2);

        Random rand = new Random();

        int random = rand.nextInt(13);

        img.setImageResource(arr[random-1]);

        if((PlayerOneCheck == true) && (PlayerOneStand == false) && PlayerOneCount < 21){
            if(random > 9 && random < 13){
                PlayerOneCount += 10;
            }
            else if(random == 13){
                PlayerOneCount += 11;
            }
            else{
                PlayerOneCount += random;
            }
            PlayerOneCheck = false;
            PlayerTwoCheck = true;

            PlayerOneScore.setText(PlayerOneName + " Score is: "+PlayerOneCount);

            WhoIsPlaying.setText(PlayerTwoName + " Turns");
        }
        else if ((PlayerTwoCheck == true)&& (PlayerTwoStand == false) && PlayerTwoCount < 21){
            if(random > 9 && random < 13){
                PlayerTwoCount += 10;
            }
            else if(random == 13){
                PlayerTwoCount += 11;
            }
            else{
                PlayerTwoCount += random;
            }
            PlayerOneCheck = true;
            PlayerTwoCheck = false;

            PlayerTwoScore.setText(PlayerTwoName+ " Score is: "+PlayerTwoCount);
            WhoIsPlaying.setText(PlayerOneName + " Turns");
        }
    }

    public void onStand(View v){
        if(PlayerOneCheck == true && PlayerTwoCheck == false){
            PlayerOneStand = true;
        }

        else if(PlayerOneCheck == false && PlayerTwoCheck == true){
            PlayerTwoStand = true;
        }
    }
}