package tienlv.customlistview_appfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends BaseAdapter {

    private ArrayList<Food> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public FoodAdapter(Context context, ArrayList<Food> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.item_food, null);
        }

        // lấy dữ liêệu
        Food currentFood = dsMonAn.get(position);

        // tìm điều khiển
        TextView tvName = convertView.findViewById(R.id.name);
        TextView tvDonGia = convertView.findViewById(R.id.donGia);
        TextView tvMoTa = convertView.findViewById(R.id.moTa);
        ImageView img = convertView.findViewById(R.id.img);

        // Set lên
        tvName.setText(currentFood.getTenMonAn());
        tvDonGia.setText(String.valueOf(currentFood.getDonGia()));
        tvMoTa.setText(currentFood.getMoTa());
        img.setImageResource(currentFood.getIdImage());

        return convertView;
    }
}
