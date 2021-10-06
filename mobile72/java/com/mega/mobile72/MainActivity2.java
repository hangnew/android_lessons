package com.mega.mobile72;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String tour = intent.getStringExtra("tour");
        Toast.makeText(getApplicationContext(), tour, Toast.LENGTH_SHORT).show();
        
    }
}