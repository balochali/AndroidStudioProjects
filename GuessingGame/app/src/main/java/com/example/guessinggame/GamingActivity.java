package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GamingActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("Name");

        text = findViewById(R.id.textView2);
        text.setText("Player Name: "+extra);


    }
}