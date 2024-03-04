package tienlv.formtinhtoan;

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

    public void XuLyCong(View v){
        EditText a = findViewById(R.id.edtA);
        EditText b = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtResult);
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float tong = soA + soB;
        KQ.setText(String.valueOf(tong));
    }

    public void XuLyTru(View v){
        EditText a = findViewById(R.id.edtA);
        EditText b = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtResult);
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float tong = soA - soB;
        KQ.setText(String.valueOf(tong));
    }

    public void XuLyNhan(View v){
        EditText a = findViewById(R.id.edtA);
        EditText b = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtResult);
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        float tong = soA * soB;
        KQ.setText(String.valueOf(tong));
    }

    public void XuLyChia(View v){
        EditText a = findViewById(R.id.edtA);
        EditText b = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtResult);
        String str_soA = a.getText().toString();
        String str_soB = b.getText().toString();
        float soA = Float.parseFloat(str_soA);
        float soB = Float.parseFloat(str_soB);
        if(soB == 0){
            KQ.setText("b phải khác không");
        }
        else{
            float tong = soA / soB;
            KQ.setText(String.valueOf(tong));
        }

    }
}