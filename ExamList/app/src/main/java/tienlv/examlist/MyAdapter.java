package tienlv.examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    ArrayList<Item> dsItem;

    public MyAdapter(Context context, ArrayList<Item> dsItem) {
        this.context = context;
        this.dsItem = dsItem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item_card, parent, false);
        MyViewHolder m = new MyViewHolder(v);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item_selected = dsItem.get(position);
        String tilte = item_selected.getTilte();
        String time = item_selected.getTime();
        String graduate = item_selected.getGraduate();

        holder.tilte.setText(tilte);
        holder.time.setText(time);
        holder.graduate.setText(graduate);
    }

    @Override
    public int getItemCount() {
        return dsItem.size();
    }
}
