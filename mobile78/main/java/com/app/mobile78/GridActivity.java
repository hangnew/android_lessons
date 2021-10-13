package com.app.mobile78;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        PerfectAdapter gridAdapter = new PerfectAdapter(this);
        GridView gridView = findViewById(R.id.grid1gridView);
        gridView.setAdapter(gridAdapter);

        int[] like = new int[8];

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                View one2 = View.inflate(GridActivity.this, R.layout.one2, null);
                ImageView one2Img = one2.findViewById(R.id.one2img1);
                one2Img.setImageResource(gridAdapter.posterID[i]);
                EditText text = one2.findViewById(R.id.one2text1);
                Button b = one2.findViewById(R.id.one2button1);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (text.getText().length() != 0) {
                            int likeNum = Integer.parseInt(text.getText().toString());
                            like[i] += likeNum;
                        }
                        Toast.makeText(getApplicationContext(), like[i] + "표", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog.Builder alert = new AlertDialog.Builder(GridActivity.this);
                alert.setTitle("영화 상세 내용");
                alert.setView(one2);
                alert.setNegativeButton("취소", null);
                alert.show();
            }
        });

    }
}