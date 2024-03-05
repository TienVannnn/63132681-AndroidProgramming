package tienlv.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a, b, kq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    void TimDieuKhien(){
        a = findViewById(R.id.edtSoA);
        b = findViewById(R.id.edtSoB);
        kq = findViewById(R.id.edtKQ);
    }


    // xử lý cộng
    public void XuLyCong(View v){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA + soB;
        kq.setText(String.valueOf(t));
    }

    // xử lý trừ
    public void XuLyTru(View v){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA - soB;
        kq.setText(String.valueOf(t));
    }

    // xử lý nhân
    public void XuLyNhan(View v){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float t = soA * soB;
        kq.setText(String.valueOf(t));
    }

    // xử lý chia
    public void XuLyChia(View v){
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        if(soB == 0){
            kq.setText("b phải khác 0");
        }
        else {
            float t = soA / soB;
            kq.setText(String.valueOf(t));
        }
    }
}