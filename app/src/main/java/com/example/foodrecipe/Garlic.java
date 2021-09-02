package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Garlic extends AppCompatActivity {
    String name[] ={"Garlic Bread","Garlic Paratha","Garlic Nan"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.gar1,R.drawable.gar2,R.drawable.gar3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garlic);
        listView = findViewById(R.id.list_view);
        GarlicAdapter listAdapter = new GarlicAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}