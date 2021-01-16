package com.example.prooject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    ListView listview;
    Button addButton;
    EditText GetValue;
    String[] ListElements = new String[] {
            "msaken : +21699779192",
            "Sousse : +21693100183",             "tunis : +21693100183",              " mahdia : +21699779192",
            "msaken : +21699779192",
            "msaken : +21699779192",
            "Sousse : +21693100183",           "msaken : +21699779192",

            "Sousse : +21693100183",              "msaken : +21699779192",



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        listview = findViewById(R.id.listView1);
        addButton = findViewById(R.id.button1);
        GetValue = findViewById(R.id.editText1);

        final List<String> ListElementsArrayList = new ArrayList<>(Arrays.asList(ListElements));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>
                (MainActivity3.this, android.R.layout.simple_list_item_1, ListElementsArrayList);
        listview.setAdapter(adapter);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListElementsArrayList.add(GetValue.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}