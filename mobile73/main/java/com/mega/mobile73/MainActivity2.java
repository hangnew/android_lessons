package com.mega.mobile73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    ImageButton b5, b6, b7, b8;
    String animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent before = getIntent();
        animal = before.getStringExtra("animal");
        toast("잘 가! " + animal);

        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);

        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
    }

    public void toast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("animal", animal);
        String tool = "";
        if (view.getId() == R.id.b5) {
            tool = "도끼";
        } else if (view.getId() == R.id.b6) {
            tool = "잭나이프";
        } else if (view.getId() == R.id.b7) {
            tool = "무전기";
        } else {
            tool = "망원경";
        }
        intent.putExtra("tool", tool);
        startActivity(intent);
    }
}