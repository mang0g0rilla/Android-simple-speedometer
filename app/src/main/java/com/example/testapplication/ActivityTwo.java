package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textView = findViewById(R.id.text);

        String itemName = getIntent().getExtras().getString("itemName");
        textView.setText("You clicked " + itemName);
    }
}