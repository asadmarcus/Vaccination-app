package com.example.evaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaccinationapp.ui.vac1;
import com.example.evaccinationapp.ui.vac10;
import com.example.evaccinationapp.ui.vac11;
import com.example.evaccinationapp.ui.vac12;
import com.example.evaccinationapp.ui.vac2;
import com.example.evaccinationapp.ui.vac3;
import com.example.evaccinationapp.ui.vac4;
import com.example.evaccinationapp.ui.vac5;
import com.example.evaccinationapp.ui.vac6;
import com.example.evaccinationapp.ui.vac7;
import com.example.evaccinationapp.ui.vac8;
import com.example.evaccinationapp.ui.vac9;

public class MainActivity extends AppCompatActivity {

    TextView btn_vac1, btn_vac2, btn_vac3, btn_vac4, btn_vac5, btn_vac6, btn_vac7, btn_vac8, btn_vac9, btn_vac10, btn_vac11, btn_vac12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_vac1 = findViewById(R.id.tv_vac1);
        btn_vac2 = findViewById(R.id.tv_vac2);
        btn_vac3 = findViewById(R.id.tv_vac3);
        btn_vac4 = findViewById(R.id.tv_vac4);
        btn_vac5 = findViewById(R.id.tv_vac5);
        btn_vac6 = findViewById(R.id.tv_vac6);
        btn_vac7 = findViewById(R.id.tv_vac7);
        btn_vac8 = findViewById(R.id.tv_vac8);
        btn_vac9 = findViewById(R.id.tv_vac9);
        btn_vac10 = findViewById(R.id.tv_vac10);
        btn_vac11 = findViewById(R.id.tv_vac11);
        btn_vac12 = findViewById(R.id.tv_vac12);

        btn_vac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac1.class));
            }
        });
        btn_vac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac2.class));
            }
        });
        btn_vac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac3.class));
            }
        });
        btn_vac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac4.class));
            }
        });
        btn_vac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac5.class));
            }
        });
        btn_vac6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac6.class));
            }
        });
        btn_vac7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac7.class));
            }
        });
        btn_vac8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac8.class));
            }
        });
        btn_vac9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac9.class));
            }
        });
        btn_vac10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac10.class));
            }
        });
        btn_vac11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac11.class));
            }
        });
        btn_vac12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, vac12.class));
            }
        });

    }
}