package com.saned.diceroll;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements Runnable{

    //Creating random seed
    private static final Random RAND = new Random();


    //Images
    private ImageView diceImage1, diceImage2, diceImage3, diceImage4, diceImage5;

    //Button
    private Button rollDice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rollDice = (Button) findViewById(R.id.rollDice);
        diceImage1 = (ImageView) findViewById(R.id.diceImage1);
        diceImage2 = (ImageView) findViewById(R.id.diceImage2);
        diceImage3 = (ImageView) findViewById(R.id.diceImage3);
        diceImage4 = (ImageView) findViewById(R.id.diceImage4);
        diceImage5 = (ImageView) findViewById(R.id.diceImage5);


        //Onclick Listener
        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting ints from our randomDice roller
                int diceInt1 = randomDiceNumber();
                int diceInt2 = randomDiceNumber();
                int diceInt3 = randomDiceNumber();
                int diceInt4 = randomDiceNumber();
                int diceInt5 = randomDiceNumber();

                //Getting resources to set to each image
                int res1 = getResources().getIdentifier("dice" + diceInt1, "drawable", "com.saned.diceroll");
                int res2 = getResources().getIdentifier("dice" + diceInt2, "drawable", "com.saned.diceroll");
                int res3 = getResources().getIdentifier("dice" + diceInt3, "drawable", "com.saned.diceroll");
                int res4 = getResources().getIdentifier("dice" + diceInt4, "drawable", "com.saned.diceroll");
                int res5 = getResources().getIdentifier("dice" + diceInt5, "drawable", "com.saned.diceroll");

                //Settings resources to each image id
                diceImage1.setImageResource(res1);
                diceImage2.setImageResource(res2);
                diceImage3.setImageResource(res3);
                diceImage4.setImageResource(res4);
                diceImage5.setImageResource(res5);


                Thread t = new Thread(MainActivity.this);
                t.start();


            }
        });

    }

    private void changeDice() {
        //ArrayLists
        ArrayList<Integer> diceids = new ArrayList<Integer>();
        diceids.add(R.drawable.dice1);
        diceids.add(R.drawable.dice2);
        diceids.add(R.drawable.dice3);
        diceids.add(R.drawable.dice4);
        diceids.add(R.drawable.dice5);

        ArrayList<Integer> imgviews = new ArrayList<Integer>();
        imgviews.add(R.id.diceImage1);
        imgviews.add(R.id.diceImage2);
        imgviews.add(R.id.diceImage3);
        imgviews.add(R.id.diceImage4);
        imgviews.add(R.id.diceImage5);

        runOnUiThread(new Runnable(){
            @Override
            public void run(){
                for (Integer img : imgviews){
                    int i = RAND.nextInt(diceids.size());
                    ((ImageView) findViewById(img)).setImageResource(diceids.get(i));
                }
            }
        });
    }

    //Returning random value from 1-6
    public static int randomDiceNumber(){
        return RAND.nextInt(6) + 1;
    }

    @Override
    public void run() {
        try {
            int speed = 30000;
            for(int i = 0; i < 5; i++){
                changeDice();
                Thread.sleep(speed);
                speed += 10000;
            }
        }
        catch(Exception ex){;}
    }
}