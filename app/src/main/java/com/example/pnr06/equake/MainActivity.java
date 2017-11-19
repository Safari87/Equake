package com.example.pnr06.equake;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView quakeListView = findViewById(R.id.quakeListView);

        ArrayList<String> quakeArray = new ArrayList<>();
        quakeArray.add("Algeria 5.2");
        quakeArray.add("Morocco 6.0");

        ArrayAdapter<String> quakeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quakeArray);

    }
}
