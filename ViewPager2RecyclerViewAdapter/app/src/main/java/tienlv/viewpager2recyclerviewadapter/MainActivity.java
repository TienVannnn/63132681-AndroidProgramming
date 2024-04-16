package tienlv.viewpager2recyclerviewadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

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
//        viewPager2Land.setPageTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                final float MIN_SCALE = 0.75f;
//                int pageWidth = page.getWidth();
//                if (position < -1) {
//                    page.setAlpha(0f);
//                } else if (position <= 0) {
//                    page.setAlpha(1f);
//                    page.setTranslationX(0f);
//                    page.setScaleX(1f);
//                    page.setScaleY(1f);
//                } else if (position <= 1) {
//                    page.setAlpha(1 - position);
//                    page.setTranslationX(pageWidth * -position);
//                    float scaleFactor = MIN_SCALE
//                            + (1 - MIN_SCALE) * (1 - Math.abs(position));
//                    page.setScaleX(scaleFactor);
//                    page.setScaleY(scaleFactor);
//                } else {
//                    page.setAlpha(0f);
//                }
//            }
//        });

        viewPager2Land.setPageTransformer(new ZoomOutPageTransformer());
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

