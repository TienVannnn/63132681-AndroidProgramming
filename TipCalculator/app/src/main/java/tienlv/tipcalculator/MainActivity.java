package tienlv.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtData;
    Button btnTinh;
    TextView tvKQ;
    RadioGroup radioGroup;
    RadioButton r1, r2, r3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnTinh.setOnClickListener(boLangNghe);
    }
    void init(){
        edtData = findViewById(R.id.edtData);
        btnTinh = findViewById(R.id.btnTinh);
        tvKQ = findViewById(R.id.tvKQ);
        radioGroup = findViewById(R.id.radioGroup);
        r1 = findViewById(R.id.radio13);
        r2 = findViewById(R.id.radio15);
        r3 = findViewById(R.id.radio18);
    }

    View.OnClickListener boLangNghe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            HamTinh();
        }
    };

    public void HamTinh(){
        String strData = edtData.getText().toString();
        if(strData.isEmpty()){
            Toast.makeText(this, "Bạn cần phải nhập giá trị", Toast.LENGTH_SHORT).show();
        }
        else{
            int selected = radioGroup.getCheckedRadioButtonId();
            if(selected == -1){
                Toast.makeText(this, "Bạn phải chọn phần trăm để tính!", Toast.LENGTH_SHORT).show();
            }
            else{
                float tiLeTip = 0;
                float data = Float.parseFloat(strData);
                if(r1.isChecked()){
                    tiLeTip = 0.13f;
                }
                else if(r2.isChecked()){
                    tiLeTip = 0.15f;
                }
                else tiLeTip = 0.18f;
                tvKQ.setText("Your tip will be $" + String.format("%.2f", data * tiLeTip));
            }
        }
    }
}