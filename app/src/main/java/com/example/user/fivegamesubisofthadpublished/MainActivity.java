package com.example.user.fivegamesubisofthadpublished;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonGameOne, buttonGameTwo, buttonGameThree, buttonGameFour, buttonGameFive;
    //private Button[] buttonGame = {buttonGameOne, buttonGameTwo, buttonGameThree, buttonGameFour, buttonGameFive};
    private TextView textViewGameOneContent, textViewGameTwoContent,textViewGameThreeContent, textViewGameFourContent, textViewGameFiveContent;
    //private TextView[] textViewGame = {textViewGameOneContent, textViewGameTwoContent,textViewGameThreeContent, textViewGameFourContent, textViewGameFiveContent};
    private TextView textViewDetailsOne, textViewDetailsTwo, textViewDetailsThree, textViewDetailsFour, textViewDetailsFive;
    //private TextView[] textViewDetails = {textViewDetailsOne, textViewDetailsTwo, textViewDetailsThree, textViewDetailsFour, textViewDetailsFive};
    private boolean showOne=false, showTwo=false, showThree=false, showFour=false, showFive=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewGameOneContent= (TextView) findViewById(R.id.textViewGameOneContent);
        textViewGameTwoContent= (TextView) findViewById(R.id.textViewGameTwoContent);
        textViewGameThreeContent= (TextView) findViewById(R.id.textViewGameThreeContent);
        textViewGameFourContent= (TextView) findViewById(R.id.textViewGameFourContent);
        textViewGameFiveContent= (TextView) findViewById(R.id.textViewGameFiveContent);

        buttonGameOne = (Button) findViewById(R.id.buttonGameOne);
        buttonGameTwo = (Button) findViewById(R.id.buttonGameTwo);
        buttonGameThree = (Button) findViewById(R.id.buttonGameThree);
        buttonGameFour = (Button) findViewById(R.id.buttonGameFour);
        buttonGameFive = (Button) findViewById(R.id.buttonGameFive);

        textViewDetailsOne = (TextView) findViewById(R.id.textViewDetailsOne);
        textViewDetailsTwo = (TextView) findViewById(R.id.textViewDetailsTwo);
        textViewDetailsThree = (TextView) findViewById(R.id.textViewDetailsThree);
        textViewDetailsFour = (TextView) findViewById(R.id.textViewDetailsFour);
        textViewDetailsFive = (TextView) findViewById(R.id.textViewDetailsFive);

        buttonGameOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showOne) {
                    textViewGameOneContent.setVisibility(View.VISIBLE);
                    textViewDetailsOne.setVisibility(View.VISIBLE);
                    showOne=true;
                }else{
                    textViewGameOneContent.setVisibility(View.GONE);
                    textViewDetailsOne.setVisibility(View.GONE);
                    showOne=false;
                }
            }
        });

        buttonGameTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showTwo) {
                    textViewGameTwoContent.setVisibility(View.VISIBLE);
                    textViewDetailsTwo.setVisibility(View.VISIBLE);
                    showTwo=true;
                }else{
                    textViewGameTwoContent.setVisibility(View.GONE);
                    textViewDetailsTwo.setVisibility(View.GONE);
                    showTwo=false;
                }
            }
        });

        buttonGameThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showThree) {
                    textViewGameThreeContent.setVisibility(View.VISIBLE);
                    textViewDetailsThree.setVisibility(View.VISIBLE);
                    showThree=true;
                }else{
                    textViewGameThreeContent.setVisibility(View.GONE);
                    textViewDetailsThree.setVisibility(View.GONE);
                    showThree=false;
                }
            }
        });

        buttonGameFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showFour) {
                    textViewGameFourContent.setVisibility(View.VISIBLE);
                    textViewDetailsFour.setVisibility(View.VISIBLE);
                    showFour=true;
                }else{
                    textViewGameFourContent.setVisibility(View.GONE);
                    textViewDetailsFour.setVisibility(View.GONE);
                    showFour=false;
                }
            }
        });

        buttonGameFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showFive) {
                    textViewGameFiveContent.setVisibility(View.VISIBLE);
                    textViewDetailsFive.setVisibility(View.VISIBLE);
                    showFive=true;
                }else{
                    textViewGameFiveContent.setVisibility(View.GONE);
                    textViewDetailsFive.setVisibility(View.GONE);
                    showFive=false;
                }
            }
        });

        textViewDetailsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), GameOne.class);
                startActivity(intent);
            }
        });

        textViewDetailsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), GameTwo.class);
                startActivity(intent);
            }
        });

        textViewDetailsThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), GameThree.class);
                startActivity(intent);
            }
        });

        textViewDetailsFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), GameFour.class);
                startActivity(intent);
            }
        });

        textViewDetailsFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(), GameFive.class);
                startActivity(intent);
            }
        });
    }
}
