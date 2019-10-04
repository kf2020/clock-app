package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SYDNEY
        LinearLayout sydneyChunk = findViewById(R.id.sydney_clock);

        TextView sydneyName = sydneyChunk.findViewById(R.id.city_name);
        sydneyName.setText("Sydney");

        TextClock sydClock = sydneyChunk.findViewById(R.id.clock);
        sydClock.setTimeZone("Australia/Sydney");

        ImageView sydImg = sydneyChunk.findViewById(R.id.city_image);
        sydImg.setImageResource(R.drawable.operahouse);

        //NEW YORK
        LinearLayout nyChunk = findViewById(R.id.ny_clock);

        TextView nyName = nyChunk.findViewById(R.id.city_name);
        nyName.setText("New York");

        TextClock nyClock = nyChunk.findViewById(R.id.clock);
        nyClock.setTimeZone("America/New_York");

        ImageView nyImg = nyChunk.findViewById(R.id.city_image);
        nyImg.setImageResource(R.drawable.ny_pic);

        //TOKYO
        LinearLayout tokyoChunk = findViewById(R.id.tokyo_clock);

        TextView tokyoName = tokyoChunk.findViewById(R.id.city_name);
        tokyoName.setText("Tokyo");

        TextClock tokyoClock = tokyoChunk.findViewById(R.id.clock);
        tokyoClock.setTimeZone("Asia/Tokyo");

        ImageView tokyoImg = tokyoChunk.findViewById(R.id.city_image);
        tokyoImg.setImageResource(R.drawable.tokyo);

        //LONDON
        LinearLayout londonChunk = findViewById(R.id.london_clock);

        TextView londonName = londonChunk.findViewById(R.id.city_name);
        londonName.setText("London");

        TextClock londonClock = londonChunk.findViewById(R.id.clock);
        londonClock.setTimeZone("Europe/London");

        ImageView londonImg = londonChunk.findViewById(R.id.city_image);
        londonImg.setImageResource(R.drawable.bigben);

        //LA
        LinearLayout laChunk = findViewById(R.id.la_clock);

        TextView laName = laChunk.findViewById(R.id.city_name);
        laName.setText("Los Angeles");

        TextClock laClock = laChunk.findViewById(R.id.clock);
        laClock.setTimeZone("America/Los_Angeles");

        ImageView laImg = laChunk.findViewById(R.id.city_image);
        laImg.setImageResource(R.drawable.losangeles);

        //MADRID
        LinearLayout madridChunk = findViewById(R.id.madrid_clock);

        TextView madridName = madridChunk.findViewById(R.id.city_name);
        madridName.setText("Madrid");

        TextClock madridClock = madridChunk.findViewById(R.id.clock);
        madridClock.setTimeZone("Europe/Madrid");

        ImageView madridImg = madridChunk.findViewById(R.id.city_image);
        madridImg.setImageResource(R.drawable.madrid);
    }
}
