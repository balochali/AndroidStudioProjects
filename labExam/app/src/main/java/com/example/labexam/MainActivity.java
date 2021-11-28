package com.example.labexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText PlayerOneName;
    EditText PlayerTwoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Play(View v){
        PlayerOneName = findViewById(R.id.EditPlayer1);
        PlayerTwoName = findViewById(R.id.EditPlayer2);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("PlayerOneName", PlayerOneName.getText().toString());
        intent.putExtra("PlayerTwoName", PlayerTwoName.getText().toString());

        startActivity(intent);
    }
}