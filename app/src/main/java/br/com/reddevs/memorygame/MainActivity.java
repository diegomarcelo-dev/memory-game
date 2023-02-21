package br.com.reddevs.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView play01, play02;

    ImageView ima01a, ima02b, ima03c, ima04d, ima05a, ima06b, ima07c, ima08d, ima09a, ima10b, ima11c, ima12d;

    //array das imagens
    Integer [] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205,206};

    int image101, image102, image103, image104, image105, image106;
    int image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clicledSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play01 = (TextView) findViewById(R.id.textView01);
        play02 = (TextView) findViewById(R.id.textView02);

        ima01a = (ImageView) findViewById(R.id.ima01);
        ima02b = (ImageView) findViewById(R.id.ima02);
        ima03c = (ImageView) findViewById(R.id.ima03);
        ima04d = (ImageView) findViewById(R.id.ima04);
        ima05a = (ImageView) findViewById(R.id.ima05);
        ima06b = (ImageView) findViewById(R.id.ima06);
        ima07c = (ImageView) findViewById(R.id.ima07);
        ima08d = (ImageView) findViewById(R.id.ima08);
        ima09a = (ImageView) findViewById(R.id.ima09);
        ima10b = (ImageView) findViewById(R.id.ima10);
        ima11c = (ImageView) findViewById(R.id.ima11);
        ima12d = (ImageView) findViewById(R.id.ima12);

        ima01a.setTag("0");
        ima02b.setTag("1");
        ima03c.setTag("2");
        ima04d.setTag("3");
        ima05a.setTag("4");
        ima06b.setTag("5");
        ima07c.setTag("6");
        ima08d.setTag("7");
        ima09a.setTag("8");
        ima10b.setTag("9");
        ima11c.setTag("10");
        ima12d.setTag("11");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        ima01a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima01a, theCard);
            }
        });

        ima02b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima02b, theCard);
            }
        });

        ima03c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima03c, theCard);
            }
        });

        ima04d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima04d, theCard);
            }
        });

        ima05a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima05a, theCard);
            }
        });

        ima06b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima06b, theCard);
            }
        });

        ima07c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima07c, theCard);
            }
        });

        ima08d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima08d, theCard);
            }
        });

        ima09a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima09a, theCard);
            }
        });

        ima10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima10b, theCard);
            }
        });

        ima11c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima11c, theCard);
            }
        });

        ima12d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ima12d, theCard);
            }
        });
    }

    private void doStuff (ImageView iv, int card){
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        } else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        } else if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        } else if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        } else if(cardsArray[card] == 105){
            iv.setImageResource(image105);
        } else if(cardsArray[card] == 106){
            iv.setImageResource(image106);
        } else if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        } else if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        } else if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        } else if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        } else if(cardsArray[card] == 205){
            iv.setImageResource(image205);
        } else if(cardsArray[card] == 206){
            iv.setImageResource(image206);
        }

        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if (secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clicledSecond = card;

            ima01a.setEnabled(false);
            ima02b.setEnabled(false);
            ima03c.setEnabled(false);
            ima04d.setEnabled(false);
            ima05a.setEnabled(false);
            ima06b.setEnabled(false);
            ima07c.setEnabled(false);
            ima08d.setEnabled(false);
            ima09a.setEnabled(false);
            ima10b.setEnabled(false);
            ima11c.setEnabled(false);
            ima12d.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate(){
        if(firstCard ==  secondCard){
            if(clickedFirst == 0){
                ima01a.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1){
                ima02b.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 2){
                ima03c.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 3){
                ima04d.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 4){
                ima05a.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 5){
                ima06b.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 6){
                ima07c.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 7){
                ima08d.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 8){
                ima09a.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 9){
                ima10b.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 10){
                ima11c.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 11){
                ima12d.setVisibility(View.INVISIBLE);
            }

            if(clicledSecond == 0){
                ima01a.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 1){
                ima02b.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 2){
                ima03c.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 3){
                ima04d.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 4){
                ima05a.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 5){
                ima06b.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 6){
                ima07c.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 7){
                ima08d.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 8){
                ima09a.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 9){
                ima10b.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 10){
                ima11c.setVisibility(View.INVISIBLE);
            } else if(clicledSecond == 11){
                ima12d.setVisibility(View.INVISIBLE);
            }

            if(turn == 1){
                playerPoints++;
                play01.setText("PLAY 01: " + playerPoints);
            } else if(turn == 2){
                cpuPoints++;
                play02.setText("PLAY 02: " + cpuPoints);
            }
        } else {
            ima01a.setImageResource(R.drawable.ic_launcher_background);
            ima02b.setImageResource(R.drawable.ic_launcher_background);
            ima03c.setImageResource(R.drawable.ic_launcher_background);
            ima04d.setImageResource(R.drawable.ic_launcher_background);
            ima05a.setImageResource(R.drawable.ic_launcher_background);
            ima06b.setImageResource(R.drawable.ic_launcher_background);
            ima07c.setImageResource(R.drawable.ic_launcher_background);
            ima08d.setImageResource(R.drawable.ic_launcher_background);
            ima09a.setImageResource(R.drawable.ic_launcher_background);
            ima10b.setImageResource(R.drawable.ic_launcher_background);
            ima11c.setImageResource(R.drawable.ic_launcher_background);
            ima12d.setImageResource(R.drawable.ic_launcher_background);

            if(turn == 1){
                turn = 2;
                play01.setTextColor(Color.GRAY);
                play02.setTextColor(Color.BLACK);
            } else if (turn == 2){
                turn = 1;
                play02.setTextColor(Color.GRAY);
                play01.setTextColor(Color.BLACK);
            }
        }

        ima01a.setEnabled(true);
        ima02b.setEnabled(true);
        ima03c.setEnabled(true);
        ima04d.setEnabled(true);
        ima05a.setEnabled(true);
        ima06b.setEnabled(true);
        ima07c.setEnabled(true);
        ima08d.setEnabled(true);
        ima09a.setEnabled(true);
        ima10b.setEnabled(true);
        ima11c.setEnabled(true);
        ima12d.setEnabled(true);

        checkEnd();
    }

    private void checkEnd(){
        if (ima01a.getVisibility() == View.INVISIBLE &&
                ima02b.getVisibility() == View.INVISIBLE &&
                ima03c.getVisibility() == View.INVISIBLE &&
                ima04d.getVisibility() == View.INVISIBLE &&
                ima05a.getVisibility() == View.INVISIBLE &&
                ima06b.getVisibility() == View.INVISIBLE &&
                ima07c.getVisibility() == View.INVISIBLE &&
                ima08d.getVisibility() == View.INVISIBLE &&
                ima09a.getVisibility() == View.INVISIBLE &&
                ima10b.getVisibility() == View.INVISIBLE &&
                ima11c.getVisibility() == View.INVISIBLE &&
                ima12d.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + playerPoints + "\nP2: " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources(){

        image101 = R.drawable.argentina;
        image102 = R.drawable.brazil;
        image103 = R.drawable.korea;
        image104 = R.drawable.united_states;
        image105 = R.drawable.germany;
        image106 = R.drawable.jamaica;
        image201 = R.drawable.argentina02;
        image202 = R.drawable.brazil02;
        image203 = R.drawable.korea02;
        image204 = R.drawable.united_states02;
        image205 = R.drawable.germany02;
        image206 = R.drawable.jamaica02;


    }
}