package com.app.mobile74;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button b1;
    EditText t1, t2;
    TextView t3, t4, t5;
    View dialogView, toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        dialogView = View.inflate(MainActivity4.this, R.layout.dialog1, null);
        toastView = View.inflate(MainActivity4.this, R.layout.toast1, null);

        t1 = dialogView.findViewById(R.id.dialog1Text1);
        t2 = dialogView.findViewById(R.id.dialog1Text2);
        t3 = findViewById(R.id.m4Text1);
        t4 = findViewById(R.id.m4Text2);
        t5 = toastView.findViewById(R.id.toastText1);

        b1 = findViewById(R.id.m4Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity4.this);
                dialog.setTitle("사용자 정보 입력");
                dialog.setView(dialogView);
                dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        t3.setText(t1.getText().toString());
                        t4.setText(t2.getText().toString());
                    }
                });
                dialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(MainActivity4.this);
                        toast.setView(toastView);
                        t5.setText("취소했습니다.");
                        toast.show();
                    }
                });
                dialog.show();
            }
        });
    }
}