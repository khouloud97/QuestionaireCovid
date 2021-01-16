package com.example.prooject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Page1 extends AppCompatActivity {
ImageButton info;
    ImageButton map;
    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        btn = (ImageButton)findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(Page1.this, MainActivity.class);
                startActivity(p1);
            }

        });



        info=(ImageButton)findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(Page1.this, MainActivity3.class);
                startActivity(p1);
            }
        });


        map=(ImageButton)findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://news.google.com/covid19/map?hl=fr&gl=FR&ceid=FR:fr";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        }

    }