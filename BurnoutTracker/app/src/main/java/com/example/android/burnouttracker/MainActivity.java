package com.example.android.burnouttracker;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    int buttonStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView currentDate = findViewById(R.id.currentDate);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        currentDate.setText(format.format(new Date()));

        final TextView status = findViewById(R.id.status);

        ImageView myPerson = findViewById(R.id.myPerson);

        final View veryBad = findViewById(R.id.veryBad);
        veryBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStatus = 1;
                status.setText("Очень плохо");
                status.setTextColor(Color.parseColor("#000000"));
                myPerson.setBackgroundColor(Color.parseColor("#000000"));
            }
        });

        final View bad = findViewById(R.id.bad);
        bad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStatus = 2;
                status.setText("Плохо");
                status.setTextColor(Color.parseColor("#ed1c24"));
                myPerson.setBackgroundColor(Color.parseColor("#ed1c24"));
            }
        });

        final View normal = findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStatus = 3;
                status.setText("Нормально");
                status.setTextColor(Color.parseColor("#ffc90e"));
                myPerson.setBackgroundColor(Color.parseColor("#ffc90e"));
            }
        });

        final View well = findViewById(R.id.well);
        well.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStatus = 4;
                status.setText("Хорошо");
                status.setTextColor(Color.parseColor("#22b14c"));
                myPerson.setBackgroundColor(Color.parseColor("#22b14c"));
            }
        });

        final View veryWell = findViewById(R.id.veryWell);
        veryWell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStatus = 5;
                status.setText("Очень хорошо");
                status.setTextColor(Color.parseColor("#00a2e8"));
                myPerson.setBackgroundColor(Color.parseColor("#00a2e8"));
            }
        });

        final ImageView playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "";
                switch (buttonStatus) {
                    case 1:
                        link = "https://inlnk.ru/AKaBXG";
                        break;
                    case 2:
                        link = "https://inlnk.ru/NDp90v";
                        break;
                    case 3:
                        link = "https://inlnk.ru/goxNLo";
                        break;
                    case 4:
                        link = "https://inlnk.ru/kXlmxm";
                        break;
                    case 5:
                        link = "https://inlnk.ru/poPeGZ";
                        break;
                }
                Intent toBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(toBrowser);
            }
        });
    }
}