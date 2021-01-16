package com.example.prooject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Q7 extends AppCompatActivity implements View.OnClickListener {

    Button btn_s1;
    RadioGroup rg;
    RadioButton non;
    RadioButton oui;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);

        btn_s1=(Button)findViewById(R.id.btn_s1);
        rg = (RadioGroup)findViewById(R.id.radio);
        btn_s1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_s1:
                int id = rg.getCheckedRadioButtonId();
                non=(RadioButton) findViewById(R.id.radioButton2);
                oui=(RadioButton) findViewById(R.id.radioButton);
                if (oui.isChecked())
                {

                    score= getIntent().getExtras().getInt("score");
                    score=score+1;
                }
                else
                {
                    score= getIntent().getExtras().getInt("score");
                }



                Intent i = new Intent(this, Q8.class);
                i.putExtra("score", score);
                startActivity(i);

        }
    }}