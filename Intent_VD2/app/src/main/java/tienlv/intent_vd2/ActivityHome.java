package tienlv.intent_vd2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityHome extends AppCompatActivity {
    TextView tvUserName;
    ArrayList<SetModel> ds;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUserName = findViewById(R.id.tvUserName);
        Intent getIQuiz = getIntent();
        tvUserName.setText(getIQuiz.getStringExtra("userName"));
        ds = new ArrayList<>();
        ds.add(new SetModel("Java", R.drawable.java));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));
        ds.add(new SetModel("Toán", R.drawable.mathbook));

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SetAdapter(ds, this));
    }
}