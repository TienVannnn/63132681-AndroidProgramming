package tienlv.viewpager2recyclerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> ds;
    ViewPager2 viewPager2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds = getDataViewPager2();
        viewPager2Land = findViewById(R.id.vp2Land);
        landscapeAdapter = new LandscapeAdapter(this, ds);
        viewPager2Land.setAdapter(landscapeAdapter);
    }

    ArrayList<Landscape> getDataViewPager2(){
        ArrayList<Landscape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new Landscape("Hạ Long Bay", "halongbay"));
        dsDuLieu.add(new Landscape("Đà Lạt", "dalat"));
        dsDuLieu.add(new Landscape("Phong Nha Kẻ Bàng", "phongnhakebang"));
        dsDuLieu.add(new Landscape("TP Hồ Chí Minh", "hochiminh"));
        return dsDuLieu;
    }
}