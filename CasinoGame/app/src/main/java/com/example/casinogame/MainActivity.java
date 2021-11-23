package com.example.casinogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int image1Num;
    int image2Num;
    ImageView img1;
    ImageView img2;
    TextView text1;
    TextView text2;
    TextView winner;


    public void onClick(View v){

        int [] arr = new int[7];

        arr[0] = R.drawable.one;
        arr[1] = R.drawable.one;
        arr[2] = R.drawable.two;
        arr[3] = R.drawable.three;
        arr[4] = R.drawable.four;
        arr[5] = R.drawable.five;
        arr[6] = R.drawable.six;

        img1 = findViewById(R.id.image2);
        img2 = findViewById(R.id.Image1);

        Random rand = new Random();
        image1Num = rand.nextInt(6) +1;

        img1.setImageResource(arr[image1Num]);
        img2.setImageResource(arr[image2Num]);

        text1.findViewById(R.id.Image1);
        text2.findViewById(R.id.image2);
        winner.findViewById(R.id.textView);

        text1.setText(image1Num);
        text2.setText(image2Num);

        if(image1Num == image2Num){
            winner.setText("Winner is: User");
        }
        else{
            winner.setText("Winner is: Casino");
        }

    }
}