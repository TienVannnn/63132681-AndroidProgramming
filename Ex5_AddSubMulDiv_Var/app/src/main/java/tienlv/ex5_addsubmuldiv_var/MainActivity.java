package tienlv.ex5_addsubmuldiv_var;

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
        // gắn các bộ lắng nghe
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(boLangNgheTru);
        nutNhan.setOnClickListener(boLangNgheNhan);
        nutChia.setOnClickListener(boLangNgheChia);
    }

    // tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNgheCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            XuLyCong();
        }
    };

    View.OnClickListener boLangNgheTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            XuLyTru();
        }
    };

    View.OnClickListener boLangNgheNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            XuLyNhan();
        }
    };

    View.OnClickListener boLangNgheChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            XuLyChia();
        }
    };

    void XuLyCong(){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA + soB;
        kq.setText(String.valueOf(t));
    }

    void XuLyTru(){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA - soB;
        kq.setText(String.valueOf(t));
    }

    void XuLyNhan(){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA * soB;
        kq.setText(String.valueOf(t));
    }

    void XuLyChia(){
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