package tienlv.apptinhtoanbangdulieungaunhien;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvSo1, tvSo2,tvKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    void init(){
        tvSo1 =  findViewById(R.id.tvSo1);
        tvSo2 =  findViewById(R.id.tvSo2);
        tvKq =  findViewById(R.id.tvKQ);
    }

    public void HamTaoDuLieu(View v){
        tvSo1.setText(String.valueOf(new Random().nextInt(10) + 1));
        tvSo2.setText(String.valueOf(new Random().nextInt(10) + 1));
        tvKq.setText("");
    }

    public void HamCong(View v){
        String so1 = tvSo1.getText().toString();
        String so2 = tvSo2.getText().toString();
        tvKq.setText(String.valueOf(Float.parseFloat(so1) + Float.parseFloat(so2)));
    }
    public void HamTru(View v){
        String so1 = tvSo1.getText().toString();
        String so2 = tvSo2.getText().toString();
        tvKq.setText(String.valueOf(Float.parseFloat(so1) - Float.parseFloat(so2)));
    }
    public void HamNhan(View v){
        String so1 = tvSo1.getText().toString();
        String so2 = tvSo2.getText().toString();
        tvKq.setText(String.valueOf(Float.parseFloat(so1) * Float.parseFloat(so2)));
    }
    public void HamChia(View v){
        String so1 = tvSo1.getText().toString();
        String so2 = tvSo2.getText().toString();
        tvKq.setText(String.valueOf(Float.parseFloat(so1) / Float.parseFloat(so2)));
    }
}