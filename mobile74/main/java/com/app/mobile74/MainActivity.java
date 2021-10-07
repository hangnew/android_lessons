package com.app.mobile74;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    Button buttonStart, buttonEnd;
    RadioButton radioCal, radioTime;
    CalendarView viewCal;
    TimePicker pickerTime;
    TextView textResult;
    String date, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("날짜, 시간 예약");

        chrono = findViewById(R.id.chrono);

        viewCal = findViewById(R.id.viewCal);
        viewCal.setVisibility(View.INVISIBLE);
        viewCal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int yy, int mm, int dd) {
                date = yy + "/" + (mm + 1) + "/" + dd;
                toast(date);
            }
        });

        pickerTime = findViewById(R.id.pickerTime);
        pickerTime.setVisibility(View.INVISIBLE);

        textResult = findViewById(R.id.textResult);

        radioCal = findViewById(R.id.radioCal);
        radioCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewCal.setVisibility(View.VISIBLE);
                pickerTime.setVisibility(View.INVISIBLE);
            }
        });

        radioTime = findViewById(R.id.radioTime);
        radioTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewCal.setVisibility(View.INVISIBLE);
                pickerTime.setVisibility(View.VISIBLE);
            }
        });

        buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.BLUE);
            }
        });

        buttonEnd = findViewById(R.id.buttonEnd);
        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.RED);
                time = pickerTime.getCurrentHour() + ":" + pickerTime.getCurrentMinute();
                toast(time);
                textResult.setText("예약 날짜: " + date + " " + time);
            }
        });
    }

    public void toast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

}