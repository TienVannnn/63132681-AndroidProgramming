package tienlv.viewpager2recyclerviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandscapeHolder> {
    Context context;
    ArrayList<Landscape> ds;

    public LandscapeAdapter(Context context, ArrayList<Landscape> ds) {
        this.context = context;
        this.ds = ds;
    }

    @NonNull
    @Override
    public ItemLandscapeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item_landscape, parent, false);
        ItemLandscapeHolder itemLandscapeHolder = new ItemLandscapeHolder(v);
        return itemLandscapeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandscapeHolder holder, int position) {
        // lấy đối tượng hiển thị
        Landscape landscapeSelected = ds.get(position);
        String title = landscapeSelected.getTitle();
        String img = landscapeSelected.getImg();
        holder.tvTitle.setText(title);
        String packageName = holder.itemView.getContext().getPackageName();
        int idimg = holder.itemView.getResources().getIdentifier(img, "drawable", packageName);
        holder.imgLand.setImageResource(idimg);
    }

    @Override
    public int getItemCount() {
        return ds.size();
    }

    class ItemLandscapeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvTitle;
        ImageView imgLand;

        public ItemLandscapeHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTitle = itemView.findViewById(R.id.item_title);
            imgLand = itemView.findViewById(R.id.item_img);

        }

        @Override
        public void onClick(View v) {
            int vitri = getAdapterPosition();
            Landscape item_selected = ds.get(vitri);
            String ten = item_selected.getTitle();
            Toast.makeText(v.getContext(), "Bạn chọn: " + ten, Toast.LENGTH_SHORT).show();
        }
    }

}
