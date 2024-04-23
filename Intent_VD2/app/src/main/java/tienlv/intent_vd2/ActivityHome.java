package tienlv.intent_vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
    TextView tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUserName = findViewById(R.id.tvUserName);
        Intent getIQuiz = getIntent();
        tvUserName.setText(getIQuiz.getStringExtra("userName"));
    }
}