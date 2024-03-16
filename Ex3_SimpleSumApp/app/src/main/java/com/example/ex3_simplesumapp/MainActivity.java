package com.example.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void hamTinhTong(View v){
        EditText a  = findViewById(R.id.edtSoA);
        EditText b  = findViewById(R.id.edtSoB);
        EditText kq  = findViewById(R.id.edtKQ);

        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();

        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float tong = soA + soB;
        kq.setText(String.valueOf(tong));
    }

}