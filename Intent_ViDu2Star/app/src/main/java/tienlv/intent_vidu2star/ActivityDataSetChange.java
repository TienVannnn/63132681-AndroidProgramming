package tienlv.intent_vidu2star;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityDataSetChange extends AppCompatActivity {
    Button btnSetData, btnCancle;
    EditText edtTen, edtNamSinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_set_change);
        init();
        btnSetData.setOnClickListener(setData);
        btnCancle.setOnClickListener(cancle);

    }

    View.OnClickListener setData = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String ten = edtTen.getText().toString();
            String nam = edtNamSinh.getText().toString();
            if(ten.isEmpty() || nam.isEmpty()){
                Toast.makeText(ActivityDataSetChange.this, "Chưa nhập dữ liệu!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent iSet = new Intent();
                iSet.putExtra("hoTen", ten);
                iSet.putExtra("namSinh", nam);
                setResult(RESULT_OK, iSet);
                finish();
            }
        }
    };

    View.OnClickListener cancle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edtTen.setText("");
            edtNamSinh.setText("");
            edtTen.requestFocus();
        }
    };
    public void init(){
        btnSetData = findViewById(R.id.btnSetData);
        btnCancle = findViewById(R.id.btnCancle);
        edtTen = findViewById(R.id.edtHoTen);
        edtNamSinh = findViewById(R.id.edtNamSinh);
    }
}