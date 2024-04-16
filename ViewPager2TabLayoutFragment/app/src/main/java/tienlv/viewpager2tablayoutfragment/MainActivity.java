package tienlv.viewpager2tablayoutfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landscape> ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds =getDataViewPager2();
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        viewPager2.setAdapter(new ViewPagerAdapter(this, ds));
        viewPager2.setPageTransformer(pageTransformer);
    }
    ViewPager2.PageTransformer pageTransformer = new ViewPager2.PageTransformer() {
        @Override
        public void transformPage(@NonNull View page, float position) {
            final float MIN_SCALE = 0.75f;
            int pageWidth = page.getWidth();
            if (position < -1) {
                page.setAlpha(0f);
            } else if (position <= 0) {
                page.setAlpha(1f);
                page.setTranslationX(0f);
                page.setScaleX(1f);
                page.setScaleY(1f);
            } else if (position <= 1) {
                page.setAlpha(1 - position);
                page.setTranslationX(pageWidth * -position);
                float scaleFactor = MIN_SCALE
                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
                page.setScaleX(scaleFactor);
                page.setScaleY(scaleFactor);
            } else {
                page.setAlpha(0f);
            }
        }
    };

    ArrayList<Landscape> getDataViewPager2(){
        ArrayList<Landscape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new Landscape("Hồ Chí Minh", R.drawable.hochiminh));
        dsDuLieu.add(new Landscape("Đà Lạt", R.drawable.dalat));
        dsDuLieu.add(new Landscape("Hạ Long Bay", R.drawable.halongbay));
        dsDuLieu.add(new Landscape("Hội An", R.drawable.hoian));
        dsDuLieu.add(new Landscape("Nha Trang", R.drawable.nhatrang));
        dsDuLieu.add(new Landscape("Phong Nha Kẻ Bàng", R.drawable.phongnhakebang));
        return dsDuLieu;
    }
}