package tienlv.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HamTinhToan(View v){
        EditText h  = findViewById(R.id.edtHeight);
        EditText w  = findViewById(R.id.edtWeight);
        EditText kq  = findViewById(R.id.edtKQ);
        TextView lastKQ = findViewById(R.id.tvKQ);

        String str_height = h.getText().toString();
        String str_weight = w.getText().toString();

        float height_m = Float.parseFloat(str_height);
        float weight = Float.parseFloat(str_weight);
        float height_cm = height_m/100;
        float bmi = weight/ (height_cm * height_cm);

        kq.setText(String.valueOf(bmi));

        if(bmi < 18.5) {
            lastKQ.setText("Gầy!");
        }
        else if(bmi <= 24.9){
            lastKQ.setText("Bình thường!");
        } else if (bmi <= 25) {
            lastKQ.setText("Thừa cân!");
        } else if (bmi <= 29.9) {
            lastKQ.setText("Tiền béo phì!");
        } else if (bmi <= 34.9) {
            lastKQ.setText("Béo phì độ 1!");
        } else if (bmi <= 39.9) {
            lastKQ.setText("Béo phì độ 2!");
        }
        else lastKQ.setText("Béo phì độ 3!");
    }

    public void HamReset(View v){
        EditText h  = findViewById(R.id.edtHeight);
        EditText w  = findViewById(R.id.edtWeight);
        EditText kq  = findViewById(R.id.edtKQ);
        TextView lastKQ = findViewById(R.id.tvKQ);

        h.setText("");
        w.setText("");
        kq.setText("");
        lastKQ.setText("");
    }


}