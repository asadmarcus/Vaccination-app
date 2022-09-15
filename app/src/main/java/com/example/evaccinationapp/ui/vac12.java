package com.example.evaccinationapp.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaccinationapp.R;

public class vac12 extends AppCompatActivity {

    Button btn_dose1, btn_dose2;
    TextView tv_numOfDays;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "vac12";
    public static final String DOSE1 = "dose1";
    public static final String DOSE2 = "dose2";
    public static final String numOfDays = "numofdays";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vac12);

        btn_dose1 = findViewById(R.id.btn_dose1);
        btn_dose2 = findViewById(R.id.btn_dose2);
        tv_numOfDays = findViewById(R.id.tv_vac8);

        fillUi();

        btn_dose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(DOSE1, "true");
                editor.putString(DOSE2, "false");
                editor.putString(numOfDays, "28");
                editor.commit();
                fillUi();
            }
        });

        btn_dose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(DOSE1, "true");
                editor.putString(DOSE2, "true");
                editor.putString(numOfDays, "0");
                editor.commit();
                fillUi();
            }
        });

    }

    private void fillUi() {
        try {
            SharedPreferences sh = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            String dose1 = sh.getString(DOSE1, "false");
            String dose2 = sh.getString(DOSE2, "false");
            String numOfDaysLeft = sh.getString(numOfDays, "0");

            if (dose1.equals("false")) {
                btn_dose1.setBackgroundColor(getResources().getColor(R.color.light_red));
            } else {
                btn_dose1.setBackgroundColor(getResources().getColor(R.color.light_green));
            }
            if (dose2.equals("false")) {
                btn_dose2.setBackgroundColor(getResources().getColor(R.color.light_red));
            } else {
                btn_dose2.setBackgroundColor(getResources().getColor(R.color.light_green));
            }

            tv_numOfDays.setText("days left for next dose : " + numOfDaysLeft);

        } catch (Exception e) {
            btn_dose1.setBackgroundColor(getResources().getColor(R.color.light_red));
            btn_dose2.setBackgroundColor(getResources().getColor(R.color.light_red));
            tv_numOfDays.setText("days left for next dose : 0");
        }
    }
}