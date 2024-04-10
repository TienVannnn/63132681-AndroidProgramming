package tienlv.examplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> ds;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds = getDataRecycleView();
        recyclerView = findViewById(R.id.recycleview);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutLinear);
        landscapeAdapter = new LandscapeAdapter(this, ds);
        recyclerView.setAdapter(landscapeAdapter);
    }

    ArrayList<Landscape> getDataRecycleView(){
        ArrayList<Landscape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new Landscape("Hạ Long Bay", "halongbay"));
        dsDuLieu.add(new Landscape("Đà Lạt", "dalat"));
        dsDuLieu.add(new Landscape("Phong Nha Kẻ Bàng", "phongnhakebang"));
        dsDuLieu.add(new Landscape("TP Hồ Chí Minh", "hochiminh"));
        return dsDuLieu;
    }
}