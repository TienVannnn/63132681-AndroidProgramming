package tienlv.intent_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {
    Button btnRetry, btnQuit;
    TextView tvTotal, tvRightAnwser, tvWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        init();

        int totalScore = getIntent().getIntExtra("total", 0);
        int correctAnwser = getIntent().getIntExtra("score", 0);
        int wrong = totalScore - correctAnwser;

        tvTotal.setText(String.valueOf(totalScore));
        tvRightAnwser.setText(String.valueOf(correctAnwser));
        tvWrong.setText(String.valueOf(wrong));
        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backQuesAc = new Intent(ScoreActivity.this, QuestionActivity.class);
                startActivity(backQuesAc);
            }
        });
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void init(){
        btnRetry = findViewById(R.id.btnRetry);
        btnQuit = findViewById(R.id.btnQuit);
        tvTotal = findViewById(R.id.tvAll);
        tvRightAnwser = findViewById(R.id.tvRight);
        tvWrong = findViewById(R.id.tvWrong);
    }
}