package com.mega.mobile73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView t1, t2;
    Button b9, b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent before = getIntent();

        t1 = findViewById(R.id.t1);
        String animal = before.getStringExtra("animal");
        t1.setText(animal);

        t2 = findViewById(R.id.t2);
        String tool = before.getStringExtra("tool");
        t2.setText(tool);

        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.animal.go.kr"));
                startActivity(intent);
            }
        });

        b10 = findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}