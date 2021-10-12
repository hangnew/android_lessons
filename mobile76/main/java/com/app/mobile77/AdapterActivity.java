package com.app.mobile77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        setTitle("ListView test");

        // 데이터
        ArrayList<String> mid = new ArrayList<>();
        mid.add("Heroes");
        mid.add("24");
        mid.add("Lost");
        mid.add("The Big Bang Theory");

        // 데이터를 넣을 view
        ListView listView = findViewById(R.id.adapterList1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = mid.get(i);
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });

        // adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mid);

        // view에 adapter 세팅
        listView.setAdapter(adapter);

        EditText t1 = findViewById(R.id.adapterText1);

        Button b1 = findViewById(R.id.adapterButton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = t1.getText().toString();
                mid.add(text);
                adapter.notifyDataSetChanged();
            }
        });

    }
}