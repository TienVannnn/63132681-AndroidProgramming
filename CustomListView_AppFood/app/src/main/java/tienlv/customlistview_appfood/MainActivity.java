package tienlv.customlistview_appfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tìm listview
        ListView lvDsMonAn = findViewById(R.id.lvDsMonAn);

        ArrayList<Food> dsMonAn = new ArrayList<>();
        dsMonAn.add(new Food("Cơm tấm bình dân", 20000,"Thơm ngon", R.drawable.img1));
        dsMonAn.add(new Food("Cơm tấm sườn trứng", 25000,"Thơm ngon", R.drawable.img2));
        dsMonAn.add(new Food("Cơm tấm gà xối mỡ", 25000,"Thơm ngon", R.drawable.img3));
        dsMonAn.add(new Food("Cơm tấm sườn bì chả", 30000,"Thơm ngon", R.drawable.img4));
        dsMonAn.add(new Food("Cơm tấm đặc biệt", 40000,"Thơm ngon, bổ dưỡng, siêu nhiều topping", R.drawable.img5));
        dsMonAn.add(new Food("Cơm tấm siêu đặc biệt", 50000,"Thơm ngon", R.drawable.img6));

        FoodAdapter adapter = new FoodAdapter(this, dsMonAn);
        lvDsMonAn.setAdapter(adapter);

        lvDsMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // lấy phần tử được chọn
                Food choiceFood = dsMonAn.get(position);

                Intent selected = new Intent(MainActivity.this, Detail_Activity.class);
                String name = choiceFood.getTenMonAn();
                String donGia = String.valueOf(choiceFood.getDonGia());
                String moTa = choiceFood.getMoTa();
                String img = String.valueOf(choiceFood.getIdImage());
                selected.putExtra("name", name);
                selected.putExtra("donGia", donGia);
                selected.putExtra("moTa", moTa);
                selected.putExtra("img", img);
                startActivity(selected);
            }
        });
    }
}