package com.example.cse438movieappfall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsACtivity extends AppCompatActivity {

    Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        result = (Result) getIntent().getSerializableExtra("result");



    }
}