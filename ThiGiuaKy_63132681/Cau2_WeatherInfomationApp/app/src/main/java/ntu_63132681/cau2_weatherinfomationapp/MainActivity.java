package ntu_63132681.cau2_weatherinfomationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Weather> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tìm listview
        ListView lvDs = findViewById(R.id.lvDS);
        ds = new ArrayList<>();
        ds.add(new Weather("Phú Yên", "Nắng gay gắt", "29°C", R.drawable.sunny));
        ds.add(new Weather("Nha Trang", "Nắng có mây", "28°C", R.drawable.cloudy_sunny));
        ds.add(new Weather("Tp Hồ Chí Minh", "Nắng gay gắt", "29°C", R.drawable.cloudy));
        ds.add(new Weather("Hà Nội", "Mưa phùn", "17°C", R.drawable.rainy));
        ds.add(new Weather("Bình Định", "Nắng có mây", "26°C", R.drawable.wind));
        ds.add(new Weather("Sapa", "Lạnh có tuyết", "2°C", R.drawable.snowy));

        WeatherAdapter adapterWeather = new WeatherAdapter(this, ds);
        lvDs.setAdapter(adapterWeather);

        lvDs.setOnItemClickListener(ChuyenManHinh);
    }

    AdapterView.OnItemClickListener ChuyenManHinh = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Weather selected = ds.get(position);

            Intent item_select = new Intent(MainActivity.this, WeatherDetail.class);

            String tenTP = selected.getTenTP();
            String moTa = selected.getMoTaThoiTiet();
            String doC = selected.getDoC();
            String img = String.valueOf(selected.getImage());

            item_select.putExtra("tenTP", tenTP);
            item_select.putExtra("moTa", moTa);
            item_select.putExtra("do", doC);
            item_select.putExtra("img", img);


            startActivity(item_select);
        }
    };
}