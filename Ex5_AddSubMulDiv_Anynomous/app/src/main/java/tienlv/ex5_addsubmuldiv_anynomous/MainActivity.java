package tienlv.ex5_addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a, b, kq;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_soA = a.getText().toString();
                String str_soB = b.getText().toString();
                float soA = Float.parseFloat(str_soA);
                float soB = Float.parseFloat(str_soB);
                float t = soA + soB;
                kq.setText(String.valueOf(t));
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_soA = a.getText().toString();
                String str_soB = b.getText().toString();
                float soA = Float.parseFloat(str_soA);
                float soB = Float.parseFloat(str_soB);
                float t = soA - soB;
                kq.setText(String.valueOf(t));
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_soA = a.getText().toString();
                String str_soB = b.getText().toString();
                float soA = Float.parseFloat(str_soA);
                float soB = Float.parseFloat(str_soB);
                float t = soA * soB;
                kq.setText(String.valueOf(t));
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_soA = a.getText().toString();
                String str_soB = b.getText().toString();
                float soA = Float.parseFloat(str_soA);
                float soB = Float.parseFloat(str_soB);
                if(soB == 0){
                    kq.setText("b phải khác 0 !");
                    b.setText("");
                    b.requestFocus();
                }
                else{
                    float t = soA / soB;
                    kq.setText(String.valueOf(t));
                }
            }
        });
    }

    void TimDieuKhien(){
        a = findViewById(R.id.edtSoA);
        b = findViewById(R.id.edtSoB);
        kq = findViewById(R.id.edtKQ);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }


}