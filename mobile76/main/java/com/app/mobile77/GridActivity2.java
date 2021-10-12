package com.app.mobile77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);

        MyGridAdapter2 gridAdapter2 = new MyGridAdapter2(this);
        GridView gridView2 = findViewById(R.id.gridView2);
        gridView2.setAdapter(gridAdapter2);

    }
}