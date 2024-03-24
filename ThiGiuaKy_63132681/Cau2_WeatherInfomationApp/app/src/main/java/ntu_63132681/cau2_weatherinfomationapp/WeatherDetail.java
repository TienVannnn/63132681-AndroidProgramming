package ntu_63132681.cau2_weatherinfomationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherDetail extends AppCompatActivity {
    TextView tvTPDT, tvDoCDT, tvMoTaDT;
    ImageView imgDT;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_detail);
        init();

        Intent item_detail = getIntent();

        String tp = item_detail.getStringExtra("tenTP");
        String moTa = item_detail.getStringExtra("moTa");
        String doC = item_detail.getStringExtra("do");
        String img = item_detail.getStringExtra("img");

        tvTPDT.setText(tp);
        tvMoTaDT.setText(moTa);
        tvDoCDT.setText(doC);
        imgDT.setImageResource(Integer.parseInt(img));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    void init(){
        tvTPDT = findViewById(R.id.tvTPDT);
        tvDoCDT = findViewById(R.id.tvDoCDT);
        tvMoTaDT = findViewById(R.id.tvMoTaDT);
        imgDT = findViewById(R.id.imgDT);
        btnBack = findViewById(R.id.btnBack);
    }
}