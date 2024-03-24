package tienlv.customlistview_appfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent detail_food = getIntent();
        String name = detail_food.getStringExtra("name");
        String donGia = detail_food.getStringExtra("donGia");
        String moTa = detail_food.getStringExtra("moTa");
        int img = Integer.parseInt(detail_food.getStringExtra("img"));

        TextView tvName = findViewById(R.id.tvNameDT);
        TextView tvDonGia = findViewById(R.id.tvDonGiaDT);
        TextView tvMoTa = findViewById(R.id.tvMoTaDT);
        ImageView imgDT = findViewById(R.id.imgDT);

        imgDT.setImageResource(img);
        tvName.setText(name);
        tvDonGia.setText(donGia);
        tvMoTa.setText(moTa);

    }
}