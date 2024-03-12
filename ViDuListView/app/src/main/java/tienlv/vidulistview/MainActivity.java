package tienlv.vidulistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDsBH;
    ArrayAdapter<String> adapter;
    ArrayList<String> ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        ds.add("Chúng ta của tương lai");
        ds.add("Chúng ta của hiện tại");
        ds.add("Nâng chén tiêu sầu");
        ds.add("Thiên lý ơi");
        ds.add("Nơi này có anh");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ds);

        lvDsBH.setAdapter(adapter);
        lvDsBH.setOnItemClickListener(boLangNghe);
    }

    void init(){
        lvDsBH = findViewById(R.id.lvDsBH);
        ds = new ArrayList<>();
    }
    AdapterView.OnItemClickListener boLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String chonBaiHat = "Bạn chọn bài " + ds.get(position);
            Toast.makeText(MainActivity.this, chonBaiHat, Toast.LENGTH_SHORT).show();
        }
    };
}