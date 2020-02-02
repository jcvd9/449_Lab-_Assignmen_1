package com.example.labassignment01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int Strike = 0;
    public int Ball = 0;

    TextView Str;
    TextView Bal;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Str = (TextView) findViewById(R.id.VALUE_STRIKE);
        Bal = (TextView) findViewById(R.id.VALUE_BALL);
    }

    public void AddStrike(View Y){
        Strike++;
        Str.setText(Integer.toString(Strike));
        //check();
    }

    public void AddBall(View X){

        Ball++;
        Bal.setText(Integer.toString(Ball));
        //check();
    }

    public void ResetAll(View R){
        Strike = 0;
        Ball = 0;
        Str.setText(Integer.toString(Strike));
        Bal.setText(Integer.toString(Ball));


    }
    public void Exit(View view){

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);




    }


}








/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


 */