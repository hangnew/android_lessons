package com.app.mobile74;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        t1 = findViewById(R.id.m3Text1);
        t1.setText(intent.getStringExtra("date"));

        t2 = findViewById(R.id.m3Text2);
        t2.setText(intent.getStringExtra("time"));

    }
}