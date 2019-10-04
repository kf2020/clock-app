package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    boolean hr12Selected = true;
    Button hr12, hr24;
    TextClock sydClock, nyClock, tokyoClock, londonClock, laClock, madridClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hr12Selected = true;

        //SYDNEY
        LinearLayout sydneyChunk = findViewById(R.id.sydney_clock);

        TextView sydneyName = sydneyChunk.findViewById(R.id.city_name);
        sydneyName.setText("Sydney");

        sydClock = sydneyChunk.findViewById(R.id.clock);
        sydClock.setTimeZone("Australia/Sydney");

        ImageView sydImg = sydneyChunk.findViewById(R.id.city_image);
        sydImg.setImageResource(R.drawable.operahouse2);

        //NEW YORK
        LinearLayout nyChunk = findViewById(R.id.ny_clock);

        TextView nyName = nyChunk.findViewById(R.id.city_name);
        nyName.setText("New York");

        nyClock = nyChunk.findViewById(R.id.clock);
        nyClock.setTimeZone("America/New_York");

        ImageView nyImg = nyChunk.findViewById(R.id.city_image);
        nyImg.setImageResource(R.drawable.statueofliberty);

        //TOKYO
        LinearLayout tokyoChunk = findViewById(R.id.tokyo_clock);

        TextView tokyoName = tokyoChunk.findViewById(R.id.city_name);
        tokyoName.setText("Tokyo");

        tokyoClock = tokyoChunk.findViewById(R.id.clock);
        tokyoClock.setTimeZone("Asia/Tokyo");

        ImageView tokyoImg = tokyoChunk.findViewById(R.id.city_image);
        tokyoImg.setImageResource(R.drawable.tokyo);

        //LA
        LinearLayout laChunk = findViewById(R.id.la_clock);

        TextView laName = laChunk.findViewById(R.id.city_name);
        laName.setText("Los Angeles");

        laClock = laChunk.findViewById(R.id.clock);
        laClock.setTimeZone("America/Los_Angeles");

        ImageView laImg = laChunk.findViewById(R.id.city_image);
        laImg.setImageResource(R.drawable.hollywood);

        //LONDON
        LinearLayout londonChunk = findViewById(R.id.london_clock);

        TextView londonName = londonChunk.findViewById(R.id.city_name);
        londonName.setText("London");

        londonClock = londonChunk.findViewById(R.id.clock);
        londonClock.setTimeZone("Europe/London");

        ImageView londonImg = londonChunk.findViewById(R.id.city_image);
        londonImg.setImageResource(R.drawable.bigben3);

        //MADRID
        LinearLayout madridChunk = findViewById(R.id.madrid_clock);

        TextView madridName = madridChunk.findViewById(R.id.city_name);
        madridName.setText("Madrid");

        madridClock = madridChunk.findViewById(R.id.clock);
        madridClock.setTimeZone("Europe/Madrid");

        ImageView madridImg = madridChunk.findViewById(R.id.city_image);
        madridImg.setImageResource(R.drawable.madrid);

        //BUTTONS

        hr12 = findViewById(R.id.hr12);
        hr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hr12clicked();
            }
        });

        hr24 = findViewById(R.id.hr24);
        hr24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hr24clicked();
            }
        });
    }

    private void hr12clicked() {
        if (!hr12Selected) {
            sydClock.setFormat12Hour("h:mm a");
            laClock.setFormat12Hour("h:mm a");
            madridClock.setFormat12Hour("h:mm a");
            tokyoClock.setFormat12Hour("h:mm a");
            londonClock.setFormat12Hour("h:mm a");
            nyClock.setFormat12Hour("h:mm a");

            hr12Selected = true;
            hr24.setBackgroundColor(Color.parseColor("#db7d00"));
            hr12.setBackgroundColor(Color.parseColor("#a3a3a3"));
        }
    }

    private void hr24clicked() {
        if (hr12Selected) {

            sydClock.setFormat12Hour("HH:mm");
            laClock.setFormat12Hour("HH:mm");
            madridClock.setFormat12Hour("HH:mm");
            tokyoClock.setFormat12Hour("HH:mm");
            londonClock.setFormat12Hour("HH:mm");
            nyClock.setFormat12Hour("HH:mm");

            hr12Selected = false;
            hr12.setBackgroundColor(Color.parseColor("#db7d00"));
            hr24.setBackgroundColor(Color.parseColor("#a3a3a3"));
        }
    }
}
