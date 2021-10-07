package com.mega.mobile73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    ImageButton b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String animal = "";
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        if (view.getId() == R.id.b1){
            animal = "호랑이";
        } else if (view.getId() == R.id.b2){
            animal = "양";
        } else if (view.getId() == R.id.b3){
            animal = "돼지";
        } else {
            animal = "원숭이";
        }
        intent.putExtra("animal", animal);
        startActivity(intent);
    }
}