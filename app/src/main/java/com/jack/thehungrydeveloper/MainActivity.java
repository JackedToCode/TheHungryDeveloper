package com.jack.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jack.thehungrydeveloper.starteractivity.StartersActivity;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFinder();
        setClickListener();
    }

    private void setClickListener() {
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set up the intent the startActivity needs that contains where you are now, and where you want to go
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                //starts new activity (new window)
                startActivity(startersActivityIntent);
            }
        });
    }

    private void viewFinder() {
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_courses);
    }



}