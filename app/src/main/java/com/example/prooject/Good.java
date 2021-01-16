package com.example.prooject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Good extends AppCompatActivity   {
    Button exit;
    Button rt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good);
        exit =(Button) findViewById(R.id.nn);
        rt =(Button)findViewById(R.id.rt);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                finish();
                moveTaskToBack(true);

            }
        });

        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(Good.this, MainActivity3.class);
                startActivity(p1);
            }
        });
    }


}
