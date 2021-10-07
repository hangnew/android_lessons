package com.app.mobile74;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.TimePicker;

public class MainActivity2 extends AppCompatActivity {

    Chronometer chrono;
    TimePicker timePicker;
    CalendarView calView;
    Button b1, b2, b3, b4, b5;
    String time, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        chrono = findViewById(R.id.m2Chrono);

        timePicker = findViewById(R.id.m2Time);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                time = hour + "시 " + minute + "분";
            }
        });

        calView = findViewById(R.id.m2Cal);
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                date = year + "년 " + (month + 1) + "월 " + day + "일";
            }
        });

        b1 = findViewById(R.id.m2Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
            }
        });

        b2 = findViewById(R.id.m2Button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.RED);
            }
        });

        b3 = findViewById(R.id.m2Button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity2.this);
                alert.setTitle("선택한 날짜");
                alert.setMessage(date);
                alert.setPositiveButton("닫기", null);
                alert.show();
            }
        });

        b4 = findViewById(R.id.m2Button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity2.this);
                alert.setTitle("선택한 시간");
                alert.setMessage(time);
                alert.setPositiveButton("닫기", null);
                alert.show();
            }
        });

        b5 = findViewById(R.id.m2Button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("time", time);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}