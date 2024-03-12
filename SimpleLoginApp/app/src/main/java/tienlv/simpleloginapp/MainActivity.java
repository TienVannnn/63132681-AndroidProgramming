package tienlv.simpleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUser, edtPass;
    TextView tvAtt;
    int dem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    void init(){
        edtUser = findViewById(R.id.edtUsername);
        edtPass = findViewById(R.id.edtPass);
        tvAtt = findViewById(R.id.tvAtt);
    }

    public void HamDangNhap(View view){
        String str_user = edtUser.getText().toString();
        String str_pass = edtPass.getText().toString();
        if(str_user.equals("levantien") && str_pass.equals("cntt63ntu!")){
            Toast.makeText(MainActivity.this, "User and Password are correct", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "User and Password are wrong", Toast.LENGTH_SHORT).show();
            dem++;
        }
        tvAtt.setText(String.valueOf(dem));
    }
}