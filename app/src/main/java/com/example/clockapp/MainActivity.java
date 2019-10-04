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
    LinearLayout sydneyChunk, nyChunk, tokyoChunk, londonChunk, laChunk, madridChunk;
    LinearLayout sydneyClosed, nyClosed, tokyoClosed, londonClosed, laClosed, madridClosed;
    TextClock sydClock, nyClock, tokyoClock, londonClock, laClock, madridClock;
    boolean sydShow, nyShow, tokyoShow, londonShow, laShow, madridShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hr12Selected = true;

        //SYDNEY
        sydShow = true;
        sydneyChunk = findViewById(R.id.sydney_clock);

        TextView sydneyName = sydneyChunk.findViewById(R.id.city_name);
        sydneyName.setText("Sydney");

        sydClock = sydneyChunk.findViewById(R.id.clock);
        sydClock.setTimeZone("Australia/Sydney");

        ImageView sydImg = sydneyChunk.findViewById(R.id.city_image);
        sydImg.setImageResource(R.drawable.operahouse2);

        ImageView sydChevron = sydneyChunk.findViewById(R.id.city_chevron);
        sydChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sydChevronClicked();
            }
        });

        sydneyClosed = findViewById(R.id.sydney_clock_closed);
        TextView sydneyNameClosed = sydneyClosed.findViewById(R.id.city_name);
        sydneyNameClosed.setText("Sydney");

        ImageView sydChevronClosed = sydneyClosed.findViewById(R.id.city_chevron);
        sydChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sydChevronClicked();
            }
        });

        //NEW YORK
        nyShow = true;
        nyChunk = findViewById(R.id.ny_clock);

        TextView nyName = nyChunk.findViewById(R.id.city_name);
        nyName.setText("New York");

        nyClock = nyChunk.findViewById(R.id.clock);
        nyClock.setTimeZone("America/New_York");

        ImageView nyImg = nyChunk.findViewById(R.id.city_image);
        nyImg.setImageResource(R.drawable.statueofliberty);

        ImageView nyChevron = nyChunk.findViewById(R.id.city_chevron);
        nyChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyChevronClicked();
            }
        });

        nyClosed = findViewById(R.id.ny_clock_closed);
        TextView nyNameClosed = nyClosed.findViewById(R.id.city_name);
        nyNameClosed.setText("New York");

        ImageView nyImgClosed = nyClosed.findViewById(R.id.city_image);
        nyImgClosed.setImageResource(R.drawable.statueofliberty);

        ImageView nyChevronClosed = nyClosed.findViewById(R.id.city_chevron);
        nyChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyChevronClicked();
            }
        });

        //TOKYO
        tokyoShow = true;
        tokyoChunk = findViewById(R.id.tokyo_clock);

        TextView tokyoName = tokyoChunk.findViewById(R.id.city_name);
        tokyoName.setText("Tokyo");

        tokyoClock = tokyoChunk.findViewById(R.id.clock);
        tokyoClock.setTimeZone("Asia/Tokyo");

        ImageView tokyoImg = tokyoChunk.findViewById(R.id.city_image);
        tokyoImg.setImageResource(R.drawable.tokyo);

        ImageView tokyoChevron = tokyoChunk.findViewById(R.id.city_chevron);
        tokyoChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokyoChevronClicked();
            }
        });

        tokyoClosed = findViewById(R.id.tokyo_clock_closed);
        TextView tokyoNameClosed = tokyoClosed.findViewById(R.id.city_name);
        tokyoNameClosed.setText("Tokyo");

        ImageView tokyoImgClosed = tokyoClosed.findViewById(R.id.city_image);
        tokyoImgClosed.setImageResource(R.drawable.tokyo);

        ImageView tokyoChevronClosed = tokyoClosed.findViewById(R.id.city_chevron);
        tokyoChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokyoChevronClicked();
            }
        });

        //LA
        laShow = true;
        laChunk = findViewById(R.id.la_clock);

        TextView laName = laChunk.findViewById(R.id.city_name);
        laName.setText("Los Angeles");

        laClock = laChunk.findViewById(R.id.clock);
        laClock.setTimeZone("America/Los_Angeles");

        ImageView laImg = laChunk.findViewById(R.id.city_image);
        laImg.setImageResource(R.drawable.hollywood);

        ImageView laChevron = laChunk.findViewById(R.id.city_chevron);
        laChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                laChevronClicked();
            }
        });

        laClosed = findViewById(R.id.la_clock_closed);
        TextView laNameClosed = laClosed.findViewById(R.id.city_name);
        laNameClosed.setText("Los Angeles");

        ImageView laImgClosed = laClosed.findViewById(R.id.city_image);
        laImgClosed.setImageResource(R.drawable.hollywood);

        ImageView laChevronClosed = laClosed.findViewById(R.id.city_chevron);
        laChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                laChevronClicked();
            }
        });

        //LONDON
        londonShow = true;
        londonChunk = findViewById(R.id.london_clock);

        TextView londonName = londonChunk.findViewById(R.id.city_name);
        londonName.setText("London");

        londonClock = londonChunk.findViewById(R.id.clock);
        londonClock.setTimeZone("Europe/London");

        ImageView londonImg = londonChunk.findViewById(R.id.city_image);
        londonImg.setImageResource(R.drawable.bigben3);

        ImageView londonChevron = londonChunk.findViewById(R.id.city_chevron);
        londonChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                londonChevronClicked();
            }
        });

        londonClosed = findViewById(R.id.london_clock_closed);
        TextView londonNameClosed = londonClosed.findViewById(R.id.city_name);
        londonNameClosed.setText("London");

        ImageView londonImgClosed = londonClosed.findViewById(R.id.city_image);
        londonImgClosed.setImageResource(R.drawable.bigben3);

        ImageView londonChevronClosed = londonClosed.findViewById(R.id.city_chevron);
        londonChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                londonChevronClicked();
            }
        });

        //MADRID
        madridShow = true;
        madridChunk = findViewById(R.id.madrid_clock);

        TextView madridName = madridChunk.findViewById(R.id.city_name);
        madridName.setText("Madrid");

        madridClock = madridChunk.findViewById(R.id.clock);
        madridClock.setTimeZone("Europe/Madrid");

        ImageView madridImg = madridChunk.findViewById(R.id.city_image);
        madridImg.setImageResource(R.drawable.madrid);

        ImageView madridChevron = madridChunk.findViewById(R.id.city_chevron);
        madridChevron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                madridChevronClicked();
            }
        });

        madridClosed = findViewById(R.id.madrid_clock_closed);
        TextView madridNameClosed = madridClosed.findViewById(R.id.city_name);
        madridNameClosed.setText("Madrid");

        ImageView madridImgClosed = madridClosed.findViewById(R.id.city_image);
        madridImgClosed.setImageResource(R.drawable.madrid);

        ImageView madridChevronClosed = madridClosed.findViewById(R.id.city_chevron);
        madridChevronClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                madridChevronClicked();
            }
        });


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

    private void sydChevronClicked() {
        if (sydShow) {
            sydneyChunk.setVisibility(View.GONE);
            sydneyClosed.setVisibility(View.VISIBLE);
        } else {
            sydneyClosed.setVisibility(View.GONE);
            sydneyChunk.setVisibility(View.VISIBLE);
        }
        sydShow = !sydShow;
    }

    private void nyChevronClicked() {
        if (nyShow) {
            nyChunk.setVisibility(View.GONE);
            nyClosed.setVisibility(View.VISIBLE);
        } else {
            nyClosed.setVisibility(View.GONE);
            nyChunk.setVisibility(View.VISIBLE);
        }
        nyShow = !nyShow;
    }

    private void laChevronClicked() {
        if (laShow) {
            laChunk.setVisibility(View.GONE);
            laClosed.setVisibility(View.VISIBLE);
        } else {
            laClosed.setVisibility(View.GONE);
            laChunk.setVisibility(View.VISIBLE);
        }
        laShow = !laShow;
    }

    private void londonChevronClicked() {
        if (londonShow) {
            londonChunk.setVisibility(View.GONE);
            londonClosed.setVisibility(View.VISIBLE);
        } else {
            londonClosed.setVisibility(View.GONE);
            londonChunk.setVisibility(View.VISIBLE);
        }
        londonShow = !londonShow;
    }

    private void madridChevronClicked() {
        if (madridShow) {
            madridChunk.setVisibility(View.GONE);
            madridClosed.setVisibility(View.VISIBLE);
        } else {
            madridClosed.setVisibility(View.GONE);
            madridChunk.setVisibility(View.VISIBLE);
        }
        madridShow = !madridShow;
    }

    private void tokyoChevronClicked() {
        if (tokyoShow) {
            tokyoChunk.setVisibility(View.GONE);
            tokyoClosed.setVisibility(View.VISIBLE);
        } else {
            tokyoClosed.setVisibility(View.GONE);
            tokyoChunk.setVisibility(View.VISIBLE);
        }
        tokyoShow = !tokyoShow;
    }
}
