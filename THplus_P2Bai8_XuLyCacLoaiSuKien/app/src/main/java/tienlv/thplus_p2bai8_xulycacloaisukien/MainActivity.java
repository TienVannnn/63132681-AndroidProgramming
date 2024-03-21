package tienlv.thplus_p2bai8_xulycacloaisukien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtSoA, edtSoB;
    TextView tvKq;
    Button btnHieu, btnTich, btnThuong, btnUCLN, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        // Inline anonymous listener
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_soA = edtSoA.getText().toString();
                String str_soB = edtSoB.getText().toString();
                if(str_soB.isEmpty() || str_soA.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn phải nhập đầy đủ giá trị để tính toán", Toast.LENGTH_SHORT).show();
                }
                else{
                    float t = 0;
                    float soA = Float.parseFloat(str_soA);
                    float soB = Float.parseFloat(str_soB);
                    t = soA - soB;
                    tvKq.setText(String.valueOf(t));
                }
            }
        });
        btnThuong.setOnClickListener(thuongHaiSo);
        btnTich.setOnClickListener(this);
        btnUCLN.setOnClickListener(new eventExplicitListener());
    }

    void init(){
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        tvKq = findViewById(R.id.tvKQ);
        btnHieu = findViewById(R.id.btnHieu);
        btnTich = findViewById(R.id.btnTich);
        btnThuong = findViewById(R.id.btnThuong);
        btnUCLN = findViewById(R.id.btnUCLN);
        btnExit = findViewById(R.id.btnExit);
    }

    // onClick
    public void HamTinhTong(View v){
        String str_soA = edtSoA.getText().toString();
        String str_soB = edtSoB.getText().toString();
        if(str_soB.isEmpty() || str_soA.isEmpty()){
            Toast.makeText(this, "Bạn phải nhập đầy đủ giá trị để tính toán", Toast.LENGTH_SHORT).show();
        }
        else{
            float t = 0;
            float soA = Float.parseFloat(str_soA);
            float soB = Float.parseFloat(str_soB);
            t = soB + soA;
            tvKq.setText(String.valueOf(t));
        }
    }

    // Activity is listener
    @Override
    public void onClick(View v) {
        String str_soA = edtSoA.getText().toString();
        String str_soB = edtSoB.getText().toString();
        if(str_soB.isEmpty() || str_soA.isEmpty()){
            Toast.makeText(this, "Bạn phải nhập đầy đủ giá trị để tính toán", Toast.LENGTH_SHORT).show();
        }
        else{
            float t = 0;
            float soA = Float.parseFloat(str_soA);
            float soB = Float.parseFloat(str_soB);
            t = soB * soA;
            tvKq.setText(String.valueOf(t));
        }
    }

    // Listener in variable
    View.OnClickListener thuongHaiSo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str_soA = edtSoA.getText().toString();
            String str_soB = edtSoB.getText().toString();
            if(str_soB.isEmpty() || str_soA.isEmpty()){
                Toast.makeText(MainActivity.this, "Bạn phải nhập đầy đủ giá trị để tính toán", Toast.LENGTH_SHORT).show();
            }
            else{
                float t = 0;
                float soA = Float.parseFloat(str_soA);
                float soB = Float.parseFloat(str_soB);
                if(soB == 0){
                    Toast.makeText(MainActivity.this, "Số b phải khác 0", Toast.LENGTH_SHORT).show();
                }
                else{
                    t = soA / soB;
                    tvKq.setText(String.valueOf(t));
                }
            }
        }
    };

    public void HamExit(View view) {
        finish();
    }
}


// Explicit listener class
class eventExplicitListener implements View.OnClickListener{


    @Override
    public void onClick(View v) {
        EditText edtSoA = v.getRootView().findViewById(R.id.edtSoA);
        EditText edtSoB = v.getRootView().findViewById(R.id.edtSoB);
        TextView tvKq = v.getRootView().findViewById(R.id.tvKQ);
        String str_soA = edtSoA.getText().toString();
        String str_soB = edtSoB.getText().toString();
        if(str_soB.isEmpty() || str_soA.isEmpty()){
            Toast.makeText(v.getContext(),
                    "Bạn phải nhập đầy đủ giá trị để tính toán",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            float soA = Float.parseFloat(str_soA);
            float soB = Float.parseFloat(str_soB);
            if(soA == 0 && soB == 0){
                Toast.makeText(v.getContext(), "Không có ước chung lớn nhất của 2 số bằng 0", Toast.LENGTH_SHORT).show();
            }
            else if(soA == 0 && soB != 0){
                tvKq.setText(String.valueOf(soB));
            }
            else if(soA != 0 && soB == 0){
                tvKq.setText(String.valueOf(soA));
            }
            else{
                while (soA != soB ){
                    if(soA > soB) soA -= soB;
                    else soB -= soA;
                }
                tvKq.setText(String.valueOf(soA));
            }
        }
    }
}