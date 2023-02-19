package com.example.androidbuoi1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class reviewActivity extends AppCompatActivity {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        tv = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String v1 = intent.getStringExtra("v1");
        String v2 = intent.getStringExtra("v2");
        String cal = intent.getStringExtra("cal");
        String r = intent.getStringExtra("r");
        tv.setText("History cal: " + v1 + " " + cal + " " + v2 + " = " + r);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (tv.getText().toString()!=null)
            outState.putString("review", tv.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.get("review")!=null)
            tv.setText(savedInstanceState.get("review").toString());
    }
}