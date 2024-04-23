package tienlv.intent_vd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(quayVeTrangChu);
    }

    View.OnClickListener quayVeTrangChu = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent backHome = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(backHome);
        }
    };
}