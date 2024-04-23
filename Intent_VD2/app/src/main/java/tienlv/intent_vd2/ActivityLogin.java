package tienlv.intent_vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {
    EditText userName, pass, mail;
    Button btnOk;
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btnOk.setOnClickListener(ChuyenDenHome);
    }

    View.OnClickListener ChuyenDenHome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tenDN = userName.getText().toString();
            String pw = pass.getText().toString();
            String email = mail.getText().toString();
            if(tenDN.equals("levantien") && pw.equals("63CNTT2")){
                if(email.matches(EMAIL_REGEX)){
                    Intent iQuiz = new Intent(ActivityLogin.this, ActivityHome.class);
                    iQuiz.putExtra("userName", tenDN);
                    startActivity(iQuiz);
                }
                else {
                    Toast.makeText(ActivityLogin.this, "Email không hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(ActivityLogin.this, "Tên đăng nhập hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
            }
        }
    };

    public void init(){
        userName = findViewById(R.id.edtUserName);
        pass = findViewById(R.id.edtPass);
        mail = findViewById(R.id.edtMail);
        btnOk = findViewById(R.id.btnOK);
    }
}