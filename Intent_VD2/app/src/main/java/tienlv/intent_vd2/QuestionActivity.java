package tienlv.intent_vd2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {
    ConstraintLayout opContainer;
    Button o1, o2, o3, o4, btnNext, tryAgain;
    TextView tvQues, totalQues, tvTime;

    ArrayList<QuestionModel> list = new ArrayList<>();
    private int count = 0;
    private int position = 0;
    private int score = 0;
    CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        init();
        resetTimer();
        String setName = getIntent().getStringExtra("set");
        if(setName.equals("Java")){
            setOne();
        }
        else if(setName.equals("Toán")){
            setTwo();
        }

        for(int i = 0; i < 4; i++){
            opContainer.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    checkAnwser((Button) v);
                }
            });
        }

        playAnimation(tvQues, 0, list.get(position).getQuestion());

        if (btnNext != null) {
            btnNext.setOnClickListener(cauTiepTheo);
        } else {
            Log.e("ERROR", "btnNext is null");
        }


    }

    private void resetTimer() {
        timer = new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTime.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                // Chuyển sang câu hỏi tiếp theo
                cauTiepTheo.onClick(null);
            }
        };
        timer.start();
    }

    private void setTwo() {
        list.add(new QuestionModel("1 + 1 = ?", "1", "2", "3", "4", "2" ));
        list.add(new QuestionModel("1 + 2 = ?", "1", "2", "3", "4", "3" ));
        list.add(new QuestionModel("1 + 3 = ?", "1", "2", "3", "4", "4" ));
        list.add(new QuestionModel("1 + 4 = ?", "5", "2", "3", "4", "5" ));
        list.add(new QuestionModel("1 + 5 = ?", "1", "2", "6", "4", "6" ));
        list.add(new QuestionModel("1 + 6 = ?", "1", "7", "3", "4", "7" ));
    }

    private void setOne() {
        list.add(new QuestionModel("1. Tùy chọn nào sau đây dẫn đến tính di động và bảo mật của Java?", "Bytecode được thực thi bởi JVM", "Applet làm cho mã Java an toàn và di động", "Sử dụng xử lý ngoại lệ", "Liên kết động giữa các đối tượng", "Bytecode được thực thi bởi JVM" ));
        list.add(new QuestionModel("3. _____ được sử dụng để tìm và sửa lỗi trong các chương trình Java?", "JVM", "JRE", "JDK", "JDB", "JDB" ));
        list.add(new QuestionModel("4. Điều nào sau đây là một khai báo hợp lệ của một char?", "char ch = ‘\\utea’;", "char ca = ‘tea’;", "char cr = \\u0223;", "char cc = ‘\\itea’;", "char ch = ‘\\utea’;" ));
        list.add(new QuestionModel("Kiểu trả về của phương thức hashCode () trong lớp Object là gì?", "object", "int", "long", "void", "int" ));
        list.add(new QuestionModel("6. Đâu là một “long literal” hợp lệ?", "ABH8097", "L990023", "904423", "0xnf029L", "0xnf029L" ));
    }

    private void checkAnwser(Button selectedOption) {
        btnNext.setEnabled(true);
        btnNext.setAlpha(1);
        if(selectedOption.getText().toString().equals(list.get(position).getCorrectAnswer())){
            score++;
            selectedOption.setBackgroundResource(R.drawable.right_anwser);
        }
        else {
            selectedOption.setBackgroundResource(R.drawable.wrong_anwser);
            Button correctOption = opContainer.findViewWithTag(list.get(position).getCorrectAnswer());
            correctOption.setBackgroundResource(R.drawable.right_anwser);
        }
    }

    public void init(){
        opContainer = findViewById(R.id.obContainer);
        o1 = findViewById(R.id.btn1);
        o2 = findViewById(R.id.btn2);
        o3 = findViewById(R.id.btn3);
        o4 = findViewById(R.id.btn4);
        btnNext = findViewById(R.id.btnNext);
        tryAgain = findViewById(R.id.tryAgain);
        tvQues = findViewById(R.id.tvQuestion);
        totalQues = findViewById(R.id.tvTotalQues);
        tvTime = findViewById(R.id.tvTime);
    }

    View.OnClickListener cauTiepTheo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btnNext.setEnabled(false);
            btnNext.setAlpha((float) 0.3);
            enableOption(true);
            position++;
            if(position == list.size()){
                Intent iScore = new Intent(QuestionActivity.this, ScoreActivity.class);
                iScore.putExtra("score", score);
                iScore.putExtra("total", list.size());
                startActivity(iScore);
                finish();
                return;
            }
            count = 0;
            playAnimation(tvQues, 0, list.get(position).getQuestion());
            if (timer != null) {
                timer.cancel(); // Hủy bỏ đồng hồ đếm ngược hiện tại nếu đang hoạt động
            }
            resetTimer(); // Bắt đầu một đồng hồ đếm ngược mới
        }
    };


    private void playAnimation(View view, int value, String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {
                if(value == 0 && count < 4){
                    String option = "";
                    if(count == 0){
                        option = list.get(position).getOpA();
                    } else if (count == 1) {
                        option = list.get(position).getOpB();
                    }else if (count == 2) {
                        option = list.get(position).getOpC();
                    }else if (count == 3) {
                        option = list.get(position).getOpD();
                    }
                    playAnimation(opContainer.getChildAt(count), 0, option);
                    count++;
                }
            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                if(value == 0){
                    try {
                        ((TextView) view).setText(data);
                        totalQues.setText(position + 1 + "/" + list.size());
                    }catch (Exception e){
                        ((Button) view).setText(data);
                    }
                    view.setTag(data);
                    playAnimation(view, 1, data);
                }
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });
    }

    private void enableOption(boolean enable) {
        for(int i = 0; i < 4; i++){
            opContainer.getChildAt(i).setEnabled(enable);
            if(enable){
                opContainer.getChildAt(i).setBackgroundResource(R.drawable.custom_btn);
            }
        }
    }
}