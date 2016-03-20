package com.example.user.fivegamesubisofthadpublished;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameOne extends AppCompatActivity {

    private Button buttonBack;
    private TextView textViewSeriesOne, textViewSeriesTwo, textViewSeriesThree, textViewSeriesFour;
    private LinearLayout S1, S2, S3, S4;
    private boolean show1=false, show2=false, show3=false, show4=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_one);

        buttonBack= (Button) findViewById(R.id.buttonBack);

        textViewSeriesOne = (TextView) findViewById(R.id.textViewSeriesOne);
        textViewSeriesTwo = (TextView) findViewById(R.id.textViewSeriesTwo);
        textViewSeriesThree = (TextView) findViewById(R.id.textViewSeriesThree);
        textViewSeriesFour = (TextView) findViewById(R.id.textViewSeriesFour);

        S1 = (LinearLayout) findViewById(R.id.S1);
        S2 = (LinearLayout) findViewById(R.id.S2);
        S3 = (LinearLayout) findViewById(R.id.S3);
        S4 = (LinearLayout) findViewById(R.id.S4);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        textViewSeriesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show1) {
                    S1.setVisibility(View.VISIBLE);
                    show1=true;
                }else{
                    S1.setVisibility(View.GONE);
                    show1=false;
                }
            }
        });

        textViewSeriesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show1) {
                    S1.setVisibility(View.VISIBLE);
                    show1=true;
                }else{
                    S1.setVisibility(View.GONE);
                    show1=false;
                }
            }
        });

        textViewSeriesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show2) {
                    S2.setVisibility(View.VISIBLE);
                    show2=true;
                }else{
                    S2.setVisibility(View.GONE);
                    show2=false;
                }
            }
        });

        textViewSeriesThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show3) {
                    S3.setVisibility(View.VISIBLE);
                    show3=true;
                }else{
                    S3.setVisibility(View.GONE);
                    show3=false;
                }
            }
        });

        textViewSeriesFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show4) {
                    S4.setVisibility(View.VISIBLE);
                    show4=true;
                }else{
                    S4.setVisibility(View.GONE);
                    show4=false;
                }
            }
        });

    }
}
