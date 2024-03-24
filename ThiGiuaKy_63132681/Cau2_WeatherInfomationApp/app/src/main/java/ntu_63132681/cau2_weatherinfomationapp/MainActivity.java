package ntu_63132681.cau2_weatherinfomationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tìm listview
        ListView lvDs = findViewById(R.id.lvDS);
        ArrayList<Weather> ds = new ArrayList<>();
        ds.add(new Weather("Phú Yên", "Nắng gay gắt", "29°C", R.drawable.sunny));
        ds.add(new Weather("Nha Trang", "Nắng có mây", "28°C", R.drawable.cloudy_sunny));
        ds.add(new Weather("Tp Hồ Chí Minh", "Nắng gay gắt", "29°C", R.drawable.cloudy));
        ds.add(new Weather("Hà Nội", "Mưa phùn", "17°C", R.drawable.rainy));
        ds.add(new Weather("Bình Định", "Nắng có mây", "26°C", R.drawable.wind));
        ds.add(new Weather("Sapa", "Lạnh có tuyết", "2°C", R.drawable.snowy));

        WeatherAdapter adapterWeather = new WeatherAdapter(this, ds);
        lvDs.setAdapter(adapterWeather);
    }
}