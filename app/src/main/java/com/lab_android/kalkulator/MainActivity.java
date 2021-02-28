package com.lab_android.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText value1;
    private EditText value2;
    private TextView viewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = (EditText) findViewById(R.id.value1);
        value2 = (EditText) findViewById(R.id.value2);
        viewHasil = (TextView) findViewById(R.id.viewHasil);
    }

    public void clickTambah(View view) {
        int v1 = Integer.parseInt(value1.getText().toString());
        int v2 = Integer.parseInt(value2.getText().toString());
        int hasilTambah = v1 + v2;
        viewHasil.setText(String.valueOf(hasilTambah));
    }

    public void clickKurang(View view) {
        int v1 = Integer.parseInt(value1.getText().toString());
        int v2 = Integer.parseInt(value2.getText().toString());
        int hasilKurang = v1 - v2;
        viewHasil.setText(String.valueOf(hasilKurang));
    }

    public void clickKali(View view) {
        int v1 = Integer.parseInt(value1.getText().toString());
        int v2 = Integer.parseInt(value2.getText().toString());
        int hasilKali = v1 * v2;
        viewHasil.setText(String.valueOf(hasilKali));
    }

    public void clickBagi(View view) {
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        if(v2 == 0){
            viewHasil.setText("Tidak Terdefinisi");
        }else {
            float hasilBagi = v1 / v2;
            viewHasil.setText(String.valueOf(hasilBagi));
        }
    }
}