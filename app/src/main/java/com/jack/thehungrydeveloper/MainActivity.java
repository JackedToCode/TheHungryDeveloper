package com.jack.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFinder();
        setClickListener();


    }

    private void setClickListener() {
        startersCard.setOnClickListener(view -> {
            //set up the intent the startActivity needs that contains where you are now, and where you want to go
            //or specify what you intent to do, this can be used for things outside the app aswell
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

            //starts new activity (new window)
            startActivity(startersActivityIntent);
        });

        mainsCard.setOnClickListener(view -> {
            //set up the intent the startActivity needs that contains where you are now, and where you want to go
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

            //starts new activity (new window)
            startActivity(mainCoursesActivityIntent);
        });

        emailTextView.setOnClickListener(view -> {
            Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
            launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydeveloper@jack.com"));
            startActivity(launchEmailAppIntent);

        });
    }


    private void viewFinder() {
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_courses);
        emailTextView = findViewById(R.id.text_view_email_address);
    }


}